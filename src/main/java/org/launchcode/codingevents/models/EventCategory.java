package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EventCategory extends AbstractEntity{

    private String name;


    // Constructors
    public EventCategory(String name) {
        this.name = name;
    }

    public EventCategory(){}


    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
