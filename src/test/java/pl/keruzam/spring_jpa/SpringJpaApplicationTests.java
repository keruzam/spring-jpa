package pl.keruzam.spring_jpa;

import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.keruzam.spring_jpa.model.BankTransaction;
import pl.keruzam.spring_jpa.repository.BankTransactionRepository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;

@SpringBootTest
public class SpringJpaApplicationTests {

	@Inject
	BankTransactionRepository repository;

	@Test
	public void shouldSaveAndLoadObject() {
		BankTransaction bankTransaction = new BankTransaction();
		bankTransaction.setOperationDate(new Date());
		bankTransaction.setOrderDate(new Date());
		bankTransaction.setQuota(new BigDecimal(123));
		bankTransaction.setNote("dodatkowa notatka");

		repository.save(bankTransaction);

		Long id = bankTransaction.getId();

		Optional<BankTransaction> loaded = repository.findById(id);

		Assertions.assertNotNull(loaded.get().getId());
		Assertions.assertEquals(loaded.get().getNote(), bankTransaction.getNote());
	}

}
