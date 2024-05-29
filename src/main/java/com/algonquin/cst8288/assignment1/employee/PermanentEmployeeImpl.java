/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.employee;

import static com.algonquin.cst8288.assignment1.controller.Rate.BONUS_PERCENTAGE;
import static com.algonquin.cst8288.assignment1.controller.Rate.PENSION_PERCENTAGE;

/**
 * PermanentEmployeeImpl class for permanent employee
 * File: PermanentEmployeeImpl.java<br>
 * Course: CST8288_033<br>
 * Assignment: Assignment 1<br>
 * Professor: Sazzad Hossain<br>
 * Date: May 26, 2024<br>
 * @version 1.0
 * @since 2024-05-22
 * @author Ryan Xu
 */
public class PermanentEmployeeImpl extends Employee implements PermanentEmployeeService {
    /**
     * The bonus should be positive
     */
    private double bonus;
    
    /**
     * The pension should be positive
     */
    private double pension;
    
    /**
     * default constructor
     */
    public PermanentEmployeeImpl(){
    
    }
    
    /**
     * getter of bonus
     * @return 
     */
    public double getBonus(){
        return bonus;
    }
    
    /**
     * setter of bonus
     * @param employee 
     */
    public void setBonus(Employee employee){
        this.bonus = this.calculateBonus(employee);
    }

    /**
     * getter of pension
     * @return 
     */
    public double getPension(){
        return pension;
    }
    
    /**
     * setter of pension
     * @param employee 
     */
    public void setPension(Employee employee){
        this.pension = this.pensionContribution(employee);
    }
    
    /**
     * setter of total compensation
     */
    public void setTotalCompensation() {
        this.totalCompensation = calculateTotalCompensation(this);
    }
    
    /**
     * this method is used to calculate total compensation
     * @param employee
     * @return 
     */
    @Override
    public double calculateTotalCompensation(Employee employee) {
        return employee.getSalary() + calculateBonus(employee);
    }

    /**
     * this method is used to calculate bonus
     * @param employee
     * @return 
     */
    @Override
    public double calculateBonus(Employee employee) {
        return employee.getSalary() * BONUS_PERCENTAGE * employee.getNumberOfServiceYear();
    }

    /**
     * this method is used to calculate pension
     * @param employee
     * @return 
     */
    @Override
    public double pensionContribution(Employee employee) {
        return employee.getSalary() * PENSION_PERCENTAGE;
    }

    /**
     * toString()
     * @return 
     */
    @Override
    public String toString() {
        // Get the string representation from the superclass
        String superString = super.toString();

        // Find the index of the closing bracket "]" in superString
        int index = superString.lastIndexOf(']');

        // Construct the final string representation
        return superString.substring(0, index) + ", bonus=" + bonus + ", pension=" + pension + "]";
    }
}