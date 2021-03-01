package br.com.zup.transaction.detailedcardtransaction;

import br.com.zup.transaction.CardTransaction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DetailedCardTransactionResponseList {
    private List<DetailedCardTransactionResponse> cardTransactions = new ArrayList<>();

    public DetailedCardTransactionResponseList(List<CardTransaction> cardTransactions) {
        if (!cardTransactions.isEmpty()) {
            this.cardTransactions.addAll(cardTransactions
                    .stream()
                    .map(DetailedCardTransactionResponse::new)
                    .collect(Collectors.toList()));
        }
    }

    public List<DetailedCardTransactionResponse> getCardTransactions() {
        return cardTransactions;
    }
}
