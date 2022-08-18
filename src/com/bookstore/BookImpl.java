package com.bookstore;

public class BookImpl {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.setTitle("AbC");
        obj.setIsbnNumber(123456789012L);
        obj.setDiscription("XYZ");
        obj.setPrice(500);

        obj.displayBookDetails();

        Author obj1 = new Author();
        obj1.setAuthorName("PQR");
        obj1.setAuthorPenName("GH");
        System.out.println(obj1.toString());
    }
}
