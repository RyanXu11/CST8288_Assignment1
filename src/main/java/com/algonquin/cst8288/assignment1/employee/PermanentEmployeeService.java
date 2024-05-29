/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.algonquin.cst8288.assignment1.employee;

/**
 * This is interface for permanent employee services
 * File: PermanentEmployeeService.java<br>
 * Course: CST8288_033<br>
 * Assignment: Assignment 1<br>
 * Professor: Sazzad Hossain<br>
 * Date: May 26, 2024<br>
 * @version 1.0
 * @since 2024-05-22
 * @author Ryan Xu
 */
public interface PermanentEmployeeService extends EmployeeService{

    /**
     * abstract to calculate bonus
     * @param employee
     * @return 
     */
    double calculateBonus(Employee employee);

    /**
     * abstract method to calculate pension contribution
     * @param employee
     * @return 
     */
    double pensionContribution(Employee employee);
    
}
