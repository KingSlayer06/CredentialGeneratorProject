package com.credentials.main;

import com.credentials.exceptions.EmptyNameException;
import com.credentials.model.Employee;
import com.credentials.service.CredentialService;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employeeDatabase = new ArrayList<>();
    static int arrayIndex = -1;

    public static void main(String[] args) {

        // Continue to ask for FirstName & Lastname if they are Empty
        while (true) {
            System.out.print("Enter Firstname: ");
            String firstName = sc.nextLine();

            System.out.print("Enter Firstname: ");
            String lastName = sc.nextLine();

            // Handle Empty FirstName and LastName Exception
            try {
                employeeDatabase.add(new Employee(firstName, lastName));
                arrayIndex++;
                break;
            } catch (EmptyNameException e) {
                System.out.println(e.getMessage());
            }
        }

        showMenu();
    }

    // Menu Method to display Menu
    static void showMenu() {
        System.out.println("Please enter the department from the following");
        System.out.println("1. Technical\n2. Admin\n3. Human Resource\n4. Legal\n");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.println();

        CredentialService cs = new CredentialService();

        switch (choice) {
            case 1: cs.showCredentials(employeeDatabase.get(arrayIndex), "tech");
                break;
            case 2: cs.showCredentials(employeeDatabase.get(arrayIndex), "admin");
                break;
            case 3: cs.showCredentials(employeeDatabase.get(arrayIndex), "hr");
                break;
            case 4: cs.showCredentials(employeeDatabase.get(arrayIndex), "legal");
                break;
            default:
                System.out.println("Invalid choice !");
        }

        sc.close();
    }
}
