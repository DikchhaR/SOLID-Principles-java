/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.algonquin.cst8288.assignment1;

import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for ContractEmployeeImpl. This class contains JUnit tests
 * to verify the functionality of the ContractEmployeeImpl class.
 * @author rijal
 */
public class ContractEmployeeImplTest {
    private static ContractEmployeeImpl c;
    
    /**
     * Initializes the class-level resources before any tests are run.
     * This method is run once before any of the test methods in the class.
     */
    @BeforeClass
    public static void setUpClass() {
        c = new ContractEmployeeImpl();       
        c.setSalary(40000);       
        c.setName("Dikchha Rijal");  
    }
       
    /**
     * Tests the CalculateTotalCompensation method of the ContractEmployeeImpl class.
     * It verifies that the total compensation is correctly calculated based on the salary.
     */
    @Test
    public void testCalculateTotalCompensation() {
        double expectedTotalCompensation = c.getSalary();
        assertEquals(expectedTotalCompensation, c.calculateTotalCompensation(c), 0.0001);
        assertEquals(40000, c.calculateTotalCompensation(c), 0.00001);
      
    }
    /**
     * Tests the renewalDate method of the ContractEmployeeImpl class.
     * It verifies that the renewal date is correctly set to one day less than a year from the current date.
     */
   @Test
   public void testRenewalDate(){
       Calendar calendar = Calendar.getInstance();
       calendar.add(Calendar.DAY_OF_YEAR, 364);
       Date expectedRenewalDate = calendar.getTime();
       
       Date calculatedRenewalDate = c.renewalDate();
       
       assertEquals(expectedRenewalDate, calculatedRenewalDate);
           
   }
}

