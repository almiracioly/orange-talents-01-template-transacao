package br.com.zup.transaction;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardTransactionRepository extends JpaRepository<CardTransaction, Long> {

    boolean existsByCardNumber(String cardNumber);

    List<CardTransaction> findLast10ByCardNumber(String cardNumber);

}
