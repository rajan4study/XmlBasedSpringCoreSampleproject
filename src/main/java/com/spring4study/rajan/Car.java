package com.spring4study.rajan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author rajan
 * 
 * car class 
 * 
 * @since 27Jun2021
 *
 */
@Component
public class Car implements Vehicle{
	
	
	@Autowired
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	/**
	 * drive method
	 */
	public void drive() {
		System.out.println("Driving car:"+tyre);
	}

}
