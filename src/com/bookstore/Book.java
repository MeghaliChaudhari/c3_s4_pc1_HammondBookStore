package com.bookstore;

public class Book {
    private long isbnNumber;
    private String title;
    private String discription;
    private double price;


    public long getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(long isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void displayBookDetails(){
        System.out.println("Title : " + getTitle());
        System.out.println("ISBN Number : " + getIsbnNumber());
        System.out.println("Discription : " + getDiscription());
        System.out.println("Price : " + getPrice());
    }
}
