package com.algonquin.cst8288.assignment1.employee;

import java.util.Date;

/**
 * EmployeeService interface
 * File: EmployeeService.java<br>
 * Course: CST8288_033<br>
 * Assignment: Assignment 1<br>
 * Professor: Sazzad Hossain<br>
 * Date: May 26, 2024<br>
 * @version 1.0
 * @since 2024-05-22
 * @author Ryan Xu
 */

public interface EmployeeService {

        /**
         * abstract method to calculate total compensation which should be implemented in sub-class
         * @param employee
         * @return 
         */
	public double calculateTotalCompensation(Employee employee);
			
}

