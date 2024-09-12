package com.crm.contacts.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Email implements Serializable{
    
    @Column(name="email")
    private String email;

    protected Email() {}
    public Email(String email) {
        this.email = email;  
    }

    public String getEmail() {
        return email;
    }

    

}
