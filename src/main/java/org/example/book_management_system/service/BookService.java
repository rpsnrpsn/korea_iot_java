package org.example.book_management_system.service;


import org.example.book_management_system.model.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);

    Book getBookById(int id);

    List<Book> getAllBooks();

    void updateBookAuthor(int id, String Author);

    void deleteBook(int id);

    List<Book> findBooksByTitle(String title);
}

