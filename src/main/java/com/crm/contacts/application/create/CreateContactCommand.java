package com.crm.contacts.application.create;

import com.crm.contacts.domain.Command;

public class CreateContactCommand implements Command{

    private String lastName;

    private String firstName;

    private String mobilePhone;

    private String email;

    public CreateContactCommand(String lastName, String firstName, String mobilePhone, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.mobilePhone = mobilePhone;
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    
}
