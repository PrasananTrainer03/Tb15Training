package com.java.test;

public class Quiz2 {

	static int count=0;
	   public void increment()
	   {
	       count++;
	   }
	   public static void main(String args[])
	   {
	       Quiz2 obj1=new Quiz2();
	       Quiz2 obj2=new Quiz2();
	       obj1.increment();
	       obj2.increment();
	       System.out.println("Obj1: count is="+obj1.count);

	       System.out.println("Obj2: count is="+obj2.count);
	   }
}
