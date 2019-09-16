package com.javaLive.beansWithoutMethodInjection;

public class SingletonBean1 {
	private PrototypeBean1 prototypeBean1;

	public SingletonBean1()
     {
         System.out.println("Singleton Bean1 Instantiated !!");
     }

	public PrototypeBean1 getPrototypeBean() {
		return prototypeBean1;
	}

	public void setPrototypeBean(PrototypeBean1 prototypeBean1) {
		this.prototypeBean1 = prototypeBean1;
	}
}
