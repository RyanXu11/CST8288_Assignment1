/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.employee;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ContractEmployeeImpl class for contract employee
 * File: ContractEmployeeImpl.java<br>
 * Course: CST8288_033<br>
 * Assignment: Assignment 1<br>
 * Professor: Sazzad Hossain<br>
 * Date: May 26, 2024<br>
 * @version 1.0
 * @since 2024-05-22
 * @author Ryan Xu
 */
public class ContractEmployeeImpl extends Employee implements ContractEmployeeService {
    /**
     * attribute renewalDate
     */
    private Date renewalDate;
    
    /**
     * getter of renewalDate
     * @return 
     */
    public Date getRenewalDate() {
        return renewalDate;
    }
    
    /**
     * setter of renewalDate
     */
    public void setRenewalDate() {
        this.renewalDate = renewalDate();
    }
    
    /**
     * setter of totalCompensation
     */
    public void setTotalCompensation() {
        this.totalCompensation = calculateTotalCompensation(this);
    }
    
    /**
     * to calculate total Compensation of employee
     * @param employee
     * @return 
     */
    @Override
    public double calculateTotalCompensation(Employee employee) {
        return employee.getSalary();
    }

    /**
     * to calculate the renewal date of contract employee
     * @return 
     */
    @Override
    public Date renewalDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);

        return calendar.getTime();
    }
    
    /**
     * toString method
     * @return 
     */
    @Override
    public String toString() {
        // Get the string representation from the superclass
        String superString = super.toString();

        // Find the index of the closing bracket "]" in superString
        int index = superString.lastIndexOf(']');

        // Construct the final string representation
        return superString.substring(0, index) + ", renewalDate=" + renewalDate + "]";
    }

}
