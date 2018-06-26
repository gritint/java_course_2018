package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

    @Test
    public void createBookWithConstructor() {
       Book book1 = new Book("H1", 8, 2);
       Book book2 = new Book("H1", 8, 2);
       assertEquals(book1, book2);
    }
        
}
