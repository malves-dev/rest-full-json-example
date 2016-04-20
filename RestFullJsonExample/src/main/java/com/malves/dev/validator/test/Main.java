package com.malves.dev.validator.test;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.hibernate.validator.constraints.br.CNPJ;

import com.malves.dev.model.Vehicle;

/**
 * 
 */

/**
 * @author MarioS
 *
 */
public class Main {

	@CNPJ
	private static Validator validator;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		Vehicle car = new Vehicle();
		
		car.setName("Jeep");
		 Set<ConstraintViolation<Vehicle>> constraintViolations =  validator.validate( car );
		
	    System.out.println(car.toString());

	}

}
