/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.algonquin.cst8288.assignment1.employee;

import java.util.Date;

/**
 * This is interface for contract employee services
 * File: ContractEmployeeService.java<br>
 * Course: CST8288_033<br>
 * Assignment: Assignment 1<br>
 * Professor: Sazzad Hossain<br>
 * Date: May 26, 2024<br>
 * @version 1.0
 * @since 2024-05-22
 * @author Ryan Xu
 */
public interface ContractEmployeeService extends EmployeeService{

    /**
     * abstract method which would be implemented in sub class
     * @return 
     */
    Date renewalDate();
    
}
