package com.javaLive.beansWithMethodInjection;

public class PrototypeBean2 {
	private String message;

	public PrototypeBean2()
    {
           System.out.println("Prototype Bean2 Instantiated !!");
    }

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public PrototypeBean2 getPrototypeBean() {
		return this;
	}
}
