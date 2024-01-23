package edu.ntnu.idatt2003.lectures.equality.eks4.hashcode;

import java.util.HashMap;
import java.util.Map;

public class Library {
    public static void main(String[] args) {
        Map<String, Book> books = new HashMap<>();

        for (int i = 1; i <= 1_000_000; i++) {
            String isbn = "978-3-16-148410-" + i;
            String title = "Book " + i;
            books.put(isbn, new Book(isbn, title));
        }

        // Retrieving a book by ISBN without using hashCode
        long startTime = System.nanoTime();
        String isbnToRetrieve = "978-3-16-148410-998810";
        Book book = books.get(isbnToRetrieve);
        if (book != null) {
            System.out.println("Book found: " + book.getTitle());
        } else {
            System.out.println("Book not found");
        }

        long endTime = System.nanoTime();
        long durationInNano = endTime - startTime;
        double durationInMilliseconds = (double) durationInNano / 1_000_000;

        System.out.println("Time taken to find the book: " + durationInMilliseconds + " milliseconds");
    }
}
