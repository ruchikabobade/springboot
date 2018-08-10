package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Author;
import com.demo.service.AuthorService;
@RestController
@RequestMapping("authors")
public class AuthorController {

	@Autowired
	AuthorService authorService;
	@GetMapping
	public List<Author> getAllAuthors()
	{
		return authorService.getAllAuthors();
	}
	@RequestMapping("/{id}")
	public Author getAuthor(@PathVariable("id")int id)
	{
		return authorService.getAuthor(id);
	}
	@PostMapping
	public String addtAuthor(@RequestBody Author author)
	{
		System.out.println(author);
		authorService.addAuthor(author);
		return  "inserted successfully";
	}
	@PutMapping()
	public String updateAuthor(@RequestBody Author author)
	{
		System.out.println(author);
		authorService.updateAuthor(author);
		return  "updated successfully";
	}
	@DeleteMapping("/{id}")
	public String deleteAuthor(@PathVariable("id")int id)
	{
		System.out.println(id);
		authorService.deleteAuthor(id);
		return  "deleted successfully";
	}
	
}
