package com.example.builder;

public class BuilderPattern {

	public static void main(String[] args) {
	Cake whiteCake=new Cake.CakeBuilder().sugar(1).butter(0.5).milk(0.5).build();
	System.out.print(whiteCake);

	}

}
