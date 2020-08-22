package com.wipro.SpringBootRDS;

import java.awt.print.Book;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.SpringBootRDS.model.Books;
import com.wipro.SpringBootRDS.service.BookRepo;

@SpringBootApplication
public class SpringBootRdsApplication {

	@Autowired
	BookRepo bookRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRdsApplication.class, args);
	}

	
	@PostConstruct
	public void saveBooks() {
		
		bookRepo.save(new Books("React"));
		bookRepo.save(new Books("Angular"));
	}
	
}
