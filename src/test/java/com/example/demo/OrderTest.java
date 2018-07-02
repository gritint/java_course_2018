package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {
    
    @Test
    public void createOrderWithTwoBook() {
        Book book1 = new Book("H1", 8, 2);
        Book book2 = new Book("H2", 8, 2);
        BookItem bookItem1 = new BookItem(book1, 1);
        BookItem bookItem2 = new BookItem(book2, 1);
        Order order = new Order();
        order.addItem(bookItem1);
        order.addItem(bookItem2);
        order.process();
      
        assertEquals(2, order.getBookAmount());
        assertEquals(16, order.getTotalPrice(), 0.00 );
        assertEquals("Discount not correct", 16 * 0.05, order.getDiscount(), 0.00);
        assertEquals(16 - (16 * 0.05), order.getNetlPrice(), 0.00);
        }
    @Test
    public void createOrderWithOneBook() {
        Book book1 = new Book("H1", 8, 2);
        
        BookItem bookItem = new BookItem(book1, 1);
        Order order = new Order();
        order.addItem(bookItem);
        order.process();
        
        assertEquals(1, order.getBookAmount());
        assertEquals(8, order.getTotalPrice(),0.00 );
        assertEquals(0, order.getDiscount(), 0.00);
        assertEquals(8, order.getNetlPrice(), 0.00);
        
    }

    @Test
    public void createEmptyOrder() {
        Order order = new Order();
        assertEquals(0, order.getBookAmount());
        assertEquals(0, order.getTotalPrice(), 0.00);
        assertEquals(0, order.getDiscount(), 0.00);
        assertEquals(0, order.getNetlPrice(), 0.00);
        
    }

}
