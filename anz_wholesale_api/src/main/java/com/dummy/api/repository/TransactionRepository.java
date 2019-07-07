package com.dummy.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dummy.api.model.Transaction;

public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Long> {

}
