package com.apache13.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import com.apache13.elasticsearch.document.Customer;

@EnableElasticsearchRepositories
public interface CustomerRepository extends ElasticsearchRepository<Customer, Integer> {

}
