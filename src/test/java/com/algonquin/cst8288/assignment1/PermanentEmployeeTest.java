/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.algonquin.cst8288.assignment1;

import com.algonquin.cst8288.assignment1.emoloyee.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Test class for PermanentEmployeeImpl. This class contains JUnit tests
 * to verify the functionality of the PermanentEmployeeImpl class.
 * @author rijal
 */
public class PermanentEmployeeTest {
    private static PermanentEmployeeImpl p;
    
    /**
     * Default constructor for PermanentEmployeeTest.
     */
    public PermanentEmployeeTest() {
    }
    
    /**
     * Initializes the class-level resources before any tests are run.
     * This method is run once before any of the test methods in the class.
     */
    @BeforeClass
    public static void setUpClass() {
        p = new PermanentEmployeeImpl();
        
        p.setSalary(2000);
        p.setNumberOfServiceYear(5);
        p.setName("Dikchha Rijal");  
    }
    
    /**
     * Tests the calculateBonus method of the PermanentEmployeeImpl class.
     * It verifies that the bonus is correctly calculated based on the salary
     * and number of years of service.
     */
     @Test
     public void testCalculateBonus() {
         
         double expectedBonus = (2.5 / 100.0) * p.getSalary() * p.getNumberOfServiceYear();
         double calculatedBonus =  p.calculateBonus();
       
        assertEquals(expectedBonus, calculatedBonus, 0.0001);
         assertEquals(250, p.calculateBonus(), 0.0001);
     }
     /**
     * Tests the pensionContribution method of the PermanentEmployeeImpl class.
     * It verifies that the pension contribution is correctly calculated as a percentage of the salary.
     */
     @Test
    public void testPensionContribution() {
        double expectedPension = (1 / 100.0) * p.getSalary();
        double calculatedPension = p.pensionContribution();
        
        assertEquals(expectedPension, calculatedPension, 0.0001);
        assertEquals (20, p.pensionContribution(), 0.0001);
    }
    /**
     * Tests the calculateTotalCompensation method of the PermanentEmployeeImpl class.
     * It verifies that the total compensation is correctly calculated as the sum of the salary and bonus.
     */
    @Test
    public void testCalculateTotalCompensation() {
        double expectedTotalCompensation = p.getSalary() + p.calculateBonus();
        assertEquals(expectedTotalCompensation, p.calculateTotalCompensation(p), 0.0001);
    }
      
}
