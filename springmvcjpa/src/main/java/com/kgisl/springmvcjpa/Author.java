package com.kgisl.springmvcjpa;

public class Author {
    private int authorId;
    private String authorName;
    private String authorEmail;

    private Book books;


    public Book getBooks() {
        return books;
    }
    public void setBooks(Book books) {
        this.books = books;
    }
    public int getAuthorId() {
        return authorId;
    }
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getAuthorEmail() {
        return authorEmail;
    }
    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }
    
    
}
