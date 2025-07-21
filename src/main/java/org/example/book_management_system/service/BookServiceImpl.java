package org.example.book_management_system.service;

import org.example.book_management_system.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    private final List<Book> bookList = new ArrayList<>();


    @Override
    public void addBook(Book book) {

    }

    @Override
    public Book getBookById(int id) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return List.of();
    }

    @Override
    public void updateBookAuthor(int id, String Author) {

    }

    @Override
    public void deleteBook(int id) {

    }

    @Override
    public List<Book> findBooksByTitle(String title) {
        return List.of();
    }
}

