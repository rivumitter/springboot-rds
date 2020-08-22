package com.wipro.SpringBootRDS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.SpringBootRDS.model.Books;
import com.wipro.SpringBootRDS.service.BookRepo;
import java.util.*;

@RestController
public class BookController {

	@Autowired
	BookRepo bookRepo;
	
	@GetMapping("/")
	public String welcome() {
		
		return "Welcome!!";
	}
	
	@PostMapping("/books/save")
	public Books saveBooks(@RequestBody Books book) {
		
		return bookRepo.save(book);
		
	}
	
	
	@GetMapping("/books")
	public List<Books> getAll(){
		
		return bookRepo.findAll();
	}
}
