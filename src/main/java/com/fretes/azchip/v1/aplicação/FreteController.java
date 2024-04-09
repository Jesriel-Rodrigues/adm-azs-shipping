package com.fretes.azchip.v1.aplicação;

import org.springframework.web.bind.annotation.RestController;

import com.fretes.azchip.v1.dominio.dtos.FreteDto;
import com.fretes.azchip.v1.dominio.dtos.put.FretePutRequest;
import com.fretes.azchip.v1.dominio.enums.StatusFrete;
import com.fretes.azchip.v1.dominio.ports.interfaces.FreteServicePort;

import java.util.List;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
    public ResponseEntity<List<FreteDto>> buscarTodosPorStatus(@RequestParam(required = false) StatusFrete status) {
        return  new ResponseEntity<>(freteServicePort.buscarTodosPorStatus(status), HttpStatus.OK);
    }
    
    @PostMapping("/cadastrar")
    public ResponseEntity<FreteDto> cadastrarFrete(@RequestBody FreteDto freteDto) {
        return  new ResponseEntity<>(freteServicePort.cadastrarFrete(freteDto), HttpStatus.CREATED);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<FretePutRequest> atualizarFrete(@RequestBody FretePutRequest fretePut) {
        return  new ResponseEntity<>(freteServicePort.atualizarFrete(fretePut), HttpStatus.CREATED);
    }

    @DeleteMapping("/remover")
    public ResponseEntity<Void> remover(@RequestBody FreteDto freteDto) {
        freteServicePort.remover(freteDto);
        return  new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }
}
