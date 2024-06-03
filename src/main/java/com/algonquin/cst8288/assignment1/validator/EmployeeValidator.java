/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.validator;

import com.algonquin.cst8288.assignment1.controller.EmployeeController;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The EmployeeValidator class provides methods to validate employee data.
 * It includes methods to check for the presence of data, validate alphanumeric strings,
 * validate email addresses, ensure non-negative salary, compensation, and service year values.
 * @author rijal
 */
public class EmployeeValidator {
     
    /**
     * This method validates the specified employee data. This method performs
     * various checks on the employee data including: presence of name and email, validity of
     * alphanumeric name, validity of email format, non-negativity of salary, compensation,
     * and service year.
     * @param employee The employee object to be validated.
     * @return true if the employee data is valid, false otherwise.
     */
    public boolean isValidEmployee(Employee employee) {
		if (!isPresent(employee.getName())) {
                    System.out.println("111");
			return false;
		}
		employee.setName(employee.getName().trim());

		if (!isValidAlphaNumeric(employee.getName())) {
                    System.out.println("222");
			return false;
		}
		if (employee.getEmail() == null || employee.getEmail().trim().length() == 0) {
                    System.out.println("333");	
                    return false;
		}
		employee.setEmail(employee.getEmail().trim());
		if (!isValidEmail(employee.getEmail())) {
		System.out.println("444");	
                    return false;
		}
		
		if (!isNoSalary(employee.getSalary())) {
                    System.out.println("555");
			return false;
		}
		
		if (!isNoCompensation(employee.getTotalCompensation())) {
                    System.out.println(employee.getTotalCompensation());
			return false;
		}
		
		if (!isNoServiceYear(employee.getNumberOfServiceYear())) {
                    System.out.println("777");
			return false;
		}
		
		return true;
	}

	/**
	 * Check if the specified value is null or empty.
	 * 
	 * @param value The value to be checked.
	 * @return true if the value is present, false otherwise.
	 */
	public boolean isPresent(String value) {
		return value != null && value.trim().length() > 0;
	}

	/**
	 * Checks if the specified value is a valid alphanumeric string.
	 * 
	 * @param value the value to be checked.
	 * @return true if the value is a valid alphanumeric string, false otherwise.
	 */
	public boolean isValidAlphaNumeric(String value) {
		Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
		Matcher matcher = pattern.matcher(value);
		return !matcher.find();
	}

	/**
	 * Checks if the specified value is a valid email address.
	 * 
	 * @param value The value to be checked.
	 * @return true if the value is a valid email address, false otherwise.
	 */
	public boolean isValidEmail(String value) {
		Pattern pattern = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher matcher = pattern.matcher(value);
		return matcher.find();
	}
        
        /**
	 * Checks if the specified salary is non-negative.
	 * 
	 * @param salary The salary to be checked.
	 * @return true if the salary is non-negative, false otherwise.
	 */
	public boolean isNoSalary(double salary) {
		return salary <= 0 ? false : true ;
	}
	
	/**
	 * Check if the specified compensation is non-negative.
	 * 
	 * @param compensation The compensation to be checked.
	 * @return true if the compensation is non-negative, false otherwise.
	 */
	public boolean isNoCompensation(double compensation) {
		return compensation <= 0 ? false : true ;
	}
	
	/**
	 * Checks if the specified service year is non-negative.
	 * 
	 * @param serviceYear The service year to be checked.
	 * @return true if the service year is non-negative, false otherwise.
	 */
	public boolean isNoServiceYear(int serviceYear) {
		return serviceYear <= 0 ? false : true ;
	}
	
}
