package com.wipro.SpringBootRDS.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_book")
public class Books {

	@Id
	@GeneratedValue
	Integer id;
	
	String book_name;

	
	
	public Books() {
	
	}



	public Books(String book_name) {
		
		this.book_name = book_name;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getBook_name() {
		return book_name;
	}



	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", book_name=" + book_name + "]";
	}
	
	
	
}

