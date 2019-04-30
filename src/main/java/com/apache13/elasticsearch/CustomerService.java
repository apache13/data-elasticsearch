package com.apache13.elasticsearch;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repository;

	public List<Customer> findAll() {
		Iterable<Customer> iterable = repository.findAll();
		return StreamSupport.stream(iterable.spliterator(), false).collect(Collectors.toList());
	}

	public Customer save(Customer customer) {
		return repository.save(customer);
	}

	public Long count() {
		return repository.count();
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);
	}
	
	public void deleteAll() {
		repository.deleteAll();
	}

	public Optional<Customer> findById(Integer id) {
		return repository.findById(id);
	}
}
