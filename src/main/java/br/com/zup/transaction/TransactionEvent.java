package br.com.zup.transaction;

import java.math.BigDecimal;

public class TransactionEvent {
    private String id;
    private BigDecimal valor;

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
