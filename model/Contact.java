package model;

public class Contact{
    
        private String name;
        private String phoneNumber;
        private String emailAddress;
        // Add any other relevant attributes here
    
        public Contact(String name, String phoneNumber, String emailAddress) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailAddress = emailAddress;
        }
    
        // Add getters and setters for the attributes if needed
    
        @Override
        public String toString() {
            return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + emailAddress;
        }
    
        public String getName() {
            return this.name;
        }
}

