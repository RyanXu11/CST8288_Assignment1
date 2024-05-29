/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.controller;

import com.algonquin.cst8288.assignment1.employee.Employee;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * class EmployeeValidator to validate Employee information
 * File: EmployeeValidator.java<br>
 * Course: CST8288_033<br>
 * Assignment: Assignment 1<br>
 * Professor: Sazzad Hossain<br>
 * Date: May 26, 2024<br>
 * @version 1.0
 * @since 2024-05-22
 * @author Ryan Xu
 */
public class EmployeeValidator {
    
    private static final Pattern NAME_PATTERN = Pattern.compile("[^A-Za-z0-9\\s]");
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
    );
    
    /** 
     * Validates the Employee object
     * @param employee
     * @return 
     */
    public boolean isValidEmployee(Employee employee) {
        if (!isPresent(employee.getName())) {
            System.out.println("Validation isPresent failed.");
            return false;
        }

        if (!isValidAlphaNumeric(employee.getName())) {
            System.out.println("Validation isValidAlphaNumeric failed.");
            return false;
        }
		
        if (employee.getEmail() == null || employee.getEmail().trim().length() == 0) {
                return false;
        }

        if (!isValidEmail(employee.getEmail())) {
            System.out.println("Validation isValidEmail failed.");
            return false;
        }

     
        if (!isPositiveNumber(employee.getSalary())) {
            System.out.println("Validation getSalary failed.");
            return false;
        }

        if (!isPositiveNumber(employee.getTotalCompensation())) {
            System.out.println("Validation getTotalCompensation failed.");
            return false;
        }

        if (!isPositiveNumber(employee.getNumberOfServiceYear())) {
            System.out.println("Validation getNumberOfServiceYear failed.");
            return false;
        }

        return true;
    }

    
    /**
     * Check for null or empty
     * @param value
     * @return
     */
    private boolean isPresent(String value) {
        return value != null && value.trim().length() > 0;
    }

    
    /**
     * Check for special character
     * @param value
     * @return
     */
    private boolean isValidAlphaNumeric(String value) {
        Matcher matcher = NAME_PATTERN.matcher(value);
        return !matcher.find();
    }

    
    /**
     * Check for valid email address
     * @param value
     * @return
     */
    private boolean isValidEmail(String value) {
        Matcher matcher = EMAIL_PATTERN.matcher(value);
        return matcher.find();
    }

    
    /**
     * Check number is positive or not, which can be used for salary, compensation and serviceYear.
     * @param serviceYear
     * @return
     */
    private boolean isPositiveNumber(double number) {
        return number > 0;
    }

}
