package com.example.polls.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.polls.model.Book;
import com.example.polls.repository.BookRepository;


@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public void saveBook(Book book) {
		bookRepository.save(book);
		
	}

	@Override
	public List<Book> getByTitle(String title) {
		List<Book> book=bookRepository.findByTitle(title);
		return book;
	}

}
