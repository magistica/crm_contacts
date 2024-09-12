package com.crm.contacts.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LastName {
    
        @Column(name="last_name")
        private String lastName;
    
        protected LastName() {}
        public LastName(String lastName) {
            this.lastName = lastName;  
        }

        public String getLastName() {
            return lastName;
        }

        
   
    
        
    
    
}
