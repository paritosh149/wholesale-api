package com.dummy.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.dummy.api.model.Account;

public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {
	@Override
	@RestResource(exported = false)
	<S extends Account> S save(S entity);

	@Override
	@RestResource(exported = false)
	<S extends Account >Iterable<S> saveAll(Iterable<S> entities);

	@Override
	@RestResource(exported = false)
	void deleteById(Long id) ;
	
	@Override
	@RestResource(exported = false)
	void delete(Account entity);
	
	@Override
	@RestResource(exported = false)
	void deleteAll(Iterable<? extends Account> entities) ;

	@Override
	@RestResource(exported = false)
	void deleteAll() ;

}
