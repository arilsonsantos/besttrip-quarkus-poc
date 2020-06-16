package br.com.orion.bank.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.orion.bank.model.dto.MessageReturnDto;
import br.com.orion.bank.model.dto.PaymentDto;
import br.com.orion.bank.service.PagamentoService;

import lombok.AllArgsConstructor;

/**
 * PagamentoController
 */
@RestController
@RequestMapping(path = "payment")
@AllArgsConstructor
public class PaymentController {
    
    private final PagamentoService service;

    @PostMapping
    public ResponseEntity<MessageReturnDto> pagamento(@Valid @RequestBody PaymentDto pagamentoDto){
        service.pagamento(pagamentoDto);
        MessageReturnDto retorno = MessageReturnDto.builder().message("Payment has done.").build();
        
        return new ResponseEntity<>(retorno, HttpStatus.CREATED);
    }
    
}