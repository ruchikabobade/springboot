package com.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.model.Author;
import com.demo.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	AuthorRepository authorRepository;

	//	private List<Author> authors = new ArrayList<>( Arrays.asList(
	//			new Author(1,"Shalini","Suspense"),
	//			new Author(2,"Meera","Comedy"),
	//			new Author(3 ,"Pankaj","Adventure")
	//		));
	public List<Author> getAllAuthors()
	{
		List<Author> authors = new ArrayList<>();
		this.authorRepository.findAll().forEach(authors::add);
		return authors;
	}
	public Author getAuthor(int id) {
		return this.authorRepository.findById(id).get();
	}		
	public void addAuthor(Author author)
	{
		this.authorRepository.save(author);
	}
	public void updateAuthor(Author author)
	{
		this.authorRepository.save(author);
	}
	public void deleteAuthor(int id)
	{
		this.authorRepository.deleteById(id);

	}
}
