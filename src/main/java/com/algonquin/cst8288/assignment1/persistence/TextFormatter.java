/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.persistence;

import com.algonquin.cst8288.assignment1.employee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.employee.Employee;
import com.algonquin.cst8288.assignment1.employee.PermanentEmployeeImpl;
import java.io.IOException;
import java.lang.reflect.Field;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * An implementation for formatting the data in text format.
 * File: TextFormatter.java<br>
 * Course: CST8288_033<br>
 * Assignment: Assignment 1<br>
 * Professor: Sazzad Hossain<br>
 * Date: May 26, 2024<br>
 * @version 1.0
 * @since 2024-05-22
 * @author Ryan Xu
 */
public class TextFormatter implements Formatter {
    
    @Override
    public String format(Employee employee) throws IOException {
        if (employee == null) {
            throw new IOException("Employee object is null");
        }

        StringBuilder sb = new StringBuilder();

        sb.append("name").append("=").append(employee.getName()).append(",\n");
        sb.append("email").append("=").append(employee.getEmail()).append(",\n");
        sb.append("address").append("=").append(employee.getAddress()).append(",\n");
        sb.append("salary").append("=").append(employee.getSalary()).append(",\n");
        sb.append("numberOfServiceYear").append("=").append(employee.getNumberOfServiceYear()).append(",\n");
        sb.append("totalCompensation").append("=").append(employee.getTotalCompensation()).append(",\n");
        if (employee instanceof ContractEmployeeImpl) {
            ContractEmployeeImpl contractEmployee = (ContractEmployeeImpl) employee;
            sb.append("renewalDate").append("=").append(contractEmployee.getRenewalDate());
        } else if (employee instanceof PermanentEmployeeImpl) {
            PermanentEmployeeImpl permanentEmployee = (PermanentEmployeeImpl) employee;
            sb.append("bonus").append("=").append(permanentEmployee.getBonus()).append(",\n");
            sb.append("pension").append("=").append(permanentEmployee.getPension());
        }
        return sb.toString();
    }
}
