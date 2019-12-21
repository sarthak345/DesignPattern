package com.sarthak.designpattern.singleton.test;

import com.sarthak.designpattern.singleton.LazyInitializationSingleton;

public class lazyTestThroughMultiThread {
	public static void main(String[] args) {
		
	
	Thread t1=new Thread(new Runnable() {
		
		@Override
		public void run() {
			LazyInitializationSingleton instance1=LazyInitializationSingleton.getInstance();
			System.out.println("Instance1 hashcode:"+instance1.hashCode());
		}
	});
Thread t2=new Thread(new Runnable() {
		
		@Override
		public void run() {
			LazyInitializationSingleton instance2=LazyInitializationSingleton.getInstance();
			System.out.println("Instance2 hashcode:"+instance2.hashCode());
		}
	});
t1.start();
t2.start();
	}

}
