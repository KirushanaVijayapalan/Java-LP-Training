package com.example.singleton;

public class SingletonApplication {

	public static void main(String[] args) {
		System.out.println("If you see the same value,then singleton was  reused " + "\n"
				+ "If you are see different value,then 2 singletond were created " + "\n\n" + "Result :" + "\n");
		Singleton singleton = Singleton.getInstance("ABCD");
		Singleton anotherSingleton = Singleton.getInstance("PQRS");
		System.out.println(singleton.value);
		System.out.println(anotherSingleton.value);
	}

}
