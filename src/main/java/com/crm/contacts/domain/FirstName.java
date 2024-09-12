package com.crm.contacts.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class FirstName {
    
        @Column(name="first_name")
        private String firstName;
    
        protected FirstName() {}
        public FirstName(String firstName) {
            this.firstName = firstName;  
        }

        public String getFirstName() {
            return firstName;
        }
   
    
        
    
    
}
