package br.com.zup.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

public class TransactionEvent {
    private String id;

    private String cardNumber;

    @JsonProperty("valor")
    private BigDecimal value;

    @JsonProperty("efetivadaEm")
    private LocalDateTime carriedOutAt;

    public String getCardNumber() {
        return cardNumber;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public LocalDateTime getCarriedOutAt() {
        return carriedOutAt;
    }

    public CardTransaction toModel() {
        return new CardTransaction(cardNumber, value, carriedOutAt);
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("cartao")
    private void unpackNested(Map<String, Object> card) {
        cardNumber = (String) card.get("id");
    }
}
