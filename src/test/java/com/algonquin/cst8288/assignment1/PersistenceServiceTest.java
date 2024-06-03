/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.algonquin.cst8288.assignment1;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.persistence.PersistenceService;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for the class PersistenceService. This class contains JUnit tests
 * to verify the functionality of the PersistenceService class and its methods.
 * @author rijal
 */
public class PersistenceServiceTest {
    private static PersistenceService text;
    private static  PersistenceService json;
    private static Employee e1;
    private static Employee e2;
    private static Formatter textFormatter;
    
    
    /**
     * Constructs a new PersistenceServiceTest instance.
     */
    public PersistenceServiceTest() {
    }
    
    /**
     * Sets up the test environment before running any test methods.
     * Initializes necessary objects for testing.
     */
    @BeforeClass
    public static void setUpClass() {
         text = new PersistenceService (new TextFormatter());
         json = new PersistenceService(new JSONFormatter());
         textFormatter  = new TextFormatter();
         
         e1 = new PermanentEmployeeImpl();
         e1.setName("Dikchha");
         e1.setEmail("rijal@gmail.com");
         e1.setSalary(65000.0);
         e1.setNumberOfServiceYear(8);
         
         e2 = new PermanentEmployeeImpl();
         e2.setName("Dikchha");
         e2.setEmail("rijal@gmail.com");
         e2.setSalary(65000.0);
         e2.setNumberOfServiceYear(8);        
    }
    /**
     * Tests the saveEmployee method of PersistenceService.
     * @throws IOException if an I/O error occurs while saving the employee.
     */
    @Test
    public void testSaveEmployee() throws IOException {
       
       text.saveEmployee(e1,"text_employee_data.txt", textFormatter);
       json.saveEmployee(e1,"text_employee_data.txt", new JSONFormatter());
       
       text.saveEmployee(e2,"text_employee_data.txt", textFormatter);
       json.saveEmployee(e2,"text_employee_data.txt", new JSONFormatter());
       
        }
    }

    

