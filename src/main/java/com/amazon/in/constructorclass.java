package com.amazon.in;

public class constructorclass {
	int a=10;
	public  constructorclass() {
	
		System.out.println("Costructor");
		
	}
	
	public  void constructorclass() {
		this.a=a;
		System.out.println("Costructor2"+a);
		
	}
	public static void main(String[] args) {
		constructorclass cs=new constructorclass();
		
	}

}
