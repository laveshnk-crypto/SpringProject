package com.lavesh.socialMediaAPI.Resting.Entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long authId;
    @Column
    private String authFirstName;
    @Column
    private String authLastName;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "auth_id")
    private List<Book> bookList = new ArrayList<>();

    public long getAuthId() {
        return authId;
    }

    public void setAuthId(long authId) {
        this.authId = authId;
    }

    public String getAuthFirstName() {
        return authFirstName;
    }

    public void setAuthFirstName(String authFirstName) {
        this.authFirstName = authFirstName;
    }

    public String getAuthLastName() {
        return authLastName;
    }

    public void setAuthLastName(String authLastName) {
        this.authLastName = authLastName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
