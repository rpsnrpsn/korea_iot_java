package org.example.book_management_system.model;

import org.example.chapter09_practice.util.DateUtil;

public class Book {
    private int id;
    private String title;
    private String author;
    private String createdAt;
    private String updateAt;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public String getUpdateAt() {
        return updateAt;
    }

    public void setAuthor(String author) {
        this.author = author;
        this.updateAt = DateUtil.now();
    }

    @Override
    public String toString() {
        return "Id: " + id
                + ", Title: " + title
                + ", Author: " + author
                + ", CreatedAt: " + createdAt
                + ", UpdatedAt: " + updateAt;
    }
}
