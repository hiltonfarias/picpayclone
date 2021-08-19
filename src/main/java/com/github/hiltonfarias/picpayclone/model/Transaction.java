package com.github.hiltonfarias.picpayclone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "TRANSACTION")
public class Transaction extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "TRANSACTION_CODE", nullable = false)
    private String code;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "TRANSACTION_ORIGIN_USER", nullable = false)
    private Users sourceUsers;

    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "TRANSACTION_TARGET_USER", nullable = false)
    private Users targetUsers;

    @Column(name = "TRANSACTION_DATE_TIME", nullable = false)
    private LocalDateTime localDateTime;

    @Column(name = "TRANSACTION_VALUE", nullable = false)
    private Double value;

}
