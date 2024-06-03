package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;
/**
 * This is an Employee class that encapsulates the details of employee in an
 * organization. The details such as personal information, financial data and
 * number of years of service.
 * @author rijal
 */
public class Employee {
       /**
        * name component of the Employee
        */
	private String name;
        /**
        * email component of the Employee
        */
	private String email;
        /**
        * address component of the Employee
        */
	private String address;
        /**
        * salary component of the Employee
        */
	private double salary;
        /**
        * number of years of service component of the Employee
        */
	private int numberOfServiceYear;
	/**
        * total compensation component of the Employee
        */
	private double totalCompensation;
	
        /**
         * Default constructor for creating an instance of an Employee.
         */
	public Employee() {
		// Default constructor
	}
        //Accessor and mutator methods for each attribute
	
        /**
         * Returns the name of an employee
         * @return The name of an employee
         */
        public String getName() {
		return name;
	}
        /**
         * Sets the name of the employee
         * @param name The name of the Employee
         */
	public void setName(String name) {
		this.name = name;
	}
        /**
         * Returns the email address of an employee
         * @return The email address of an employee
         */
	public String getEmail() {
		return email;
	}
        /**
         * Sets the email address of an employee
         * @param email The email of an employee
         */
	public void setEmail(String email) {
		this.email = email;
	}
        /**
         * Returns the address of the employee
         * @return The address of the employee
         */
	public String getAddress() {
		return address;
	}
        /**
         * Sets the address of the employee
         * @param address The address of the employee
         */
	public void setAddress(String address) {
		this.address = address;
	}
        /**
         * Returns the salary of an employee
         * @return The salary of an employee
         */
	public double getSalary() {
		return salary;               
	}
        /**
         * Sets the salary of an employee
         * @param salary The salary of an employee
         */
        public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be a positive integer greater than 0.");
        }
        this.salary = salary;
    }
        
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
        /**
         * Returns the number of service years of an employee
         * @return The number of service years of an employee
         */
	public int getNumberOfServiceYear() {
		return numberOfServiceYear;
	}
        /**
         * Sets the number of service years of an employee
         * @param numberOfServiceYear The number of service years
         */
	public void setNumberOfServiceYear(int numberOfServiceYear) {
		this.numberOfServiceYear = numberOfServiceYear;
	}

	
        /**
         * Returns the total compensation of an employee
         * @return The total compensation of an employee
         */
	public double getTotalCompensation() {
		return totalCompensation;
	}
        /**
         * Sets the total compensation of an employee
         * @param totalCompensation The total compensation of an employee
         */
	public void setTotalCompensation(double totalCompensation) {
		this.totalCompensation = totalCompensation;
	}	
        /**
         * Returns a string representation of the employee object with all its attributes
         * @return A string with all the information of an employee in string format
         */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", address=" + address + ", salary=" + salary
				+ ", numberOfServiceYear=" + numberOfServiceYear + ", totalCompensation="
				+ totalCompensation +  "]";
	}

}