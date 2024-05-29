/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.algonquin.cst8288.assignment1.controller;

import com.algonquin.cst8288.assignment1.employee.Employee;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
//import com.algonquin.cst8288.assignment1.controller.PersistenceService;

/**
 * Test for PersistenceService
 * @author ryany
 */
public class PersistenceServiceTest {
    
    /**
     * use JSONFormatter for this test
     */
    @Mock
    private JSONFormatter jsonFormatter;
    
    /**
     * folder is used for the saved file
     */
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    /**
     * persistenceService used in this test
     */
    PersistenceService persistenceService;
    
    /**
     * used to tearDown
     */
    private AutoCloseable closeable;
    
    /**
     * employee instance
     */
    private Employee employee;
    
   
    /**
     * setUp for test
     */
    @Before
    public void setUp() {
        closeable = MockitoAnnotations.openMocks (this);
        persistenceService = new PersistenceService(jsonFormatter);
    }
    
    /**
     * tearDown for test
     * @throws Exception 
     */
    @After
    public void tearDown() throws Exception{
        closeable.close();
        persistenceService = null;
        jsonFormatter = null;
    }

    /**
     * Test of saveEmployee method, of class PersistenceService.
     * 
     * @throws java.io.IOException
     */
    @Test
    public void testSaveEmployee() throws IOException {
        System.out.println("saveEmployee");
        // Arrange the expectedOutput
        String expectedOutput = "{\"name\":\"Ryan Xu\", \"email\":\"xu000310@algonquinlive.com\"}";
        when(jsonFormatter.format(employee)).thenReturn(expectedOutput);

        // Create a temporary file
        File tempFile = folder.newFile("employees.txt");

        // Act the saveEmployee method
        persistenceService.saveEmployee(employee, tempFile.getAbsolutePath(), true);

        // Assert
        String fileContent = new String(Files.readAllBytes(tempFile.toPath()), StandardCharsets.UTF_8);
        assertTrue(fileContent.contains(expectedOutput));
    }
    
}
