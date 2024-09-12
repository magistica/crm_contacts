package com.crm.contacts.application.create;

import org.springframework.stereotype.Service;

import com.crm.contacts.domain.Contact;
import com.crm.contacts.domain.ContactId;
import com.crm.contacts.domain.ContactRepository;
import com.crm.contacts.domain.Email;
import com.crm.contacts.domain.FirstName;
import com.crm.contacts.domain.LastName;
import com.crm.contacts.domain.MobilePhone;

@Service
public class ContactCreator {


    private ContactRepository contactRepository;
    public ContactCreator(com.crm.contacts.domain.ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public void run(ContactId contactId, Email email, FirstName firstName, LastName lastName, MobilePhone mobilePhone) {
        
        var contact = new Contact(contactId, firstName, lastName, email, mobilePhone);
        this.contactRepository.save(contact);
    }



}
