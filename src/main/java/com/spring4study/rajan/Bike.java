package com.spring4study.rajan;

import org.springframework.stereotype.Component;

/**
 * @author rajan
 * 
 * Bike class
 * @since 26Jun2021
 *
 */
@Component
public class Bike implements Vehicle{
	
	public void drive() {
		System.out.println("Bike is driving");
	}

}
