package com.example.polls.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.polls.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	@Query(value = "select * from book_tbl where title like :title%", nativeQuery = true)
	public List<Book> findByTitle(@Param("title") String title);

}
