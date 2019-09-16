package com.javaLive.beansWithoutMethodInjection;

public class PrototypeBean1 {
	 private String message;
     public PrototypeBean1()
     {
        System.out.println("Prototype Bean1 Instantiated !!");
     }      
     public void setMessage(String message){
        this.message  = message;
     }
     public String  getMessage(){
        return this.message;
     }
}
