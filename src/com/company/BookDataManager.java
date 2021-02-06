package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class BookDataManager {

    private static final String FILE_PATH = "src/com/company/books.json";
    private static final String AUTHOR_FILE_PATH = "src/com/company/author.json";

    public List<Book> load() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(FILE_PATH);
            var data = fis.readAllBytes();
            var json = new String(data);

            Gson gson = new Gson();
            Type collectionType = new TypeToken<List<Book>>(){}.getType();
            return gson.fromJson(json, collectionType);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public Author loadAuthor() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(AUTHOR_FILE_PATH);
            var data = fis.readAllBytes();
            var json = new String(data);

            Gson gson = new Gson();
            return gson.fromJson(json, Author.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void save(List<Book> books) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        var json = gson.toJson(books);

        try {
            var writer = new BufferedWriter(new FileWriter(FILE_PATH));
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveAuthor(Author author) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        var json = gson.toJson(author);

        try {
            var writer = new BufferedWriter(new FileWriter(AUTHOR_FILE_PATH));
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
