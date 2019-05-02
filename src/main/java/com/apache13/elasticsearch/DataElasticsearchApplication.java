package com.apache13.elasticsearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.apache13.elasticsearch.document.Customer;
import com.apache13.elasticsearch.repository.CustomerRepository;

@SpringBootApplication
public class DataElasticsearchApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DataElasticsearchApplication.class, args).close();
	}

	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Jame");
		customer.setAge(30);

		System.out.println("save : "+ repository.save(customer));
		System.out.println("count : " + repository.count());
		System.out.println("existsById : "+ repository.existsById(1));
		System.out.println("findById : "+ repository.findById(1).get());		
		System.out.println("findAll : "+ repository.findAll());		
		repository.deleteAll();
	}

}
