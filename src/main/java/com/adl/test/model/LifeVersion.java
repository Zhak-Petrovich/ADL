package com.adl.test.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "v07011207list$7232LifeDet")
public class LifeVersion {
    @Id
    @Column(name = "index")
    private Integer id;
    @Column(name = "nameDetails")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "DestinationName")
    private String destinationName;
    @Column(name = "Value")
    private String value;

    public LifeVersion() {
    }

    public LifeVersion(Integer id, String name, String description, String destinationName, String value) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.destinationName = destinationName;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
