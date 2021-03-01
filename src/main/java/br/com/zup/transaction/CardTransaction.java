package br.com.zup.transaction;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class CardTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String cardNumber;

    @Column(nullable = false)
    private BigDecimal value;

    @Column(nullable = false)
    private LocalDateTime carriedOutAt;

    @Deprecated
    public CardTransaction() {
    }

    public CardTransaction(String cardNumber, BigDecimal value, LocalDateTime carriedOutAt) {
        this.cardNumber = cardNumber;
        this.value = value;
        this.carriedOutAt = carriedOutAt;
    }

    public Long getId() {
        return id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public BigDecimal getValue() {
        return value;
    }

    public LocalDateTime getCarriedOutAt() {
        return carriedOutAt;
    }
}
