/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

/**
 * The PermanentEmployeeService interface extends the EmployeeService interface.
 * It provides additional services specific to permanent employees, such as calculating
 * the pension contribution and the bonus.
 * @author rijal
 */
public interface PermanentEmployeeService extends EmployeeService{
    /**
     * Calculates the pension contribution for a permanent employee.
     * @return The pension contribution amount.
     */
    public double pensionContribution();
	
    /**
     * Calculates the bonus for a permanent employee.
     * @return The bonus amount.
     */
    public double calculateBonus();   
}
