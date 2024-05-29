package com.algonquin.cst8288.assignment1.persistence;

import java.io.IOException;
import com.algonquin.cst8288.assignment1.employee.Employee;

/**
 * Formatter interface
 * File: Formatter.java<br>
 * Course: CST8288_033<br>
 * Assignment: Assignment 1<br>
 * Professor: Sazzad Hossain<br>
 * Date: May 26, 2024<br>
 * @version 1.0
 * @since 2024-05-22
 * @author Ryan Xu
 */
public interface Formatter {
	/**
         * abstract method format will be implemented in subclass
         * @param employee
         * @return
         * @throws IOException 
         */
	public String format(Employee employee) throws IOException;
	
}

