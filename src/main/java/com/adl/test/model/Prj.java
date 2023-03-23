package com.adl.test.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "v07011209list$ProjectCase")
public class Prj {
    @Id
    @Column(name = "idRec")
    private int id;
    @Column(name = "PRJ")
    private String prj;
    @Column(name = "NamePRJ")
    private String name;
    @Column(name = "titleDocument")
    private String title;
    @Column(name = "Description")
    private String description;

    public Prj() {
    }

    public Prj(int id, String prj, String name, String title, String description) {
        this.id = id;
        this.prj = prj;
        this.name = name;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrj() {
        return prj;
    }

    public void setPrj(String prj) {
        this.prj = prj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
