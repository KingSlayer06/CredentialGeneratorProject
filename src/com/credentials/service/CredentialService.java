package com.credentials.service;

import com.credentials.model.Employee;

import java.util.Random;

import static com.credentials.model.Employee.companyName;

public class CredentialService {
    // Generate email address
    private String generateEmailAddress(Employee employee, String department) {
        return employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@" + department + "." + companyName + ".com";
    }

    // Generate a random password including characters, numbers & symbols
    private String generatePassword() {
        Random random = new Random();

        String password = "";
        for (int i = 0; i <= 7; i++) {
            // Generate a random ASCII value between (33 to 123)
            // Which includes all digits, characters & symbols
            password += (char) random.nextInt(33, 123);
        }
        return password;
    }

    // show credentials to User
    public void showCredentials(Employee employee, String department) {
        System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
        System.out.println("Email: " + this.generateEmailAddress(employee, department));
        System.out.println("Password: " + this.generatePassword());
    }
}
