package com.crm.contacts.application.create;



import org.springframework.stereotype.Service;

import com.crm.contacts.domain.ContactId;
import com.crm.contacts.domain.Email;
import com.crm.contacts.domain.FirstName;
import com.crm.contacts.domain.LastName;
import com.crm.contacts.domain.MobilePhone;
import com.crm.contacts.infrastructure.CommandHandler;

@CommandHandler
@Service
public class CreateContactCommandHandler implements com.crm.contacts.domain.CommandHandler<CreateContactCommand>{

    ContactCreator creator;
    CreateContactCommandHandler(ContactCreator contactCreator) {
        this.creator = contactCreator;
    }

    @Override
    public void handle(CreateContactCommand command) {
        ContactId contactId = new ContactId();
        LastName lastName = new LastName(command.getLastName());
        FirstName firstName = new FirstName(command.getFirstName());
        MobilePhone mobilePhone = new MobilePhone(command.getMobilePhone());
        Email email = new Email(command.getEmail());
        this.creator.run(contactId, email, firstName, lastName,mobilePhone);
    }

    
    
    
}




