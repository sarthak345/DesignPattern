package com.sarthak.designpattern.singleton;

import java.io.Serializable;

public class LazyInitializationSingleton implements Serializable{
	//private instance variable so direct access is not possible
private static  LazyInitializationSingleton lazyInitializationSingleton;
//private constructor so object creation from outside is not possible
private LazyInitializationSingleton() {
	/*//Addition to prevent from reflection
	if(lazyInitializationSingleton==null) {
		throw new RuntimeException("Use getInstance() method to get instance.");
	}*/
	
}
//public method with return type of same class
public static LazyInitializationSingleton getInstance() {
	if(lazyInitializationSingleton==null) {
		//prevent from multi thread
		synchronized (LazyInitializationSingleton.class) {
			if(lazyInitializationSingleton==null) 
				lazyInitializationSingleton=new LazyInitializationSingleton();
			
		}
	}
	return lazyInitializationSingleton;
}
//Make singleton from serialize and deserialize operation.
protected LazyInitializationSingleton readResolve() {
	return getInstance();
	
}
}
