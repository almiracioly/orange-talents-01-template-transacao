package br.com.zup.transaction.detailedcardtransaction;

import br.com.zup.transaction.CardTransaction;
import br.com.zup.transaction.CardTransactionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DetailedCardTransactionController {

    private CardTransactionRepository cardTransactionRepository;

    public DetailedCardTransactionController(CardTransactionRepository cardTransactionRepository) {
        this.cardTransactionRepository = cardTransactionRepository;
    }

    @GetMapping("card/{cardNumber}/transactions")
    public ResponseEntity exec(@PathVariable String cardNumber) {
        if (!cardTransactionRepository.existsByCardNumber(cardNumber)) return ResponseEntity.notFound().build();

        List<CardTransaction> cardTransactions = cardTransactionRepository.findLast10ByCardNumber(cardNumber);
        return ResponseEntity.ok(new DetailedCardTransactionResponseList(cardTransactions));

    }

}
