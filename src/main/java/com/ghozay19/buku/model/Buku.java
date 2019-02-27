package com.ghozay19.buku.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ghozay19.buku.JsonDateSerializer;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Buku {

    @Id
    String bookId;

    String title;

    String category;

    @JsonSerialize(using= JsonDateSerializer.class)
    @Temporal(TemporalType.DATE)
    Date registered = new Date();

    int total;

    int available;

//    @OneToMany(mappedBy = "buku", cascade = CascadeType.ALL)
//    private Set<Peminjaman> peminjaman;

    public Buku() {
    }

    public Buku(String bookId, String title, String category, Date registered, int total, int available) {
        this.bookId = bookId;
        this.title = title;
        this.category = category;
        this.registered = registered;
        this.total = total;
        this.available = available;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", registered=" + registered +
                ", total=" + total +
                ", available=" + available +
                '}';
    }
}
