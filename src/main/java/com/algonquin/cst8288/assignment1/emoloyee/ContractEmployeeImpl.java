/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;
import java.util.Calendar;

/**
 * The ContractEmployeeImpl class represents a contract employee.
 * This class extends the Employee class and implements the ParttimeEmployeeService interface.
 * It includes additional functionality specific to contract employees, such as calculating
 * the total compensation and determining the renewal date of the contract.
 * @author rijal
 */
public class ContractEmployeeImpl extends Employee implements ParttimeEmployeeService {
   /**
    * The renewal date of the contract.
    */
    private Date renewalDate;
    
    /**
     * Default constructor for ContractEmployeeImpl.
     * Initializes a new instance of the ContractEmployeeImpl class.
     */
    public ContractEmployeeImpl() {
        super();
    }
    /**
     * Returns the renewal date of the contract.
     * @return The renewal date.
     */
    public Date getRenewalDate() {
		return renewalDate;
    }
    /**
     * Sets the renewal date of the contract.
     * @param renewalDate The new renewal date.
     */
    public void setRenewalDate(Date renewalDate) {
	this.renewalDate = renewalDate;
    }
    
    /**
     * Calculates the total compensation for the contract employee.
     * @param employee The employee object containing the salary information.
     * @return The total compensation, which is the same as the employee's salary.
     */
    public double calculateTotalCompensation(Employee employee) {
         return employee.getSalary();
    }
    /**
     * Determines the renewal date of the contract, which is set to 364 days from the current date.
     * @return The renewal date.
     */
    public Date renewalDate() {
         Calendar calendar = Calendar.getInstance();
         calendar.add(Calendar.DAY_OF_YEAR, 364);
         return calendar.getTime();        
    }
    /**
     * Returns a string representation of the contract employee, including the renewal date.
     * @return A string representation of the contract employee.
     */
    @Override
	public String toString() {
            System.out.println("renew "+ renewalDate);
		return super.toString() + "renewal Date = " + renewalDate;
	}
}
