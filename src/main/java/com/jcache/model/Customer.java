package com.jcache.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by mihailkopchev on 4/11/18.
 */
@Entity
public class Customer implements Serializable{

    @Id
    private int id;
    private String firstName;
    private String lastName;

    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date dob;

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
