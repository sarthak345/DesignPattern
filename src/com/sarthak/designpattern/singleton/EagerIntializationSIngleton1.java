package com.sarthak.designpattern.singleton;

public class EagerIntializationSIngleton1 {
	//static block instance creation
	private static final EagerIntializationSIngleton1 EAGER_INTIALIZATIONS_INGLETON1 ;
	private EagerIntializationSIngleton1() {
		
	}
	static {
		EAGER_INTIALIZATIONS_INGLETON1=new  EagerIntializationSIngleton1();
		
	}
}
