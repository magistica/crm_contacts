package com.crm.contacts.infrastructure.persistence.repositories;

import org.springframework.stereotype.Repository;

import com.crm.contacts.domain.Contact;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ContactRepository implements com.crm.contacts.domain.ContactRepository{
    
    
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Contact contact) {
        

        entityManager.persist(contact);
    }


}
