package br.com.zup.transaction.detailedcardtransaction;

import br.com.zup.transaction.CardTransaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DetailedCardTransactionResponse {
    private Long id;

    private String cardNumber;

    private BigDecimal value;

    private LocalDateTime carriedOutAt;

    DetailedCardTransactionResponse(CardTransaction cardTransaction) {
        this.id = cardTransaction.getId();
        this.cardNumber = cardTransaction.getCardNumber();
        this.value = cardTransaction.getValue();
        this.carriedOutAt = cardTransaction.getCarriedOutAt();
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
