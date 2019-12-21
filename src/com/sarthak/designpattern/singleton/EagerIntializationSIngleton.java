package com.sarthak.designpattern.singleton;

public class EagerIntializationSIngleton {
	//Eager initialization singleton class
	private static final EagerIntializationSIngleton EAGER_INTIALIZATIONS_INGLETON =new EagerIntializationSIngleton();
	private EagerIntializationSIngleton() {
		
	}
	public static EagerIntializationSIngleton getInstance() {
		return EAGER_INTIALIZATIONS_INGLETON;
		
	}

}
