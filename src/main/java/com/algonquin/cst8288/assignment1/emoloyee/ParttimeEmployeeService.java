/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

/**
 * The ParttimeEmployeeService interface extends the EmployeeService interface.
 * It provides additional services specific to part-time employees, such as determining
 * the renewal date of their contracts.
 * @author rijal
 */
public interface ParttimeEmployeeService extends EmployeeService {
    /**
     * Determines the renewal date of a part-time employee's contract.
     * @return The renewal date of the contract.
     */
    public Date renewalDate();
}
