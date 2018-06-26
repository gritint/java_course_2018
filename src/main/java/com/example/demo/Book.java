package com.example.demo;

//  POJO (Plain Old Java Object)
//  Getter/Setter
public class Book {
    //Variable
    //Static variable
    final int a=0; //immutable = can't change value when set
    //None-static
    private String name;
    private double price;
    private int stock;
    // Constructor
    public Book(String name, double price, int stock) {
        super();
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    // public Method
    // private Method
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + stock;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (stock != other.stock)
            return false;
        return true;
    }
    
    public double getPrice() {
        return this.price;
    }
}
