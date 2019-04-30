package com.apache13.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.repository.CrudRepository;

import com.apache13.elasticsearch.document.Customer;

@EnableElasticsearchRepositories
public interface PagingAndSortingCustomerRepository extends CrudRepository<Customer, Integer> {

}
