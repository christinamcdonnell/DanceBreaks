package com.christinads.DanceBreaks.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Christy on 10/19/2017.
 */
@Entity
public class HomePagePreviewVideos {

    @Id
    @GeneratedValue
    private int id;

    @Min(1)
    private int sequence;

    @NotNull
    @Size(min=3, max=50)
    private String title;

    @NotNull
    @Size(min=3, max=100)
    private String link;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String description;

    public HomePagePreviewVideos() { }

 /*   public User(String name, String password, String description) {
        this.name = name;
        this.password = password;
        this.description = description;
    } */

    public HomePagePreviewVideos(int sequence, String title, String link, String description) {
        this.sequence = sequence;
        this.title = title;
        this.link = link;
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public int getHomePageVideoSequence() {
        return this.sequence;
    }

    public void setHomePageVideoSequence(int homePageVideoSequence) {
        this.sequence = homePageVideoSequence;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
