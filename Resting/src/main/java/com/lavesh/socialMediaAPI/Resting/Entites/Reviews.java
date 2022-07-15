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


}
