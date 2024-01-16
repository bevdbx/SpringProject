package org.launcher.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class EventDetails extends AbstractEntity{

    @Size(max = 500, message = "Description must be max 500 characters!")
    private String description;

    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email. Try again!")
    private String contactEmail;

    @OneToOne(mappedBy = "eventDetails")
    private Event event;

    public EventDetails(@Size(max = 500, message = "Description must be max 500 characters!") String description, @NotBlank(message = "Email is required.") @Email(message = "Invalid email. Try again!") String contactEmail) {
        this.description = description;
        this.contactEmail = contactEmail;
    }

    public EventDetails() {}

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
}
