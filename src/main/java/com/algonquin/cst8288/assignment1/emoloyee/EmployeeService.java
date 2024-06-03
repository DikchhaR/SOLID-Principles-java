package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

/**
 * This interface declares methods that must be implemented by class that provides
 * services for calculating the total compensation of an employee.
 */
public interface EmployeeService {
    /**
     * Calculates the total compensation for an employee.
     * @param employee The employee object containing the salary information.
     * @return The total compensation for the employee.
     */
	public double calculateTotalCompensation(Employee employee);
	
	
}
