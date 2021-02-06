package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BookDataManagerTests {
    @Test
    public void save_book_data() {
        var bm = new BookDataManager();

        var author = new Author("Gusts","Link","gst");

        var book = new Book("Burtu ābece", "12121212", Arrays.asList(author));

        bm.save(Arrays.asList(book));
    }

    @Test
    public void save_book_data_2_books() {
        var bm = new BookDataManager();

        var author = new Author("Gusts","Link","gst");
        var author2 = new Author("Jānis","Priede","JP");

        var book = new Book("Burtu ābece", "12121212", Arrays.asList(author));

        var book2 = new Book("Priedes", "333333", Arrays.asList(author, author2));

        bm.save(Arrays.asList(book, book2));
    }

    @Test
    public void save_author() {
        var bm = new BookDataManager();
        var author = new Author("Gusts","Link","gst");
        bm.saveAuthor(author);
    }

    @Test
    public void load_author() {
        var bm = new BookDataManager();
        var author = bm.loadAuthor();

        Assert.assertNotNull(author);
    }

    @Test
    public void load_books() {
        var bm = new BookDataManager();
        var books = bm.load();

        Assert.assertTrue(books.size() != 0);
    }
}
