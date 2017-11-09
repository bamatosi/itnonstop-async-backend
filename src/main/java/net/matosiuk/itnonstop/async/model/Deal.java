package net.matosiuk.itnonstop.async.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class Deal {
    private String name;
    private String description;
    private String refLink;
    private LocalDate expirationDate;

    public Deal(String name, String description, String refLink, LocalDate expirationDate) {
        this.name = name;
        this.description = description;
        this.refLink = refLink;
        this.expirationDate = expirationDate;
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

    public String getRefLink() {
        return refLink;
    }

    public void setRefLink(String refLink) {
        this.refLink = refLink;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
