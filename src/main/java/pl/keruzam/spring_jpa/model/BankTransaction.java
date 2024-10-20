package pl.keruzam.spring_jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "bank_transaction")
public class BankTransaction {

	@Id
	@SequenceGenerator(name = "s_bank_transaction", sequenceName = "s_bank_transaction")
	Long id;
	
	String description;

	BigDecimal quota;

	String extra_note;
}
