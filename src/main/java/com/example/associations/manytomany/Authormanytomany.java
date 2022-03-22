package com.example.associations.manytomany;

import com.example.associations.onetomany.entities.Book;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="author")
public class Authormanytomany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "author_book",
            joinColumns = @JoinColumn(name="author_id",referencedColumnName = "id")
            ,inverseJoinColumns =@JoinColumn(name="book_id",referencedColumnName = "id"))
    private Set<Book> books;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(HashSet<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Authormanytomany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
