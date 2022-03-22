package com.example.associations.onetoone.entities;
import javax.persistence.*;

@Entity
@Table(name = "books")
public class Bookone2one {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookName;
    @OneToOne(cascade = CascadeType.ALL)
   // @JoinColumn(name = "author_id")
    private Authorone2one author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Authorone2one getAuthor() {
        return author;
    }

    public void setAuthor(Authorone2one author) {
        this.author = author;
    }
}
