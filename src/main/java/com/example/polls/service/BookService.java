package com.example.polls.service;

import java.util.List;

import com.example.polls.model.Book;


public interface BookService {

	public void saveBook(Book book);
	public List<Book> getByTitle(String title);
}
