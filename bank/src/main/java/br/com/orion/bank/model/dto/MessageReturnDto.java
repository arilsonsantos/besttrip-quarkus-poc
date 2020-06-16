package br.com.orion.bank.model.dto;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * RetornoDto
 */
@Builder
@JsonInclude(Include.NON_NULL)
public class MessageReturnDto {

    @Getter
    @Setter
    private String message;

    @Getter
    Map<String, String> errors;

}