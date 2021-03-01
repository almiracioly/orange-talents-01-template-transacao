package br.com.zup.transaction;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Component
public class TransactionListener {

    private EntityManager entityManager;

    public TransactionListener(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @KafkaListener(topics = "${spring.kafka.topic.transaction}")
    @Transactional
    public void listen(TransactionEvent transactionEvent) {
        CardTransaction cardTransaction = transactionEvent.toModel();
        entityManager.persist(cardTransaction);
    }
}
