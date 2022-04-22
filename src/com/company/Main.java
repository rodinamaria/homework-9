package com.company;

import com.company.homework9.Author;
import com.company.homework9.Book;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Ivan", "Ivanov");
        Book book = new Book("Book1", author, 2010);
        System.out.println(book.getTitle() + " " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLasttName()
                + " " + book.getYear());

        book.setYear(2020);
        System.out.println(book.getTitle() + " " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLasttName()
                + " " + book.getYear());

    }
}
