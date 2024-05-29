/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.algonquin.cst8288.assignment1.employee;

import static com.algonquin.cst8288.assignment1.controller.Rate.BONUS_PERCENTAGE;
import static com.algonquin.cst8288.assignment1.controller.Rate.PENSION_PERCENTAGE;
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
public class PermanentEmployeeImplTest {
    

    /**
     * permanentEmployee instance for this test
     */
    private PermanentEmployeeImpl permanentEmployee = new PermanentEmployeeImpl();
    
    /**
     * Used to compare double
     */
    private static final double TOLERANCE_DOUBLE = 0.00000001;
    
    /**
     * setUp for the test
     */
    @Before
    public void setUp() {        
        permanentEmployee.setName("Sazzad Hossain");
        permanentEmployee.setEmail("hossais2@algonquincollege.com");
        permanentEmployee.setAddress("1385 Woodroffe Ave, Ottawa, ON K2G 1V8");
        permanentEmployee.setSalary(240000.0);
        permanentEmployee.setNumberOfServiceYear(15);
    }
    
    /**
     * tearDown for the test
     */
    @After
    public void tearDown() {
        permanentEmployee = null;
    }

    /**
     * Test of getBonus method, of class PermanentEmployeeImpl.
     */
    @Test
    public void testSetBonusAndGetBonus() {
        System.out.println("setBonus and getBonus:");
        permanentEmployee.setBonus(permanentEmployee);
        double expResult = 240000.0 * BONUS_PERCENTAGE * permanentEmployee.getNumberOfServiceYear();
        double result = permanentEmployee.getBonus();
        assertEquals(expResult, result, TOLERANCE_DOUBLE);
    }

    /**
     * Test of getPension and setPension methods, of class PermanentEmployeeImpl.
     */
    @Test
    public void testSetPensionAndGetPension() {
        System.out.println("SetPension and getPension:");
        permanentEmployee.setPension(permanentEmployee);
        double expResult = permanentEmployee.getSalary() * PENSION_PERCENTAGE;
        double result = permanentEmployee.getPension();
        assertEquals(expResult, result, TOLERANCE_DOUBLE);
    }

    /**
     * Test of setTotalCompensation method, of class PermanentEmployeeImpl.
     */
    @Test
    public void testSetTotalCompensation() {
        System.out.println("setTotalCompensation");
        permanentEmployee.setTotalCompensation();
        double expResult = permanentEmployee.getTotalCompensation();
        double result = permanentEmployee.calculateTotalCompensation(permanentEmployee);
        assertEquals(expResult, result, TOLERANCE_DOUBLE);
    }

    /**
     * Test of calculateTotalCompensation method, of class PermanentEmployeeImpl.
     */
    @Test
    public void testCalculateTotalCompensation() {
        System.out.println("calculateTotalCompensation");
        permanentEmployee.setBonus(permanentEmployee);
        double expResult = permanentEmployee.getSalary() + permanentEmployee.getBonus();
        double result = permanentEmployee.calculateTotalCompensation(permanentEmployee);
        assertEquals(expResult, result, TOLERANCE_DOUBLE);
    }

    /**
     * Test of calculateBonus method, of class PermanentEmployeeImpl.
     */
    @Test
    public void testCalculateBonus() {
        System.out.println("calculateBonus");
        permanentEmployee.setBonus(permanentEmployee);
        double expResult = permanentEmployee.getBonus();
        double result = permanentEmployee.calculateBonus(permanentEmployee);
        assertEquals(expResult, result, TOLERANCE_DOUBLE);
    }

    /**
     * Test of pensionContribution method, of class PermanentEmployeeImpl.
     */
    @Test
    public void testPensionContribution() {
        System.out.println("pensionContribution");
        permanentEmployee.setPension(permanentEmployee);
        double expResult = permanentEmployee.getPension();
        double result = permanentEmployee.pensionContribution(permanentEmployee);
        assertEquals(expResult, result, TOLERANCE_DOUBLE);
    }

    /**
     * Test of toString method, of class PermanentEmployeeImpl.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        permanentEmployee.setPension(permanentEmployee);
        String expResult = "Employee [name=Sazzad Hossain, email=hossais2@algonquincollege.com, " +
                "address=1385 Woodroffe Ave, Ottawa, ON K2G 1V8, salary=240000.0, " +
                "numberOfServiceYear=15, totalCompensation=0.0, bonus=0.0, pension=2400.0]";
        String result = permanentEmployee.toString();
        assertEquals(expResult, result);    
    }
    
}
