package com.christinads.DanceBreaks.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Christy on 3/20/2018.
 */
@Entity
public class DanceRole {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=8, max=50)
    private String dancername;

    @NotNull
    private int dancetype_id;

    @NotNull
    private String role;

    @NotNull
    private String competition_level;;

    @NotNull
    private String practice_level;

    public DanceRole() { }

    public DanceRole(String dancername, int dancetype_id, String role, String competition_level, String practice_level) {
        this.dancername = dancername;
        this.dancetype_id = dancetype_id;
        this.role = role;
        this.competition_level = competition_level;
        this.practice_level = practice_level;
    }

    public int getId() {
        return this.id;
    }

    public String getDancername() {
        return this.dancername;
    }

    public void setDancername(String dancername) {
        this.dancername = dancername;
    }

    public int getDancetype_id(){ return this.dancetype_id; }

    public void setDancetype_id(int dancetype_id) { this.dancetype_id = dancetype_id; }

    public enum DancerRole {LEAD, FOLLOW); //********************check this DOES THIS NEED TO BE IT'S OWN CLASS?

    public String getRole() { return this.role; }

    public void setRole(DancerRole role) { this.role = role; }


    public enum Level {NEWCOMER, NOVICE, INTERMEDIATE, ADVANCED, ALLSTAR, CHAMPION);   //********************check this DOES THIS NEED TO BE IT'S OWN CLASS?

    public String getCompetition_level() {
        return this.competition_level;
    }

    public void setCompetition_level(Level competition_level) {
        this.competition_level = competition_level;
    }

    public String getPractice_level() {
        return this.practice_level;
    }

    public void setPractice_level(Level practice_level) {
        this.practice_level = practice_level;
    }

}