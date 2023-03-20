package com.adl.test.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "v07011205insert$detailsArticle")
public class Detail {
    @Id
    @Column(name = "idRec")
    private int id;

    @Column(name = "PRJ")
    @Nullable
    private Integer projectCase;

    @Column(name = "Article")
    private String article;

    @Column(name = "NameDetails")
    private String nameDetail;

    @Column(name = "tMater")
    private Integer materialType;

    @Column(name = "tAssem")
    private Integer assemblyType;

    @Column(name = "V1")
    private Integer v1;

    @Column(name = "V2")
    private Integer v2;

    @Column(name = "col_a")
    private Integer detailQuantity;


    @Column(name = "ddate")
    @Temporal(TemporalType.DATE)
    private Date ddate;

    @Column(name = "FullCodeDoc")
    private String fullName;

    @Column(name = "lifeVersionDet")
    private Integer lifeVersion;

    @Column(name = "Description")
    private String description;

    public Detail() {
    }

    public Detail(int id, Integer projectCase, String article, String nameDetail, Integer materialType, Integer assemblyType, Integer v1, Integer v2, Integer detailQuantity, Date ddate, String fullName, Integer lifeVersion, String description) {
        this.id = id;
        this.projectCase = projectCase;
        this.article = article;
        this.nameDetail = nameDetail;
        this.materialType = materialType;
        this.assemblyType = assemblyType;
        this.v1 = v1;
        this.v2 = v2;
        this.detailQuantity = detailQuantity;
        this.ddate = ddate;
        this.fullName = fullName;
        this.lifeVersion = lifeVersion;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getProjectCase() {
        return projectCase;
    }

    public void setProjectCase(Integer projectCase) {
        this.projectCase = projectCase;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getNameDetail() {
        return nameDetail;
    }

    public void setNameDetail(String nameDetail) {
        this.nameDetail = nameDetail;
    }

    public Integer getMaterialType() {
        return materialType;
    }

    public void setMaterialType(Integer materialType) {
        this.materialType = materialType;
    }

    public Integer getAssemblyType() {
        return assemblyType;
    }

    public void setAssemblyType(Integer assemblyType) {
        this.assemblyType = assemblyType;
    }

    public Integer getV1() {
        return v1;
    }

    public void setV1(Integer v1) {
        this.v1 = v1;
    }

    public Integer getV2() {
        return v2;
    }

    public void setV2(Integer v2) {
        this.v2 = v2;
    }

    public Integer getDetailQuantity() {
        return detailQuantity;
    }

    public void setDetailQuantity(Integer detailQuantity) {
        this.detailQuantity = detailQuantity;
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getLifeVersion() {
        return lifeVersion;
    }

    public void setLifeVersion(Integer lifeVersion) {
        this.lifeVersion = lifeVersion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
