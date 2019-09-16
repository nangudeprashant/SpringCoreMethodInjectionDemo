package com.javaLive.beansWithMethodInjection;

public abstract class SingletonBean2 {
	public SingletonBean2()
    {
           System.out.println("Singleton Bean2 Instantiated !!");
    }

	public abstract PrototypeBean2 getPrototypeBean();
}
