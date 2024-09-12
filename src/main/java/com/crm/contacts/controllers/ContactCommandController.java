package com.crm.contacts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crm.contacts.application.create.CreateContactCommand;
import com.crm.contacts.application.create.CreateContactCommandHandler;
import com.crm.contacts.infrastructure.CommandBus;

import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class ContactCommandController {

    @Autowired
    private ApplicationContext context;
    
    @PostMapping("/contacts")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void postContact(@RequestBody ContactCreateRequest contactRequest) {
        
        contactRequest.setEmail("test@test.es");
        contactRequest.setFirstName("test");
        contactRequest.setLastName("test");
        contactRequest.setMobilePhone("test");
        var command = new CreateContactCommand(contactRequest.getLastName(), 
        contactRequest.getFirstName(), contactRequest.getMobilePhone(), contactRequest.getEmail());
        var commandBus = new CommandBus(context);
        
        commandBus.registerHandler(CreateContactCommand.class, CreateContactCommandHandler.class);
        commandBus.dispatch(command);
        
    }

    @GetMapping("/contacts")
    public ContactResponse getContacts() {
        
        
        return new ContactResponse();
    }
    
    
    
    
}

class ContactCreateRequest {
    private String firstName;
    private String lastName;
    private String mobilePhone;
    private String email;
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
    public String getMobilePhone() {
        return mobilePhone;
    }
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}
class ContactResponse {
    private String firstName;
    private String lastName;
    private String mobilePhone;
    private String email;
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
    public String getMobilePhone() {
        return mobilePhone;
    }
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}