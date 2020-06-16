package br.com.orion.bank.model.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * PagamentoDto
 */
@Getter
@Setter
public class PaymentDto {

    @NotNull(message = "Card number can't be null.")
    private Integer cardNumber;

    @NotNull(message = "Security code can't be null")
    private Integer securityCode;

    @NotNull(message = "Bill amount can't be null")
    private BigDecimal billAmount;


}