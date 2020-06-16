package br.com.orion.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.orion.bank.model.Payment;

/**
 * PagmentoRepository
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

    
}