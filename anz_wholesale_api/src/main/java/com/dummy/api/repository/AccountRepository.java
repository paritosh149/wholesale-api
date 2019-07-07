package com.dummy.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dummy.api.model.Account;

public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {

}
