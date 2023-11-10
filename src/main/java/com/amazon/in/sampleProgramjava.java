package com.amazon.in;

import java.util.Iterator;


public class sampleProgramjava {
	public void odd_or_Even_number() {
		int count=0;
		for (int i=1;i<=1000;i++) {
			
			
		
		if (i%2==1) {
			//System.out.println("Even Number :"+i);
			count=count+1;
		}
		
//		else if(i%2==1){
//			System.out.println("Odd Number"+i);
//			count=count++;
//		}
		}
		System.out.println(count);
		
			}
	public void Factnumber(int facts) {
		int fact=1;
		for(int i=1;i<=facts;i++) {
			fact=fact*i;
			}
		System.out.println(fact);
		}
	public void reversethenumber(int reversenumber) {
		for(int k=1;k<=1600;k++) {
			reversenumber=k;
		int i=0;int j=0;int n=0;
		n=reversenumber;
		while(reversenumber>0) {
			i=reversenumber%10;
			//j=j+(i*i*i);
			j=(j*10)+i;
			reversenumber=reversenumber/10;
			
			
		}
		if(n==j) {
		System.out.println("Polindrom Number"+j);
		
		
	}
//	   else {
//		System.out.println("Not Polindrom");
//	}
		}
	}
	public void countDigit(int s) {
		int count=0;
		int i=0;
		while(s>0) {
			i=s%2;
			count=count+i;
			s=s/10;
			
		}
		System.out.println(count);
	}
	public void swappingtwonumber() {
		int a=20;
		int b=34;
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}
	public void withoutthiredvariableswapingtwovalues() {
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
	public void febbnociseries() {
		int a=0;int b=1;int c=0;
		for(int i=1;i<=50;i++) {
			c=a+b;
			if(c<=50) {
			System.out.println(c);
			
			a=b;
			b=c;
			}
			
		}
	}
	public static void main(String[] args) {
		sampleProgramjava sm=new sampleProgramjava();
		sm.febbnociseries();
	
	}
}
