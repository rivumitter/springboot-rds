package com.wipro.SpringBootRDS.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.wipro.SpringBootRDS.model.Books;

@Service
public interface BookRepo extends JpaRepository<Books,Integer>{

}
