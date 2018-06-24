package com.inspur.database.entity;

import java.math.BigDecimal;

public class User {

    private Integer id;
    private String lastName;
    private Integer gender;
    private String email;
    private Integer d_id;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setdId(Integer d_id) {
        this.d_id = d_id;
    }

    public Integer getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public Integer getdId() {
        return d_id;
    }
}
