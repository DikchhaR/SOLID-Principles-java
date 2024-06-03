package com.algonquin.cst8288.assignment1.persistence;

import java.io.IOException;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
/**
 * This is the Formatter class that is used to format the empplyee data.
 * Classes that implement this interface must provide a method to format an employee
 * object into a string representation.
 * @author rijal
 */
public interface Formatter {
	
    /**
     * Formats the specified employee into a string representation.
     * @param employee The employee object to be formatted.
     * @return The formatted string representation of the employee data.
     * @throws IOException If an I/O error occurs during the formatting process.
     */
    public String format(Employee employee) throws IOException;
	
}

