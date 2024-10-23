package pl.keruzam.spring_jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.keruzam.spring_jpa.model.BankTransaction;

@Repository
public interface BankTransactionRepository extends CrudRepository<BankTransaction, Long> {
}
