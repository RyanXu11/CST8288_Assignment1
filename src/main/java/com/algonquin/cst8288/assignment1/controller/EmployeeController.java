package com.algonquin.cst8288.assignment1.controller;

//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

import com.algonquin.cst8288.assignment1.employee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import java.io.IOException;

/**
 * Process, validate and save employee data.
 * File: EmployeeController.java<br>
 * Course: CST8288_033<br>
 * Assignment: Assignment 1<br>
 * Professor: Sazzad Hossain<br>
 * Date: May 26, 2024<br>
 * @version 1.0
 * @since 2024-05-22
 * @author Ryan Xu
 */
public class EmployeeController {
    private final EmployeeValidator validator;
    private final PersistenceService persistenceService;

    /**
     * constructor with two parameters
     * @param validator
     * @param persistenceService 
     */
    public EmployeeController(EmployeeValidator validator,
            PersistenceService persistenceService) {
        this.validator = validator;
        this.persistenceService = persistenceService;
    }

    /**
     * This method is used to save Employee information to files, whether it's 
     * a contract employee or a permanent employee
     * @param employee
     * @param filename
     * @param append
     * @return
     * @throws IOException 
     */
    public boolean saveEmployeeToFile(Employee employee, String filename, boolean append) throws IOException {
        // Validate the employee
        if (!validator.isValidEmployee(employee)) {
            System.out.println("Validation failed.");
            return false;
        }

        // Save the employee if validation passed
        persistenceService.saveEmployee(employee, filename, append);
        return true;
    }

    
    /**
     * Print Employee in console
     * @param employee
     * @throws IOException 
     */
    public void printEmployeeInConsole(Employee employee) throws IOException {
        System.out.println(persistenceService.getFormatter().format(employee));
    }
}