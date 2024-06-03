/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

/**
 * This class extends the Employee class and implements the PermanentEmployeeService interface.
 * It includes additional functionality specific to permanent employees, such as calculating
 * the pension contribution and the bonus.
 * @author rijal
 */
public class PermanentEmployeeImpl extends Employee implements PermanentEmployeeService {
    /** 
     * The bonus amount for the permanent employee. 
     */
    private double bonus;
    /**
     * The pension contribution for the permanent employee.
     */
    private double pension;
    
    /**
     * Default constructor for PermanentEmployeeImpl.
     * Initializes a new instance of the PermanentEmployeeImpl class.
     */
     public PermanentEmployeeImpl() {
        super();
    }
     /**
     * Returns the bonus amount for the permanent employee.
     * @return The bonus amount.
     */
    public double getBonus() {
	return bonus;
    }
    /**
     * Sets the bonus amount for the permanent employee.
     * @param bonus The new bonus amount.
     */
    public void setBonus(double bonus) {
	this.bonus = bonus;
    }
     /**
     * Gets the pension contribution for the permanent employee.
     * @return The pension contribution amount.
     */   
    public double getPension() {
	return pension;
    }
    /**
     * Sets the pension contribution for the permanent employee.
     * @param pension The new pension contribution amount.
     */
    public void setPension(double pension) {
	this.pension = pension;
    }
     /**
     * Calculates the pension contribution for the permanent employee.
     * @return The pension contribution amount.
     */   
    public double pensionContribution() {
        pension = (1/100.0) * this.getSalary();
        return pension;       
    }
    /**
     * Calculates the bonus for the permanent employee.
     * @return The bonus amount.
     */
    public double calculateBonus() {
        bonus = (2.5/100.0) * this.getSalary() * this.getNumberOfServiceYear();
        return bonus;       
    }
    /**
     * Calculates the total compensation for the permanent employee.
     * 
     * @param employee The employee object containing the salary information.
     * @return The total compensation, which includes the salary and the bonus.
     */
    @Override
    public double calculateTotalCompensation(Employee employee) {
        
        this.calculateBonus();
        return employee.getSalary() + bonus;       
    }
    /**
     * Returns a string representation of the permanent employee, including the bonus and pension.
     * @return A string representation of the permanent employee.
     */
   @Override
	public String toString() {
		return super.toString() + "bonus = " + bonus + "pension = " + pension;
	}
          
}
 