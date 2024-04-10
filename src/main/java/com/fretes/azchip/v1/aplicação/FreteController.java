package com.fretes.azchip.v1.aplicação;

import org.springframework.web.bind.annotation.RestController;

import com.fretes.azchip.v1.dominio.dtos.put.FretePutRequest;
import com.fretes.azchip.v1.dominio.dtos.request.FreteDto;
import com.fretes.azchip.v1.dominio.dtos.response.FreteResponse;
import com.fretes.azchip.v1.dominio.enums.StatusFrete;
import com.fretes.azchip.v1.dominio.ports.interfaces.FreteServicePort;

import jakarta.validation.Valid;

import java.util.List;

import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("v1/frete")
@RequiredArgsConstructor
public class FreteController {
    
    private final FreteServicePort freteServicePort;


    @GetMapping("/por-status")
    public ResponseEntity<Page<FreteResponse>> buscarTodosPorStatus(@RequestParam(required = false) String parametro) {
        return  new ResponseEntity<>(freteServicePort.buscarTodosPorStatus(parametro), HttpStatus.OK);
    }
    
    @PostMapping("/cadastrar")
    public ResponseEntity<FreteResponse> cadastrarFrete(@Valid @RequestBody FreteDto freteDto) {
        return  new ResponseEntity<>(freteServicePort.cadastrarFrete(freteDto), HttpStatus.CREATED);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<FreteResponse> atualizarFrete(@Valid @RequestBody FretePutRequest fretePut) {
        return  new ResponseEntity<>(freteServicePort.atualizarFrete(fretePut), HttpStatus.CREATED);
    }

    @DeleteMapping("/remover/{freteUuid}")
    public ResponseEntity<Void> remover(@PathVariable String freteUuid) {
        freteServicePort.remover(freteUuid);
        return  new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }
}
