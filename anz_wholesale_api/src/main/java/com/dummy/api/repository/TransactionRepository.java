package com.dummy.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.dummy.api.model.Transaction;

public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Long> {
	@Override
	@RestResource(exported = false)
	<S extends Transaction> S save(S entity);

	@Override
	@RestResource(exported = false)
	<S extends Transaction> Iterable<S> saveAll(Iterable<S> entities);

	@Override
	@RestResource(exported = false)
	void deleteById(Long id) ;

	@Override
	@RestResource(exported = false)
	void delete(Transaction entity) ;

	@Override
	@RestResource(exported = false)
	void deleteAll(Iterable<? extends Transaction> entities) ;

	@Override
	@RestResource(exported = false)
	void deleteAll() ;

}
