package com.example.polls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.polls.model.Book;
import com.example.polls.service.BookServiceImpl;



@RestController
@RequestMapping("/api/book")
public class BookController {

	@Autowired
	BookServiceImpl bookServiceImpl;
	
	@PostMapping("/saveBook")
	public String saveBook(@RequestBody Book book)
	{
		bookServiceImpl.saveBook(book);
		return "Book save successfully";
	}
	
	@GetMapping("/getBook/{title}")
	public List<Book> getBookByTitle(@PathVariable String title)
	{
		List<Book> book=bookServiceImpl.getByTitle(title);
		return book;
	}

}
