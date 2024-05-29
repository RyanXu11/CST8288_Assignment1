package com.algonquin.cst8288.assignment1.employee;

import java.util.Date;

/**
 * Employee class for employ basic information
 * File: Employee.java<br>
 * Course: CST8288_033<br>
 * Assignment: Assignment 1<br>
 * Professor: Sazzad Hossain<br>
 * Date: May 26, 2024<br>
 * @version 1.0
 * @since 2024-05-22
 * @author Ryan Xu
 */
public class Employee {

	private String name;
	private String email;
	private String address;
	private double salary;
	private int numberOfServiceYear;
	double totalCompensation;


        /**
         * default constructor of Employee
         */
	public Employee() {
            // Default constructor
	}

        /**
         * getter of name
         * @return 
         */
	public String getName() {
            return name;
	}

        /**
         * setter of name
         * @param name 
         */
	public void setName(String name) {
            this.name = name;
	}

        /**
         * getter of email
         * @return 
         */
	public String getEmail() {
            return email;
	}

        /**
         * setter of email
         * @param email 
         */
	public void setEmail(String email) {
            this.email = email;
	}

        /**
         * getter of address
         * @return 
         */
	public String getAddress() {
            return address;
	}

        /**
         * setter of address
         * @param address 
         */
	public void setAddress(String address) {
            this.address = address;
	}

        /**
         * getter of salary
         * @return 
         */
	public double getSalary() {
            return salary;
	}

        /**
         * setter of salary
         * @param salary 
         */
	public void setSalary(double salary) {
            this.salary = salary;
	}

        /**
         * getter of numberOfServiceYear
         * @return 
         */
	public int getNumberOfServiceYear() {
            return numberOfServiceYear;
	}

        /**
         * setter of numberOfServiceYear
         * @param numberOfServiceYear 
         */
	public void setNumberOfServiceYear(int numberOfServiceYear) {
            this.numberOfServiceYear = numberOfServiceYear;
	}

        /**
         * getter of totalCompensation
         * @return 
         */
	public double getTotalCompensation() {
            return totalCompensation;
	}        
        
        /**
         * toString method
         * @return 
         */
	@Override
	public String toString() {
            return "Employee [name=" + name + ", email=" + email + ", address=" + address + ", salary=" + salary
                    + ", numberOfServiceYear=" + numberOfServiceYear + ", totalCompensation="
                    + totalCompensation + "]";
	}

}