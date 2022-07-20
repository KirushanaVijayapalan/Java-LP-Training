package com.example.factory;

public class Lenovo implements MobileItem {

	public void cost() {
	System.out.println("Lenovo cost start from 10000");
		
	}

	public void pictureCapacity() {
		System.out.println("lenovo camera capacity starts from 10 MP");
		
	}

	public void batteryPower() {
		System.out.println("Lenovo battery power starts from 2500 MAh");
		
	}

	@Override
	public String toString() {
		return "Lenovo [toString()=" + super.toString()
				+ "]";
	}
	

}
