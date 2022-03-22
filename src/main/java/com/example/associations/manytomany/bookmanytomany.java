package com.example.associations.manytomany;

import com.example.associations.onetomany.entities.Author;

import javax.persistence.*;
import java.util.Set;

@Entity
public class bookmanytomany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookname;
    @ManyToMany(mappedBy = "books")
    private Set<Author> authors;

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

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

    @Override
    public String toString() {
        return "bookmanytomany{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                '}';
    }
}
