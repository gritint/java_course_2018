package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {
    
//    @Test
//    public void createOrderWithTwoBook() {
//        Book book1 = new Book("H1", 8, 2);
//        Book book2 = new Book("H2", 8, 2);
//        BookItem bookItem = new BookItem(book1, 1);
//        Order order = new Order();
//        order.addItem(bookItem);
//        order.process();
//        
//        assertEquals(2, order.getBookAmountl());
//        assertEquals(16, order.getTotalPrice(),2 );
//        assertEquals(16*0.05, order.getDiscount(), 0.00);
//        assertEquals(16-(16*0.05), order.getNetlPrice(), 0.00);
        
    @Test
    public void createOrderWithOneBook() {
        Book book1 = new Book("H1", 8, 2);
        
        BookItem bookItem = new BookItem(book1, 1);
        Order order = new Order();
        order.addItem(bookItem);
        order.process();
        
        assertEquals(1, order.getBookAmountl());
        assertEquals(8, order.getTotalPrice(),2 );
        assertEquals(0, order.getDiscount(), 2);
        assertEquals(8, order.getNetlPrice(), 2);
        
    }

    @Test
    public void createEmptyOrder() {
        Order order = new Order();
        assertEquals(0, order.getBookAmountl());
        assertEquals(0, order.getTotalPrice(),2 );
        assertEquals(0, order.getDiscount(), 2);
        assertEquals(0, order.getNetlPrice(), 2);
        
    }

}
