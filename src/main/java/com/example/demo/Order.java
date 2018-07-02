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
        return this.bookItem.size();
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public double getDiscount() {
        return this.discount;
    }

    public double getNetlPrice() {
        return this.netPrice;
    }
    
    private List<BookItem> bookItem = new ArrayList<>();
    public void addItem(BookItem bookItem) {
        this.bookItem.add(bookItem);
    }

    public void process() {
        if (this.bookItem != null) {
            calculateTotalPrice();

//            // calculatePrice
//            this.totalPrice = bookItem.getBook().getPrice();

            // Calculate discount
            calculateDiscount();

            // Calculate net price
            this.netPrice = getTotalPrice() - getDiscount();

        }
    }

    private void calculateDiscount() {
        this.discount = 0;
        if(getBookAmount() == 2) {
            this.discount =  getTotalPrice() * 0.05;
        }
        if(getBookAmount() == 3) {
            this.discount =  getTotalPrice() * 0.1;
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
