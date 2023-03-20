package com.adl.test.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "v07011208list$7001AssemblyDetType")
public class AssemblyType {
    @Id
    @Column(name = "index")
    private int id;
    private String code;
    @Column(name = "nameAssemblyDetails")
    private String name;
    @Column(name = "codeMt_RU")
    private String nameInDb;

    public AssemblyType() {
    }

    public AssemblyType(int id, String code, String name, String nameInDb) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.nameInDb = nameInDb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
