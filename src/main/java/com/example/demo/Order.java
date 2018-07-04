package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Order {

    // private BookItem bookItem;
    // private int bookAmount;
    private double totalPrice;
    private double discount;
    private double netPrice;
    private int difbook;
    private double finalSumDiscount;

    public int getBookAmount() {
        // return this.bookItem.size();
        countQuantity();
        return this.totalQuantity;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public double getDiscount() {
        // return this.discount;
        return this.finalSumDiscount;
    }

    public double getNetPrice() {
        return this.netPrice;
    }

    private List<BookItem> bookItem = new ArrayList<>();
    private int totalQuantity;
    private int quantity1;
    private int quantity2;
    private int quantity3;
    private int quantity4;
    private int quantity5;
    private int totalQuantity2;
    private double sumDiscount1;
    private double sumDiscount2;
    private double perPrice1;
    private double perPrice2;
    private double perPrice3;
    private double perPrice4;
    private double perPrice5;
    private double allPrice;

    // private BookItem quantity;
    public void addItem(BookItem bookItem) {
        this.bookItem.add(bookItem);
    }

    public void countQuantity() {
        this.totalQuantity = 0;
        for (BookItem book : bookItem) {
            this.totalQuantity += book.getQuantity();

        }

    }

    public void process() {
        if (this.bookItem != null) {
            calculateTotalPrice();
            // Checksamebook
            checkDiscountType();
            // calculatePrice
            // this.totalPrice = bookItem.getBook().getPrice();

            // Calculate discount
            // calculateDiscount();

            // Calculate net price
            this.netPrice = getTotalPrice() - getDiscount();

        }
    }

    private void checkDiscountType() {
        totalQuantity2 = 0;
        this.sumDiscount1 = 0;
        this.sumDiscount2 = 0;

        for (BookItem book : bookItem) {
            if (book.getName() == "H1") {
                quantity1 = book.getQuantity();
                perPrice1 = book.getPerPrice();
            }
            if (book.getName() == "H2") {
                quantity2 = book.getQuantity();
                perPrice2 = book.getPerPrice();
            }
            if (book.getName() == "H3") {
                quantity3 = book.getQuantity();
                perPrice3 = book.getPerPrice();
            }
            if (book.getName() == "H4") {
                quantity4 = book.getQuantity();
                perPrice4 = book.getPerPrice();
            }
            if (book.getName() == "H5") {
                quantity5 = book.getQuantity();
                perPrice5 = book.getPerPrice();
            }
            totalQuantity2 += book.getQuantity();
        }
        if (totalQuantity2 > 1) {
            if (totalQuantity2 <= 6) {
                calDiscountType1();
            }else {
            if (totalQuantity2 % 2 != 0) {
                calDiscountType1();
            } else {
                calDiscountType2();
            }
            }
        } else {
            this.finalSumDiscount = 0;
        }

    }

    private void calDiscountType2() {
        for (int i = 0; i < totalQuantity2;) {
            difbook = 0;
            allPrice = 0.00;

            if (quantity1 > 0 && difbook < totalQuantity2 / 2) {
                difbook += 1;
                quantity1 -= 1;
                allPrice += perPrice1;
            }
            if (quantity2 > 0 && difbook < totalQuantity2 / 2) {
                difbook += 1;
                quantity2 -= 1;
                allPrice += perPrice2;
            }
            if (quantity3 > 0 && difbook < totalQuantity2 / 2) {
                difbook += 1;
                quantity3 -= 1;
                allPrice += perPrice3;
            }
            if (quantity4 > 0 && difbook < totalQuantity2 / 2) {
                difbook += 1;
                quantity4 -= 1;
                allPrice += perPrice4;
            }
            if (quantity5 > 0 && difbook < totalQuantity2 / 2) {
                difbook += 1;
                quantity5 -= 1;
                allPrice += perPrice5;
            }
            if (difbook > 1) {
                calculateDiscount();
                this.sumDiscount2 += this.discount;
            }
            i += difbook;
        }
        this.finalSumDiscount = this.sumDiscount2;
    }

    private void calDiscountType1() {
        for (int i = 0; i < totalQuantity2;) {
            difbook = 0;
            allPrice = 0.00;

            if (quantity1 > 0) {
                difbook += 1;
                quantity1 -= 1;
                allPrice += perPrice1;
            }
            if (quantity2 > 0) {
                difbook += 1;
                quantity2 -= 1;
                allPrice += perPrice2;
            }
            if (quantity3 > 0) {
                difbook += 1;
                quantity3 -= 1;
                allPrice += perPrice3;
            }
            if (quantity4 > 0) {
                difbook += 1;
                quantity4 -= 1;
                allPrice += perPrice4;
            }
            if (quantity5 > 0) {
                difbook += 1;
                quantity5 -= 1;
                allPrice += perPrice5;
            }

            if (difbook > 1) {
                calculateDiscount();
                this.sumDiscount1 += this.discount;
            }
            i += difbook;
        }
        this.finalSumDiscount = this.sumDiscount1;
    }

    private void calculateDiscount() {
        this.discount = 0;
        // if(getBookAmount() == 2) {
        // this.discount = getTotalPrice() * 0.05;
        // }
        // if(getBookAmount() == 3) {
        // this.discount = getTotalPrice() * 0.1;
        // }
        // if(getBookAmount() == 4) {
        // this.discount = getTotalPrice() * 0.2;
        // }
        // if(getBookAmount() == 5) {
        // this.discount = getTotalPrice() * 0.25;
        // }
        // if (difbook == 2) {
        // this.discount = getTotalPrice() * 0.05;
        // }
        // if (difbook == 3) {
        // this.discount = getTotalPrice() * 0.1;
        // }
        // if (difbook == 4) {
        // this.discount = getTotalPrice() * 0.2;
        // }
        // if (difbook == 5) {
        // this.discount = getTotalPrice() * 0.25;
        // }
        if (difbook == 2) {
            this.discount = allPrice * 0.05;
        }
        if (difbook == 3) {
            this.discount = allPrice * 0.1;
        }
        if (difbook == 4) {
            this.discount = allPrice * 0.2;
        }
        if (difbook == 5) {
            this.discount = allPrice * 0.25;
        }
    }

    // public void addItem(BookItem bookItem) {
    // this.bookItem = bookItem;
    //
    // }
    private void calculateTotalPrice() {
        for (BookItem book : bookItem) {
            this.totalPrice += book.getTotalPrice();

        }
    }
}
