/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.persistence;

import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import java.io.FileNotFoundException;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeService;

/**
 * The TextFormatter class is an implementation of the Formatter interface.
 * It provides functionality to format employee data into text format
 * @author rijal
 */
public class TextFormatter implements Formatter {

    /**
     * Formats the specified employee into a text string representation.
     * @param employee The employee object to be formatted.
     * @return The text string representation of the employee data.
     * @throws FileNotFoundException If the file specified for writing the data cannot be found.
     */
    @Override
    public String format(Employee employee) throws FileNotFoundException {
      	//Initialize a StringBuilder to construct the formatted string
        StringBuilder sb = new StringBuilder();
        
        //Append basic employee information to the StringBuilder
        sb.append("name=").append(employee.getName()).append("\n");
        sb.append("email=").append(employee.getEmail()).append("\n");
        sb.append("address=").append(employee.getAddress()).append("\n");
        sb.append("salary=").append(employee.getSalary()).append("\n");
        sb.append("totalCompensation=").append(employee.getTotalCompensation()).append("\n");
        sb.append("yearsOfService=").append(employee.getNumberOfServiceYear()).append("\n");
        
        //Check if the employee is a ContractEmployee or PermanentEmployee
        if(employee instanceof ContractEmployeeImpl){
            
            //If the employee is a ContractEmployee, append renewal date information
            ContractEmployeeImpl con = (ContractEmployeeImpl) employee;
            sb.append("Renewal =").append(con.renewalDate()).append("\n");
        }else{
            
            //If the employee is a PermanentEmployee, append bonus and pension information
            PermanentEmployeeImpl perm = (PermanentEmployeeImpl) employee;
            sb.append("Bonus =").append(perm.calculateBonus()).append("\n");
            sb.append("Pension  =").append(perm.pensionContribution()).append("\n");
        }
        
        //Return the formatted String
        return sb.toString();
        
        
    }
}
