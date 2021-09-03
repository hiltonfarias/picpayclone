package com.github.hiltonfarias.picpayclone.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDTO {

    @NotBlank
    private String code;

    @NotNull
    private UsersDTO usersDTOOrigin;

    @NotNull
    private UsersDTO usersDTOReceiver;

    @NotNull
    private LocalDateTime dateTime;

    @NotNull
    private Double value;

    private CreditCardDTO creditCardDTO;

    private Boolean isCreditCard = false;
}
