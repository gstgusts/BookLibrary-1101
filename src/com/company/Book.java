package com.company;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String isbnCode;
    private List<Author> authors = new ArrayList<>();

    public Book(String title, String isbnCode, List<Author> authors) {
        this.title = title;
        this.isbnCode = isbnCode;
        this.authors = authors;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
