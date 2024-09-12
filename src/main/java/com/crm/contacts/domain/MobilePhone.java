package com.crm.contacts.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class MobilePhone {
    
        @Column(name="mobile_phone")
        private String mobilePhone;
    
        protected MobilePhone() {}
        public MobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;  
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        
   
    
        
    
    
}
