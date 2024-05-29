/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.algonquin.cst8288.assignment1.employee;

//import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ryany
 */
public class ContractEmployeeImplTest {
    
    /**
     * create a contractEmployee instance for test
     */
    ContractEmployeeImpl contractEmployee = new ContractEmployeeImpl();
    
    /**
     *  0.1 seconds in milliseconds, used to compare Date
     */
    private static final int TOLERANCE_TIME = 100; 
    
    /**
     * Used to compare double
     */
    private static final double TOLERANCE_DOUBLE = 0.0001;
    
    /**
     * setUp for the test
     */
    @Before
    public void setUp() {
        contractEmployee.setName("Ryan Xu");
        contractEmployee.setEmail("xu000310@algonquinlive.com");
	contractEmployee.setAddress("11 MacArthur Dr, Charlottetown, PE C1A 6N2");
        contractEmployee.setSalary(60000.0);
        contractEmployee.setNumberOfServiceYear(2);
        contractEmployee.setTotalCompensation();
        contractEmployee.setRenewalDate();
    }
    
    /**
     * tearDown for the test
     */
    @After
    public void tearDown() {
        contractEmployee = null;
    }

    /**
     * Test of getRenewalDate method, of class ContractEmployeeImpl.
     */
    @Test
    public void testSetRenewalDateAndGetRenewalDate() {
        System.out.println("getRenewalDate");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);

        Date expResult = calendar.getTime();
        Date result = contractEmployee.getRenewalDate();

        boolean diff = Math.abs(expResult.getTime() - result.getTime()) <= TOLERANCE_TIME;
        assertTrue("The dates are not equal within the tolerance of 0.1 seconds", diff);
    }

    /**
     * Test of setTotalCompensation method, of class ContractEmployeeImpl.
     */
    @Test
    public void testSetTotalCompensation() {
        System.out.println("setTotalCompensation");
        double expResult = contractEmployee.getTotalCompensation();
        double result = contractEmployee.calculateTotalCompensation(contractEmployee);
        assertEquals(expResult, result, TOLERANCE_DOUBLE);
    }

    /**
     * Test of calculateTotalCompensation method, of class ContractEmployeeImpl.
     */
    @Test
    public void testCalculateTotalCompensation() {
        System.out.println("calculateTotalCompensation");
        double expResult = contractEmployee.getSalary();
        double result = contractEmployee.calculateTotalCompensation(contractEmployee);
        assertEquals(expResult, result, TOLERANCE_DOUBLE);
    }

    /**
     * Test of renewalDate method, of class ContractEmployeeImpl.
     */
    @Test
    public void testRenewalDate() {
        System.out.println("renewalDate");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);

        Date expResult = calendar.getTime();
        Date result = contractEmployee.renewalDate();

        boolean diff = Math.abs(expResult.getTime() - result.getTime()) <= TOLERANCE_TIME;
        assertTrue("The dates are not equal within the tolerance of 0.1 seconds", diff);
    }

    /**
     * Test of toString method, of class ContractEmployeeImpl.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        contractEmployee.setRenewalDate();
        String expResult = "Employee [name=Ryan Xu, email=xu000310@algonquinlive.com, " + 
                "address=11 MacArthur Dr, Charlottetown, PE C1A 6N2, salary=60000.0, " + 
                "numberOfServiceYear=2, totalCompensation=60000.0, " + "renewalDate=" + contractEmployee.getRenewalDate() + "]";
        String result = contractEmployee.toString();
        assertEquals(expResult, result); 
    }
    
}
