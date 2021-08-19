package com.github.hiltonfarias.picpayclone.enums;

public enum CreditCardBanner {
    VISA("Visa"), MASTERCARD("Master Card"), ELO("Elo");
    private final String description;

    CreditCardBanner(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
