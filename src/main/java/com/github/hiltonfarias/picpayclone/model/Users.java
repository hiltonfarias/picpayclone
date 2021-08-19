package com.github.hiltonfarias.picpayclone.model;

import com.github.hiltonfarias.picpayclone.enums.PermissionType;
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
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "USERS")
public class Users extends BaseEntity{

    @Column(name = "USER_LOGIN", nullable = false)
    private String login;

    @Column(name = "USER_PASSWORD", nullable = false)
    private String passWord;

    @Column(name = "USER_EMAIL", nullable = false)
    private String email;

    @Column(name = "USER_FULL_NAME", nullable = false)
    private String fullName;

    @Column(name = "USER_CPF", nullable = false)
    private String cpf;

    @Column(name = "USER_BIRTH_DATE", nullable = false)
    private LocalDate birthDate;

    @Column(name = "USER_TELEPHONE_NUMBER", nullable = false)
    private String telephoneNumber;

    @OneToMany(mappedBy = "users", fetch = FetchType.EAGER, cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<CreditCard> creditCards;

    @Column(name = "USER_BALANCE", nullable = false)
    private Double balance;

    @Column(name = "USER_ACTIVE", nullable = false)
    private Boolean active;

    @Enumerated(EnumType.STRING)
    @Column(name = "USER_PERMISSION", nullable = false)
    private PermissionType permissionType;
}
