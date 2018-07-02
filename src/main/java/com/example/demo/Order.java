package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Order {

//    private BookItem bookItem;
//    private int bookAmount;
    private double totalPrice;
    private double discount;
    private double netPrice;

    public int getBookAmount() {
//        return this.bookItem.size();
        countQuantity();
        return this.totalQuantity;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public double getDiscount() {
        return this.discount;
    }

    public double getNetPrice() {
        return this.netPrice;
    }
    
    private List<BookItem> bookItem = new ArrayList<>();
    private int totalQuantity;
//    private BookItem quantity;
    public void addItem(BookItem bookItem) {
        this.bookItem.add(bookItem);
    }
    public void countQuantity() {
        this.totalQuantity=0;
        for (BookItem book : bookItem) {
            this.totalQuantity += book.getQuantity();

}
        
    }

    public void process() {
        if (this.bookItem != null) {
            calculateTotalPrice();
            // Checksamebook
//            checksamebook();
            // calculatePrice
//            this.totalPrice = bookItem.getBook().getPrice();

            // Calculate discount
            calculateDiscount();

            // Calculate net price
            this.netPrice = getTotalPrice() - getDiscount();

        }
    }

//    private void checksamebook() {
//     for (BookItem book : bookItem) {
//        
//        
//    }   
//    }

    private void calculateDiscount() {
        this.discount = 0;
        if(getBookAmount() == 2) {
            this.discount =  getTotalPrice() * 0.05;
        }
        if(getBookAmount() == 3) {
            this.discount =  getTotalPrice() * 0.1;
        }
        if(getBookAmount() == 4) {
            this.discount =  getTotalPrice() * 0.2;
        }
        if(getBookAmount() == 5) {
            this.discount =  getTotalPrice() * 0.25;
        }
    }

//    public void addItem(BookItem bookItem) {
//        this.bookItem = bookItem;
//
//    }
    private void calculateTotalPrice() {
        for (BookItem book : bookItem) {
            this.totalPrice += book.getTotalPrice();

}
    }
}
