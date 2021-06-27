package com.spring4study.rajan;

import org.springframework.stereotype.Component;

/**
 * @author rajan
 * 
 * Tyre class
 * 
 * @since 27Jun2021
 *
 */
@Component
public class Tyre {
	
//	public Tyre(String compName) {
//		this.compName = compName;
//	}

	private String compName="MRF";

	@Override
	public String toString() {
		return "Tyre [compName=" + compName + "]";
	}

//	public Tyre(String compName) {
//		super();
//		this.compName = compName;
//	}
	
//	public Tyre(String compName,int i) {
//		super();
//		this.compName = compName;
//		System.out.println(i);
//	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

}
