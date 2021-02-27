package br.com.zup.transaction;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionListener {

    @KafkaListener(topics = "${spring.kafka.topic.transaction}")
    public void listen(TransactionEvent transactionEvent) {
        System.out.println("Transacao recebida: " + transactionEvent.getId() + " | Valor: " + transactionEvent.getValor());
    }
}
