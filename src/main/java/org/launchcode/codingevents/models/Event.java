package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.Objects;

@Entity
public class Event extends AbstractEntity{



    //private static int nextId = 1;

    @NotBlank(message="Name can't be blank")
    @Size(min=3, max=50, message="Name must be between 3 and 50 characters")
    private String name;

    @Size(max=500, message="Description too long!")
    private String description;

    @NotBlank(message="Email can't be blank")
    @Email(message="Invalid email. Try again.")
    private String contactEmail;

    @NotBlank(message="Must have a location.")
    @NotNull(message="Must have a location.")
    private String location;

    private boolean registration;

    @Min(1)
    private int numberOfAttendees;

    private EventType type;

    public Event(String name, String description, String location, int numberOfAttendees, String contactEmail, EventType type, boolean registration) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.type=type;
        this.location = location;
        this.registration = registration;
        this.numberOfAttendees = numberOfAttendees;
    }

    public Event(){}

    //Getters and Setters
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

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    @Override
    public String toString() {
        return name;
    }


}
