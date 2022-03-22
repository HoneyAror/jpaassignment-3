package com.example.associations.onetomany.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Embedded
    private Address address;
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL,fetch = FetchType.EAGER)//author owns mapping author has primary key
    //@JoinColumn(name="author_id")
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

    public void setBooks(Set<Book> books) {
        this.books = books;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
