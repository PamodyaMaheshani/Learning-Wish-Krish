package com.training.rentcloud.commons.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// model class - Customer
// the customer class should annotate as @Entity
// since this is the class that has to be dealed the database.
// this model class supposed to refer from service that suppose to do the database operations.
@Entity
@Table(name = "customer")
public class Customer {

    // declare needed variables. id is the primary key and it is auto incremented.
    @Id
    @GeneratedValue
    int id;

    String firstName;
    String lastName;
    String dlNumber;
    String zipCode;

    // create getters and setters
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

    public String getDlNumber() {
        return dlNumber;
    }

    public void setDlNumber(String dlNumber) {
        this.dlNumber = dlNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
