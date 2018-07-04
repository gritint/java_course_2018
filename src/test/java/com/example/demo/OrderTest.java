package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {
    
    @Test
    public void createOrderHarryBook1() {
        Book book1 = new Book("H1", 8, 2);
        Book book2 = new Book("H2", 8, 2);
        Book book3 = new Book("H3", 8, 2);
        Book book4 = new Book("H4", 8, 2);
        Book book5 = new Book("H5", 8, 2);
        BookItem bookItem1 = new BookItem(book1, 2);
        BookItem bookItem2 = new BookItem(book2, 2);
        BookItem bookItem3 = new BookItem(book3, 2);
        BookItem bookItem4 = new BookItem(book4, 1);
        BookItem bookItem5 = new BookItem(book5, 1);
        Order order = new Order();
        order.addItem(bookItem1);
        order.addItem(bookItem2);
        order.addItem(bookItem3);
        order.addItem(bookItem4);
        order.addItem(bookItem5);
        order.process();
        
        assertEquals(8, order.getBookAmount());
        assertEquals(64, order.getTotalPrice(), 0.00);
        assertEquals("Discount not correct", (40 * 0.25) + (24 * 0.1), order.getDiscount(), 0.00);
        assertEquals(64 - ((40 * 0.25) + (24 * 0.1)), order.getNetPrice(), 0.00);
    }
    @Test
    public void createOrderHarryBook2() {
        Book book1 = new Book("H1", 8, 2);
        Book book2 = new Book("H2", 8, 2);
        Book book3 = new Book("H3", 8, 2);
        Book book4 = new Book("H4", 8, 2);
        Book book5 = new Book("H5", 8, 2);
        BookItem bookItem1 = new BookItem(book1, 2);
        BookItem bookItem2 = new BookItem(book2, 2);
        BookItem bookItem3 = new BookItem(book3, 2);
        BookItem bookItem4 = new BookItem(book4, 1);
        BookItem bookItem5 = new BookItem(book5, 1);
        Order order = new Order();
        order.addItem(bookItem1);
        order.addItem(bookItem2);
        order.addItem(bookItem3);
        order.addItem(bookItem4);
        order.addItem(bookItem5);
        order.process();
        
        assertEquals(8, order.getBookAmount());
        assertEquals(64, order.getTotalPrice(), 0.00);
        assertEquals("Discount not correct", (32 * 0.2) + (32 * 0.2), order.getDiscount(), 0.00);
        assertEquals(64 - ((32 * 0.2) + (32 * 0.2)), order.getNetPrice(), 0.00);
    }
     
    @Test
    public void createOrderSameOneBook() {
        Book book1 = new Book("H1", 8, 2);
        Book book2 = new Book("H2", 8, 2);
        Book book3 = new Book("H3", 8, 2);
        Book book4 = new Book("H4", 8, 2);
        Book book5 = new Book("H5", 8, 2);
        BookItem bookItem1 = new BookItem(book1, 2);
        BookItem bookItem2 = new BookItem(book2, 1);
        BookItem bookItem3 = new BookItem(book3, 1);
        BookItem bookItem4 = new BookItem(book4, 1);
        BookItem bookItem5 = new BookItem(book5, 1);
        Order order = new Order();
        order.addItem(bookItem1);
        order.addItem(bookItem2);
        order.addItem(bookItem3);
        order.addItem(bookItem4);
        order.addItem(bookItem5);
        order.process();
        
        assertEquals(6, order.getBookAmount());
        assertEquals(48, order.getTotalPrice(), 0.00);
        assertEquals("Discount not correct", 40 * 0.25, order.getDiscount(), 0.00);
        assertEquals(48 - (40 * 0.25), order.getNetPrice(), 0.00);
    }
    
    @Test
    public void createOrderWithFiveBook() {
        Book book1 = new Book("H1", 8, 2);
        Book book2 = new Book("H2", 8, 2);
        Book book3 = new Book("H3", 8, 2);
        Book book4 = new Book("H4", 8, 2);
        Book book5 = new Book("H5", 8, 2);
        BookItem bookItem1 = new BookItem(book1, 1);
        BookItem bookItem2 = new BookItem(book2, 1);
        BookItem bookItem3 = new BookItem(book3, 1);
        BookItem bookItem4 = new BookItem(book4, 1);
        BookItem bookItem5 = new BookItem(book5, 1);
        Order order = new Order();
        order.addItem(bookItem1);
        order.addItem(bookItem2);
        order.addItem(bookItem3);
        order.addItem(bookItem4);
        order.addItem(bookItem5);
        order.process();
        
        assertEquals(5, order.getBookAmount());
        assertEquals(40, order.getTotalPrice(), 0.00);
        assertEquals("Discount not correct", 40 * 0.25, order.getDiscount(), 0.00);
        assertEquals(40 - (40 * 0.25), order.getNetPrice(), 0.00);
    }
    
    @Test
    public void createOrderWithFourBook() {
        Book book1 = new Book("H1", 8, 2);
        Book book2 = new Book("H2", 8, 2);
        Book book3 = new Book("H3", 8, 2);
        Book book4 = new Book("H4", 8, 2);
        BookItem bookItem1 = new BookItem(book1, 1);
        BookItem bookItem2 = new BookItem(book2, 1);
        BookItem bookItem3 = new BookItem(book3, 1);
        BookItem bookItem4 = new BookItem(book4, 1);
        Order order = new Order();
        order.addItem(bookItem1);
        order.addItem(bookItem2);
        order.addItem(bookItem3);
        order.addItem(bookItem4);
        order.process();
        
        assertEquals(4, order.getBookAmount());
        assertEquals(32, order.getTotalPrice(), 0.00);
        assertEquals("Discount not correct", 32 * 0.2, order.getDiscount(), 0.00);
        assertEquals(32 - (32 * 0.2), order.getNetPrice(), 0.00);
    }
    
    
    @Test
    public void createOrderWithThreeBook() {
        Book book1 = new Book("H1", 8, 2);
        Book book2 = new Book("H2", 8, 2);
        Book book3 = new Book("H3", 8, 2);
        BookItem bookItem1 = new BookItem(book1, 1);
        BookItem bookItem2 = new BookItem(book2, 1);
        BookItem bookItem3 = new BookItem(book3, 1);
        Order order = new Order();
        order.addItem(bookItem1);
        order.addItem(bookItem2);
        order.addItem(bookItem3);
        order.process();
        
        assertEquals(3, order.getBookAmount());
        assertEquals(24, order.getTotalPrice(), 0.00);
        assertEquals("Discount not correct", 24 * 0.1, order.getDiscount(), 0.00);
        assertEquals(24 - (24 * 0.1), order.getNetPrice(), 0.00);
    }
    
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
        assertEquals(16 - (16 * 0.05), order.getNetPrice(), 0.00);
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
        assertEquals(8, order.getNetPrice(), 0.00);
        
    }

    @Test
    public void createEmptyOrder() {
        Order order = new Order();
        assertEquals(0, order.getBookAmount());
        assertEquals(0, order.getTotalPrice(), 0.00);
        assertEquals(0, order.getDiscount(), 0.00);
        assertEquals(0, order.getNetPrice(), 0.00);
        
    }

}
