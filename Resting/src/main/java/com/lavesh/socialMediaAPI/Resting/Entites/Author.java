package com.lavesh.socialMediaAPI.Resting.Entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long authId;
    @Column
    private String authFirstName;
    @Column
    private String authLastName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author",fetch = FetchType.EAGER)
    private List<Book> book;

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

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }
}
