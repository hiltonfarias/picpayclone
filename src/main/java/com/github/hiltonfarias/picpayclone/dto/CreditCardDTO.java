package com.github.hiltonfarias.picpayclone.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.hiltonfarias.picpayclone.enums.CreditCardBanner;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreditCardDTO {

    @NotBlank
    private CreditCardBanner creditCardBanner;

    @NotBlank
    private String securityCode;

    @NotBlank
    private String expirationDate;

    @NotBlank
    private String cardholderName;

    private String number;

    private String tokenNumber;

    @NotNull
    private UsersDTO usersDTO;

    private Boolean isSave = false;

}
