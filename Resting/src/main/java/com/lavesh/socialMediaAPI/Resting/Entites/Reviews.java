package com.lavesh.socialMediaAPI.Resting.Entites;

import javax.persistence.*;

@Entity
public class Reviews {

    @Id
    private long rev_id;
    @Column
    private long rating;
    @Column
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    private Book revBook;


    public long getRev_id() {
        return rev_id;
    }

    public void setRev_id(long rev_id) {
        this.rev_id = rev_id;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Book getRevBook() {
        return revBook;
    }

    public void setRevBook(Book revBook) {
        this.revBook = revBook;
    }
}
