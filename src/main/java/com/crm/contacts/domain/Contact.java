package com.crm.contacts.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


    
@Entity
@Table(name="contacts")
public class Contact {
    @EmbeddedId
    private ContactId id;
    @Embedded
    private FirstName firstName;
    @Embedded
    private LastName lastName;
    @Embedded
    private Email email;
    @Embedded
    private MobilePhone mobilePhone;

    public Contact(ContactId id, FirstName firstName, LastName lastName, Email email, MobilePhone mobilePhone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobilePhone = mobilePhone;
    }
    public ContactId getId() {
        return id;
    }
    public FirstName getFirstName() {
        return firstName;
    }
    public LastName getLastName() {
        return lastName;
    }
    public Email getEmail() {
        return this.email;
    }
    public MobilePhone getMobilePhone() {
        return mobilePhone;
    }


    

}
