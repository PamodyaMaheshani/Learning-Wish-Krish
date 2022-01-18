package com.training.rentcloud.commons.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// model class - Vehical
// the customer class should annotate as @Entity
// since this is the class that has to be dealed the database.
// this model class supposed to refer from service that suppose to do the database operations.
@Entity
@Table(name = "vehical")
public class Vehical {

    // declare needed variables. id is the primary key and it is auto incremented.
    @Id
    @GeneratedValue
    int id;

    String make;
    String model;
    String type;
    int year;

    // create getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
