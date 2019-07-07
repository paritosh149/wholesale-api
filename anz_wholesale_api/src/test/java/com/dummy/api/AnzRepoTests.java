package com.dummy.api;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Date;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.dummy.api.model.Account;
import com.dummy.api.repository.AccountRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AnzWholesaleApiApplication.class)
@AutoConfigurationPackage
@DataJpaTest
public class AnzRepoTests {
	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private AccountRepository repository;

	@Test
	public void accountRepoFetchOneTest() throws Exception {
		Account accountExpected = new Account();
		accountExpected.setAccountName("myAccount");
		accountExpected.setAccountNumber("6453453443");
		accountExpected.setAccountType("Savings");
		accountExpected.setBalanceDate(new Date(4564345345L));
		accountExpected.setCurrencyCode("SGD");
		accountExpected.setOpeningBalance(764564L);
		
		this.entityManager.persist(accountExpected);
		Optional<Account> account = this.repository.findById(1L);
		assertThat(account.get().getAccountName()).isEqualTo(accountExpected.getAccountName());
		assertThat(account.get().getId()).isEqualTo(1L);
	}
}
