package com.example.associations.onetomany.entities;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookname;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
