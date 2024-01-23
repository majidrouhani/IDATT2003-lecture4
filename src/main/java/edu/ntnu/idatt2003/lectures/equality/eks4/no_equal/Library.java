package edu.ntnu.idatt2003.lectures.equality.eks4.no_equal;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        for (int i = 1; i <= 1_000_000; i++) {
            String isbn = "978-3-16-148410-" + i;
            String title = "Book " + i;
            books.add(new Book(isbn, title));
        }

        // Retrieving a book by ISBN without using hashCode
        long startTime = System.nanoTime();
        Book bookToRetrieve = new Book("978-3-16-148410-99840", "Book 99840");

        //Does not work if equal is not overriden in Book!
        if (books.contains(bookToRetrieve)) {
            System.out.println("Book found in the list");
        } else {
            System.out.println("Book not found in the list");
        }
        long endTime = System.nanoTime();
        long durationInNano = endTime - startTime;
        double durationInMilliseconds = (double) durationInNano / 1_000_000;

        System.out.println("Time taken to find the book: " + durationInMilliseconds + " milliseconds");
    }
}