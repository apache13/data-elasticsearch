package com.apache13.elasticsearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataElasticsearchApplication implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(DataElasticsearchApplication.class);
	
	@Autowired
	private CustomerService customerService;
	
	public static void main(String[] args) {
		SpringApplication.run(DataElasticsearchApplication.class, args).close();
	}

	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Jame");
		customer.setAge(30);
		
		customerService.save(customer);	
		//customerService.findAll().stream().forEach(c->logger.info(c.toString()));
		//customerService.deleteAll();
		//customerService.findAll().stream().forEach(c->logger.info(c.toString()));
	}

}
