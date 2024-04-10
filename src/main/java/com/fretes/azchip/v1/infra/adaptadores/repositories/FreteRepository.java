package com.fretes.azchip.v1.infra.adaptadores.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Service;

import com.fretes.azchip.exceptions.ResourceNotFoundException;
import com.fretes.azchip.v1.dominio.model.Frete;
import com.fretes.azchip.v1.dominio.ports.repositories.FreteRepositoryPort;
import com.fretes.azchip.v1.infra.adaptadores.entities.FreteEntity;
import com.fretes.azchip.v1.infra.adaptadores.repositories.spring.SpringFreteRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FreteRepository implements FreteRepositoryPort{

    private final SpringFreteRepository springFreteRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Page<Frete> buscarTodosPorStatus(String parametro) {

        String query = "SELECT f FROM FreteEntity f WHERE " +
                "f.nomePacote LIKE :parametro OR " +
                "f.enderecoRemetente.nomeRua LIKE :parametro OR " +
                "f.enderecoDestinatario.nomeRua LIKE :parametro";

        TypedQuery<FreteEntity> typedQuery = entityManager.createQuery(query, FreteEntity.class);
        typedQuery.setParameter("parametro", "%" + parametro + "%");

        // Configura a consulta para retornar resultados paginados
        typedQuery.setFirstResult(1);
        typedQuery.setMaxResults(10);

        List<FreteEntity> resultados = typedQuery.getResultList();

        // Consulta para contar o total de resultados
        String countQuery = "SELECT COUNT(f) FROM FreteEntity f WHERE " +
                "f.nomePacote LIKE :parametro OR " +
                "f.enderecoRemetente.nomeRua LIKE :parametro OR " +
                "f.enderecoDestinatario.nomeRua LIKE :parametro";

        TypedQuery<Long> countTypedQuery = entityManager.createQuery(countQuery, Long.class);
        countTypedQuery.setParameter("parametro", "%" + parametro + "%");

        Long totalResultados = countTypedQuery.getSingleResult();

        List<Frete> responses = resultados.stream()
                .map(FreteEntity::toFrete)
                .collect(Collectors.toList());

        return new PageImpl<>(responses, PageRequest.of(1, 10), totalResultados);
    }

    @Override
    public Frete buscarPorUuid(UUID uuid) {
        Optional<FreteEntity> freteOpt = springFreteRepository.findById(uuid);

        if (freteOpt.isPresent()) {
            return freteOpt.get().toFrete();
        }

        throw new ResourceNotFoundException("Frete Não encontrado");
    }

    @Override
    public Frete cadastrarFrete(Frete frete) {

        FreteEntity freteEntity = new FreteEntity(frete);

        freteEntity = springFreteRepository.save(freteEntity);
        
        return freteEntity.toFrete();
    }

    @Override
    public Frete atualizarFrete(Frete frete) {

        buscarPorUuid(frete.getUuid());
        
        FreteEntity freteEntity = new FreteEntity(frete);
        freteEntity = springFreteRepository.save(freteEntity);
        
        return freteEntity.toFrete();
    }

    @Override
    public void remover(Frete frete) {
        
        FreteEntity freteEntity = new FreteEntity(frete);

        springFreteRepository.delete(freteEntity);
    }
}
