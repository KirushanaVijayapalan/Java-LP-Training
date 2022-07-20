package com.example.factory;

public class MobileFactory {
	public MobileFactory()
	{
		
	}
	MobileItem createMobile(String type)
	{
		MobileItem mob=null;
		if("len".equalsIgnoreCase(type))
		{
			mob=new Lenovo();
			System.out.println("Lenovo created ");
		}
		else if("sam".equalsIgnoreCase(type))
		{
			mob=new Samsung();
			System.out.println("Samsung created ");
		}
		return mob;
	}

}
