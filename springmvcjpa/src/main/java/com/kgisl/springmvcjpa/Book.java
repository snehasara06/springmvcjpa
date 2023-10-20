package com.kgisl.springmvcjpa;

import javax.persistence.Table;

@Table(name="bookTable")
public class Book {
    private int bookId;
    private String name;
    private Author author;



    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    
}
