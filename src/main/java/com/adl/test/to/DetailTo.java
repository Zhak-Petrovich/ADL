package com.adl.test.to;

import java.util.Date;

public class DetailTo {
        private Integer id;
        private String projectCase;
        private String article;
        private String nameDetail;
        private String materialType;
        private String assemblyType;
        private Integer v1;
        private Integer v2;
        private Integer detailQuantity;
        private Date ddate;
        private String fullName;
        private String lifeVersion;
        private String description;

        public DetailTo() {
        }

        public DetailTo(Integer id, String projectCase, String article, String nameDetail, String materialType, String assemblyType, Integer v1, Integer v2, Integer detailQuantity, Date ddate, String fullName, String lifeVersion, String description) {
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

        public Integer getId() {
            return id;
        }

        public void setId (Integer id) {
            this.id = id;
        }

        public String getProjectCase() {
            return projectCase;
        }

        public void setProjectCase(String projectCase) {
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

        public String getMaterialType() {
            return materialType;
        }

        public void setMaterialType(String materialType) {
            this.materialType = materialType;
        }

        public String getAssemblyType() {
            return assemblyType;
        }

        public void setAssemblyType(String assemblyType) {
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

        public String getLifeVersion() {
            return lifeVersion;
        }

        public void setLifeVersion(String lifeVersion) {
            this.lifeVersion = lifeVersion;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
}
