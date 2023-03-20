package com.adl.test.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Entity
@Immutable
@Table(name = "v07011206list$7007MaterialType")
public class MaterialType {

    @Id
    @Column(name = "index")
    private Integer id;
    @Column(name = "code")
    private String code;
    @Column(name = "nameMaterial")
    private String name;
    @Column(name = "codeMt_RU")
    private String nameInDb;

    public MaterialType() {
    }

    public MaterialType(Integer id, String code, String name, String nameInDb) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.nameInDb = nameInDb;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameInDb() {
        return nameInDb;
    }

    public void setNameInDb(String nameInDb) {
        this.nameInDb = nameInDb;
    }
}
