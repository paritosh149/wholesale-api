package com.dummy.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.Date;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.dummy.api.model.Account;
import com.dummy.api.repository.AccountRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AnzWholesaleApiApplication.class)
@AutoConfigureMockMvc
public class AnzWholesaleApiApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Test
	public void accountsWebFetchOneTest() throws Exception{
		
		this.mvc.perform(get("/accounts/1"))
		.andExpect(status().isOk())
		;
	}

}
