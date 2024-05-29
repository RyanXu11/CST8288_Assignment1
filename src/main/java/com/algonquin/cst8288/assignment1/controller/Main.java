package com.algonquin.cst8288.assignment1.controller;


import com.algonquin.cst8288.assignment1.employee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.employee.Employee;
import com.algonquin.cst8288.assignment1.employee.PermanentEmployeeImpl;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;
import java.io.IOException;
import java.util.Calendar;

/**
 * Main class to execute the application
 * File: Main.java<br>
 * Course: CST8288_033<br>
 * Assignment: Assignment 1<br>
 * Professor: Sazzad Hossain<br>
 * Date: May 26, 2024<br>
 * @version 1.0
 * @since 2024-05-22
 * @author Ryan Xu
 */
public class Main {
	
    /**
     * main class to test Assignment 1
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {

        // Instantiate two Employee objects and use PermanentEmployeeService.java 
        // and ContractEmployeeService.java to calculate and populate required data for objects
        // Utilize EmployeeController.java to save both objects in JSON and Text formats, 
        // saving the data in files named json_employee_data.txt and text_employee_data.txt.
        // Do the same thing to output the data to the console instead of saving it to a file.
        PermanentEmployeeImpl permanentEmployee = new PermanentEmployeeImpl();
        ContractEmployeeImpl contractEmployee = new ContractEmployeeImpl();
        String txtFilename = "text_employee_data.txt";
        String jsonFilename = "json_employee_data.txt";
        
        // Populate data for PermanentEmployee
        permanentEmployee.setName("Sazzad Hossain");
        permanentEmployee.setEmail("hossais2@algonquincollege.com");
        permanentEmployee.setAddress("1385 Woodroffe Ave, Ottawa, ON K2G 1V8");
        permanentEmployee.setSalary(240000.0);
        permanentEmployee.setNumberOfServiceYear(15);
        permanentEmployee.setTotalCompensation();
        permanentEmployee.setBonus(permanentEmployee);
        permanentEmployee.setPension(permanentEmployee);

        
        // Populate data for ContractEmployee
        contractEmployee.setName("Ryan Xu");
        contractEmployee.setEmail("xu000310@algonquinlive.com");
	contractEmployee.setAddress("11 MacArthur Dr, Charlottetown, PE C1A 6N2");
        contractEmployee.setSalary(60000.0);
        contractEmployee.setNumberOfServiceYear(2);
        contractEmployee.setTotalCompensation();
        contractEmployee.setRenewalDate();

        // 
	Formatter textformatter = new TextFormatter();
        Formatter jsonformatter = new JSONFormatter();
        EmployeeValidator validator = new EmployeeValidator();
        PersistenceService persistenceServiceTxt = new PersistenceService(textformatter);
        PersistenceService persistenceServiceJSON = new PersistenceService(jsonformatter);


        // Save objects in text formats, the first call handleEmployee use !append means overwirte the file
        boolean append = true;
        EmployeeController controllerTxt = new EmployeeController(validator, persistenceServiceTxt);
        controllerTxt.saveEmployeeToFile(permanentEmployee, txtFilename, !append); // overwrite the file
        controllerTxt.saveEmployeeToFile(contractEmployee, txtFilename, append);
        

        // Save objects in JSON formats
        EmployeeController controllerJSON = new EmployeeController(validator, persistenceServiceJSON);
        controllerJSON.saveEmployeeToFile(permanentEmployee, jsonFilename, !append);        
        controllerJSON.saveEmployeeToFile(contractEmployee, jsonFilename, append);        
        
        // Print objects in console in text formats
        System.out.println("Printing permanent employee in Text formats:");
        controllerTxt.printEmployeeInConsole(permanentEmployee);
            
        System.out.println("\nPrinting contract employee in Text formats:");
        controllerTxt.printEmployeeInConsole(contractEmployee);        
        
        // Print objects in JSON formats
        System.out.println("\nPrinting permanent employee in JSON formats:");
        controllerJSON.printEmployeeInConsole(permanentEmployee);
            
        System.out.println("\nPrinting contract employee in JSON formats:");
        controllerJSON.printEmployeeInConsole(contractEmployee);

//        System.out.println(permanentEmployee.toString());
//        System.out.println(contractEmployee.toString());
    }
}
