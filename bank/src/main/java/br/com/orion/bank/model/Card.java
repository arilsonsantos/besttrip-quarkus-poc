package br.com.orion.bank.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@Table(name = "CARD")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Card {
    
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "CARD_NUMBER")
    private Integer cardNumber;

    @Column(name = "SECURITY_CODE")
    private Integer securityCode;

    @Column(name = "CREDIT_AMOUNT")
    private BigDecimal creditAmount; 
}