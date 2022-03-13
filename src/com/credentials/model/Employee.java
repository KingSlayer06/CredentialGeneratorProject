package com.credentials.model;

import com.credentials.exceptions.EmptyNameException;

public class Employee {
    private String firstName, lastName;

    public static final String companyName = "amazon";

    public Employee(String firstName, String lastName) {
        //if (firstName.isEmpty())
        //     throw new EmptyNameException("Firstname cannot be Empty.");
        // if (lastName.isEmpty())
        //     throw new EmptyNameException("Lastname cannot be Empty.");

        this.firstName = firstName;
        this.lastName = lastName;
    }

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
}
