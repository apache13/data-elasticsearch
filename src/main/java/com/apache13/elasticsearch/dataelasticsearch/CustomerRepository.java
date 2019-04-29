package com.apache13.elasticsearch.dataelasticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@EnableElasticsearchRepositories
public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {

}
