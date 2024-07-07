package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Catalog {
    HashMap<String, List<Book>> booksByAuthor;

    List<Book> searchByAuthor(String authorName) {
        return booksByAuthor.getOrDefault(authorName, new ArrayList<>());
    }
}
