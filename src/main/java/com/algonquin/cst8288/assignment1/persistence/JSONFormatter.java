package com.algonquin.cst8288.assignment1.persistence;

import java.io.IOException;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * It is an implementation of the Formatter interface and provides functionality 
 * to format employee data into JSON format.
 * @author rijal
 */

public class JSONFormatter implements Formatter{

    public JSONFormatter() {
    }

	/**
	 * The method process the person object and extract the attributes 
	 * to format into a JSON string representation. 
         * @return The JSON string representation of the employee data.
     * @throws IOException If an I/O error occurs during the formatting process.
	 */
	@Override
	public String format(Employee person) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
                // Register JavaTimeModule to support serialization of Java 8 Date/Time API classes
		mapper.registerModule(new JavaTimeModule());
		try {
			return mapper.writeValueAsString(person);
		} catch (JsonProcessingException e) {
                    // Convert JsonProcessingException to IOException and throw
			throw new IOException(e);
		}
	}

}
