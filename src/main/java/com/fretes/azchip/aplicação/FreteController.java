package com.fretes.azchip.aplicação;

import org.springframework.web.bind.annotation.RestController;

import com.fretes.azchip.dominio.dtos.FreteDto;
import com.fretes.azchip.dominio.enums.StatusFrete;
import com.fretes.azchip.dominio.ports.interfaces.FreteServicePort;

import java.util.List;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("v1/frete")
@RequiredArgsConstructor
public class FreteController {
    
    private final FreteServicePort freteServicePort;


    @GetMapping("/por-status")
    public ResponseEntity<List<FreteDto>> buscarTodosPorStatus(@RequestParam(required = false) StatusFrete status) {
        return  new ResponseEntity<>(freteServicePort.buscarTodosPorStatus(status), HttpStatus.OK);
    }
    
    @PostMapping("/salvar-atualizar")
    public ResponseEntity<FreteDto> salvarEAtualizar(@RequestBody FreteDto freteDto) {
        return  new ResponseEntity<>(freteServicePort.salvarEAtualizar(freteDto), HttpStatus.CREATED);
    }

    @PostMapping("/remover")
    public ResponseEntity<Void> remover(@RequestBody FreteDto freteDto) {
        freteServicePort.remover(freteDto);
        return  new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }
}
