package pl.keruzam.spring_jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bank_transaction")
public class BankTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_bank_transaction")
	@SequenceGenerator(name = "s_bank_transaction", sequenceName = "s_bank_transaction", allocationSize = 10)
	Long id;

	@Column(name = "operation_date")
	Date operationDate;

	@Column(name = "order_date")
	Date orderDate;

	@Column(name = "quota")
	BigDecimal quota;

	@Column(name = "note")
	String note;
}
