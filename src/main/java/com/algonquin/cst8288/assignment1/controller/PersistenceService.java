/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.controller;

import com.algonquin.cst8288.assignment1.employee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * This class is used to save Employee information to file, JSON or text format
 * File: PersistenceService.java<br>
 * Course: CST8288_033<br>
 * Assignment: Assignment 1<br>
 * Professor: Sazzad Hossain<br>
 * Date: May 26, 2024<br>
 * @version 1.0
 * @since 2024-05-22
 * @author Ryan Xu
 */
public class PersistenceService {
    /**
     * add final before Formatter
     */
    private final Formatter formatter;

    /**
     * constructor with one parameter
     * @param formatter 
     */
    public PersistenceService(Formatter formatter) {
        this.formatter = formatter;
    }

    /**
     * getter for formatter
     * @return 
     */
    public Formatter getFormatter() {
        return formatter;
    }
    
    /**
     * Write data into file
     * use the high level Employee and Formatter
     * @param employee
     * @param filename
     * @param append
     * @throws IOException 
     */
    public void saveEmployee(Employee employee, String filename, boolean append) throws IOException {
//        Formatter formatter = new JSONFormatter();  // This vialates Dependency Inversion Principle 
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename, append))) {
            writer.println(formatter.format(employee));
            writer.flush();
        }
    }
}
