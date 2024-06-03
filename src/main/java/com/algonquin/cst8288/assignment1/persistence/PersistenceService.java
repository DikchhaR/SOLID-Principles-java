/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.persistence;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * The PersistenceService class provides functionality to persist employee data to a file.
 * This class includes a method to save employee data into a file using a specified formatter.
 * This version adheres to the Dependency Inversion Principle (DIP) by accepting the formatter
 * as a method parameter instead of instantiating it internally.
 * @author rijal
 */
public class PersistenceService {

    public PersistenceService(TextFormatter textFormatter) {
    }
   public PersistenceService (JSONFormatter jsonFormatter){
       
   }
    /**
     * Saves the employee data into a file using the specified formatter.
     * @param person The employee object to be saved.
     * @param filename The name of the file to save the data into.
     * @param formatter The formatter used to format the data before saving.
     * @throws IOException If an I/O error occurs during the saving process.
     */
	public void saveEmployee(Employee person, String filename, Formatter formatter) throws IOException {
		try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {
			writer.println(formatter.format(person));
			writer.flush();
		}
	}
        
    
}
