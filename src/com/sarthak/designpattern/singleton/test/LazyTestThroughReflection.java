package com.sarthak.designpattern.singleton.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.sarthak.designpattern.singleton.LazyInitializationSingleton;

public class LazyTestThroughReflection {
	public static void main(String[] args) {
		// LazySingleton behaviour can break through reflection
		LazyInitializationSingleton instance3 = LazyInitializationSingleton.getInstance();
		LazyInitializationSingleton instance4 = null;
		try {
			Class<LazyInitializationSingleton> clazz = LazyInitializationSingleton.class;
			Constructor<LazyInitializationSingleton> cons = clazz.getDeclaredConstructor();
			cons.setAccessible(true);
			instance4 = cons.newInstance();
		}catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
		System.out.println("hashcode of instance3:" + instance3.hashCode());
		System.out.println("hashcode of instance4:" + instance4.hashCode());
	}

}
