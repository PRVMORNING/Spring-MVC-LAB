package com.greatlearning.springMvcdemo;


import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface Bookservice {
	public void save(Book book);
	public void deleteId(int bookId);
	public Book findBook(int bookId);
	public List<Book> findAll();
	
	public List<Book> searchBy(String bookName,String author);

}
