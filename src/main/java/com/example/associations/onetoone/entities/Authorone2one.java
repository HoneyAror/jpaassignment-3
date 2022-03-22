package com.example.associations.onetoone.entities;
import javax.persistence.*;

@Entity
@Table(name = "author")
public class Authorone2one {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne(mappedBy = "author")
    private Bookone2one book;

    public Authorone2one() {
    }

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
}
