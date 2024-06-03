package com.algonquin.cst8288.assignment1.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.validator.EmployeeValidator;
import com.algonquin.cst8288.assignment1.persistence.PersistenceService;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;


/**
 * This is the Controller class, that processes, validates and saves employee data.
 * This class uses an EmployeeValidator to validate employee information and
 * a PersistenceService to save the data.
 * @author rijal
 */
public class EmployeeController {
    
    private EmployeeValidator validator = new EmployeeValidator();
    private PersistenceService repository = new PersistenceService(new TextFormatter());
      
    /**
     * Default constructor for EmployeeController.
     */
    public EmployeeController() {
       
    }
        /**
         * Processes the given employee data, validates it, and saves it using the specified
         * formatter and file name.
         * @param employee The employee object containing data to be processed.
         * @param formatter The formatter to use for saving the data.
         * @param fileName The name of the file where the data will be saved.
         * @return "SUCCESS" if the employee data is valid and saved successfully, otherwise 'FAILED'.
         * @throws IOException if an I/O error occurs during the saving of data.
         */
	public String processEmployee(Employee employee, Formatter formatter, String fileName) throws IOException {

		// Validate data
		if (!validator.isValidEmployee(employee)) {
                        return "FALIED";
		}
		// Store data
		repository.saveEmployee(employee, fileName, formatter);
		return "SUCCESS";
	}
}