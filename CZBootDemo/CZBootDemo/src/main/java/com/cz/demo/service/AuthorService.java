package com.cz.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.cz.demo.model.Author;

@Service
public class AuthorService {

	private List<Author> authors = new ArrayList<>( Arrays.asList(
			new Author(1,"Shalini","Suspense"),
			new Author(2,"Meera","Comedy"),
			new Author(3 ,"Pankaj","Adventure")
		));
	public List<Author> getAllAuthors()
	{
		return this.authors;
	}
	public Author getAuthor(int id) {
		return authors.stream().filter(t -> t.getId()==(id)).findFirst().get();
	}		
		public void addAuthor(Author author)
		{
			authors.add(author);
		}
		public void updateAuthor(Author topic,int id)
		{
			for(int i=0;i<authors.size();i++)
			{
				Author t=authors.get(i);
				if(t.getId()==id)
				{
					authors.set(i, topic);
					break;
				}
			}

		}
		public void deleteAuthor(int id)
		{
			authors.removeIf(t->t.getId()==(id));

		}
}
