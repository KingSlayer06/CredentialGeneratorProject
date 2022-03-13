package com.credentials.model;

import com.credentials.exceptions.EmptyNameException;

public class Employee {
    private String firstName, lastName;

    // Variable to store company name
    public static final String companyName = "amazon";

    // Employee class constructor
    public Employee(String firstName, String lastName) {
        // handle empty name exception
        if (firstName.isEmpty())
             throw new EmptyNameException("Firstname cannot be Empty.");
        if (lastName.isEmpty())
             throw new EmptyNameException("Lastname cannot be Empty.");

        // Initialize firstname & lastname
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters & Setters
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
