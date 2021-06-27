package com.spring4study.rajan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.beans.factory.BeanFactory;


/**
 * @author rajan
 * 
 * @since 27Jun2021
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //BeanFactory
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	
//    	Vehicle obj1= (Vehicle)context.getBean("vehicle");
//        obj1.drive();
        
//        Vehicle obj2= (Vehicle)context.getBean("car");
//        obj2.drive();
        
//        Vehicle obj3= (Vehicle)context.getBean("bike");
//        obj3.drive();
        
//        Tyre tyre=(Tyre)context.getBean("tyre");
////        tyre.setCompName("MRF?");
//        System.out.println(tyre.toString());
    	
    	Car car=(Car)context.getBean("car");
    	car.drive();
    }
}
