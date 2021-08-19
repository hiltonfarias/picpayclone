package com.github.hiltonfarias.picpayclone.model;

import com.github.hiltonfarias.picpayclone.enums.CreditCardBanner;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "CREDIT_CARD")
public class CreditCard extends BaseEntity{

    @Column(name = "CREDIT_CARD_NUMBER", nullable = false)
    private String number;

    @Enumerated(EnumType.STRING)
    @Column(name = "CREDIT_CARD_BANNER", nullable = false)
    private CreditCardBanner creditCardBanner;

    @Column(name = "CREDIT_CARD_TOKEN")
    private String tokenNumber;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "CREDIT_CARD_USER_ID")
    private Users users;
}
