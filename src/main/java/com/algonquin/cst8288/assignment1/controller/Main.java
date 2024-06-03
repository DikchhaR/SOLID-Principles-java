package com.algonquin.cst8288.assignment1.controller;

import com.algonquin.cst8288.assignment1.controller.EmployeeController;
import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;
import java.io.IOException;
import java.util.Date;


/**
 * This is a class called Main, this class is the driver class of the code that has the main method,and that executes 
 * the application. This class instantiates the employee objects to calculate and populate required data for the objects.
 * This class helps to save the objects in JSON and Text format.
 */
public class Main {
        /**
         * This is the main method that executes the application.
         * @param args array of strings
         * @throws IOException If an I/O error occurs during saving the data.
         */
	public static void main(String[] args) throws IOException {
		//create instances of permanent and contract employees
                PermanentEmployeeImpl perm = new PermanentEmployeeImpl();
                ContractEmployeeImpl contr = new ContractEmployeeImpl();
                EmployeeController controller = new EmployeeController();
                Formatter JsonFormatter = new JSONFormatter();
		Formatter textFormatter = new TextFormatter();
                
                //setting instance values for permanent employees
                perm.setName("DikchhaRijal");
                perm.setEmail("rijaldikchha@gmail.com");
                perm.setAddress("77 Inverness Ave");
                perm.setSalary(60000.0);
                perm.setNumberOfServiceYear(5);
                
                //setting instance values for contract employees
                contr.setName("SachinRijal");
                contr.setEmail("rijalsachin@gmail.com");
                contr.setAddress("77 Inverness Ave");
                contr.setSalary(65000.0);
                contr.setNumberOfServiceYear(7);
                
                //calculate and set the total compensation for the permanent employee
                double permCompensation = perm.calculateTotalCompensation(perm);
                perm.setTotalCompensation(permCompensation);
                
                //calculate and set pension contribution for the permanent employee
		perm.pensionContribution();
		double contrCompensation = contr.calculateTotalCompensation(contr);
                contr.setTotalCompensation(contrCompensation);
                
                //Calculate and set the renewal date for the contract employee
		Date renewDate = contr.renewalDate();
                contr.setRenewalDate(renewDate);
                
                //Process and save the data to files in JSON format and text format
		String permanentJsonResult = controller.processEmployee(perm, JsonFormatter, "json_employee_data.txt");
		String permanentTextResult = controller.processEmployee(perm, textFormatter, "text_employee_data.txt");
		String contractJsonResult = controller.processEmployee(contr, JsonFormatter, "json_employee_data.txt");
		String contractTextResult = controller.processEmployee(contr, textFormatter, "text_employee_data.txt");

		//Output the data in JSON format and text format to the console
		if (permanentJsonResult.equals("SUCCESS") && permanentTextResult.equals("SUCCESS")) {
			System.out.println("Data from Permanent employee is saved in both formats.");
			System.out.println(JsonFormatter.format(perm));
			System.out.println(textFormatter.format(perm));
		} else {
			System.out.println("Data from Permanent employee is not saved");
		}

		if (contractJsonResult.equals("SUCCESS") && contractTextResult.equals("SUCCESS")) {
			System.out.println("Data from Contract Employee is saved in both formats.");
			System.out.println(JsonFormatter.format(contr));
			System.out.println(textFormatter.format(contr));
		} else {
			System.out.println("Data from Contract employee is not saved.");
		}

	}	

}
                
                
                
                
		