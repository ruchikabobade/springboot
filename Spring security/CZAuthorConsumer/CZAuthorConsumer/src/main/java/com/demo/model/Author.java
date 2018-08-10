package com.demo.model;


public class Author {


	private int id;
	private String name;
	private String genre;
	private int port;
	public Author() {
		// TODO Auto-generated constructor stub
	}	
	public Author(int id, String name, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", genre=" + genre + "]";
	}
	
}
