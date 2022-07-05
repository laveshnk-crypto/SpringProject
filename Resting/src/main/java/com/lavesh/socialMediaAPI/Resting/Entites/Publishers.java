package com.lavesh.socialMediaAPI.Resting.Entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Publishers {

    @Id
    private long pub_id;
    @Column
    private String publisherName;

//    @ManyToMany
//    private List<Book> pubBook;

    public long getPub_id() {
        return pub_id;
    }

    public void setPub_id(long pub_id) {
        this.pub_id = pub_id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

//    public List<Book> getPubBook() {
//        return pubBook;
//    }
//
//    public void setPubBook(List<Book> pubBook) {
//        this.pubBook = pubBook;
//    }
}
