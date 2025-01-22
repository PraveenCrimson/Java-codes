package org.java.basic;



public class MyFirstJavaProgram {
	
	
	private void firstMethod() {
		// TODO Auto-generated method stub
  System.out.println("1.Method created in the class");
	}
	
	private void secondMethod() {
		// TODO Auto-generated method stub
System.out.println("2.main method created after method cREATION");
	}
	private void thirdMethod() {
		System.out.println("3.object created for class level");
	}
	private void fouthMethod() {
		// TODO Auto-generated method stub
System.out.println("4.method calling");
	}
	private void fifthMethod() {
		// TODO Auto-generated method stub
System.out.println("5.run the program and check the output in the consoless");
	}
	
	public static void main(String[] args) {
		MyFirstJavaProgram cmo = new MyFirstJavaProgram();
		
		cmo.firstMethod();
		cmo.secondMethod();
		cmo.thirdMethod();
		cmo.fouthMethod();
		cmo.fifthMethod();
		
	}
	
	

}
