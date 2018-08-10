package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer>{
	
}
