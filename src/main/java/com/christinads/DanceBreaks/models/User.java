package com.christinads.DanceBreaks.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by Christy on 8/21/2017.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=8, max=50)
    private String name;

    @NotNull
    @Size(min=8, max=15, message = "Password must not be empty")
    private String password;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String description;

    public User() { }

    public User(String name, String password, String description) {
        this.name = name;
        this.password = password;
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getPassword(){return this.password;}

    public void setPassword(String password) { this.password = password; }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*
    // the cheese TABLE stores the categoryid for the type of cheese
    // But The cheese object stores the category
    public Category getCategory() {
        return this.category;
    } // returns the category object (id & name) stored in this cheese object

    public void setCategory(Category cat) {
        this.category = cat;
    }
    */

}