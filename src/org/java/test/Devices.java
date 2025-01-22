package org.java.test;

public class Devices implements MyComputer,MyPhone {

	@Override
	public void hardwareResources() {
		System.out.println("apple devices");
		
	}

	@Override
	public void productName() {
		System.out.println("Apple MAC");
		
	}

	@Override
	public void chipCost() {
		System.out.println("1 millon dollars");
		
	}

	@Override
	public void os() {
		System.out.println("Andriod");
	}

	@Override
	public void brand() {
		System.out.println("Samsung");
		
	}

	@Override
	public void ram() {
		System.out.println("8 + 8 gb ram");
		
	}

	@Override
	public void internalMemory() {
		System.out.println("1 tb storage");
		
	}
	public static void main(String[] args) {
		Devices d = new Devices();
		d.hardwareResources();
		d.productName();
		d.chipCost();
		d.os();
		d.brand();
		d.ram();
		d.internalMemory();
		
	}

}
