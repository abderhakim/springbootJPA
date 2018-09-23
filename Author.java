package com.abel.myhakimwebapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fname;
    private String lname;


    @ManyToMany(mappedBy = "lisauthors")
    private Set<Book> listbooks= new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Author() {
    }

    public Author(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public Author(String fname, String lname, Set<Book> listbooks) {
        this.fname = fname;
        this.lname = lname;
        this.listbooks = listbooks;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Set<Book> getListbooks() {
        return listbooks;
    }

    public void setListbooks(Set<Book> listbooks) {
        this.listbooks = listbooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", listbooks=" + listbooks +
                '}';
    }
}
