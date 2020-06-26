package com.javaLive.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaLive.beansWithMethodInjection.PrototypeBean2;
import com.javaLive.beansWithMethodInjection.SingletonBean2;

/**
 * Hello world!
 *
 */
public class MainClassWithMethodInjection 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    	SingletonBean2 singleton = (SingletonBean2)context.getBean("singletonBean2");   
        PrototypeBean2 prototypeBeanA = singleton.getPrototypeBean();
        PrototypeBean2 prototypeBeanB = singleton.getPrototypeBean();             
        System.out.println(prototypeBeanA);
        System.out.println(prototypeBeanB);             
        System.out.println("Is prototypeBeanA and prototypeBeanA  same ? " + (prototypeBeanA==prototypeBeanB));
        context.registerShutdownHook();
    }
}
