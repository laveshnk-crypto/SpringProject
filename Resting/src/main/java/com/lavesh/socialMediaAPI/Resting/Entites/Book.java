package com.lavesh.socialMediaAPI.Resting.Entites;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.time.*;

@Entity
@Table(name = "book")
public class Book{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookId;
    @Column
    private String bookName;

    @Column
    private LocalDate bookDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "auth_Id")
    private Author author;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "revBook")
    private List<Reviews> reviews;

//    @ManyToMany(mappedBy = "pubBook")
//    @JoinColumn(name = "publisher_id")
//    private List<Publishers> publishers;


    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Reviews> getReviews() {
        return reviews;
    }

    public void setReviews(List<Reviews> reviews) {
        this.reviews = reviews;
    }

    public LocalDate getBookDate() {
        return bookDate;
    }

    public void setBookDate(LocalDate bookDate) {
        this.bookDate = bookDate;
    }
//
//    public List<Publishers> getPublishers() {
//        return publishers;
//    }
//
//    public void setPublishers(List<Publishers> publishers) {
//        this.publishers = publishers;
//    }
}
