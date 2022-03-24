package com.greglturnquist.payroll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void validJobYearsSuccess(){
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "ring bearer";
        String jobTitle = "Ring holder";
        int jobYears = 10;
        Employee employee = new Employee(firstName, lastName, description, jobTitle, jobYears);
    }

    @Test
    void validFirstNameFailEmptyValue(){
        Exception exception = assertThrows(Exception.class, () -> {
            String lastName = "Baggins";
            String description = "ring bearer";
            String jobTitle = "Ring holder";
            int jobYears = 10;
            Employee employee = new Employee(null, lastName, description, jobTitle, jobYears);
        });

        String expectedMessage = "Invalid first name";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void validLastNameFailEmptyValue(){
        Exception exception = assertThrows(Exception.class, () -> {
            String firstName = "Frodo";
            String description = "ring bearer";
            String jobTitle = "Ring holder";
            int jobYears = 10;
            Employee employee = new Employee(firstName, null, description, jobTitle, jobYears);
        });

        String expectedMessage = "Invalid last name";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void validDescriptionFailEmptyValue(){
        Exception exception = assertThrows(Exception.class, () -> {
            String firstName = "Frodo";
            String lastName = "Baggins";
            String jobTitle = "Ring holder";
            int jobYears = 10;
            Employee employee = new Employee(firstName, lastName, null, jobTitle, jobYears);
        });

        String expectedMessage = "Invalid description";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void validJobTitleFailEmptyValue(){
        Exception exception = assertThrows(Exception.class, () -> {
            String firstName = "Frodo";
            String lastName = "Baggins";
            String description = "ring bearer";
            int jobYears = 10;
            Employee employee = new Employee(firstName, lastName, description, null, jobYears);
        });

        String expectedMessage = "Invalid job title";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}