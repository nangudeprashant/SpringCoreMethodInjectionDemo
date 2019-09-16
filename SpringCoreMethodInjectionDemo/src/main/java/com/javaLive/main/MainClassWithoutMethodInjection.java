package com.javaLive.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaLive.beansWithoutMethodInjection.PrototypeBean1;
import com.javaLive.beansWithoutMethodInjection.SingletonBean1;

public class MainClassWithoutMethodInjection {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		SingletonBean1 singleton1 = (SingletonBean1) context.getBean("singletonBean1");
		PrototypeBean1 prototypeBeanA = singleton1.getPrototypeBean();
		PrototypeBean1 prototypeBeanB = singleton1.getPrototypeBean();
		System.out.println(prototypeBeanA);
		System.out.println(prototypeBeanB);
		System.out.println("Is prototypeBeanA and prototypeBeanA  same ? " + (prototypeBeanA == prototypeBeanB));
		context.registerShutdownHook();
	}
}
