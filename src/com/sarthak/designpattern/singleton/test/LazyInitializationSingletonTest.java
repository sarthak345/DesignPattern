package com.sarthak.designpattern.singleton.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.sarthak.designpattern.singleton.LazyInitializationSingleton;

public class LazyInitializationSingletonTest {
	public static void main(String[] args) {
		LazyInitializationSingleton instance1 = LazyInitializationSingleton.getInstance();
		LazyInitializationSingleton instance2 = LazyInitializationSingleton.getInstance();
		System.out.println("hashcode of instance1:" + instance1.hashCode());
		System.out.println("hashcode of instance2:" + instance2.hashCode());
		
		
	}
}
