package com.example.chainofresponsibility;

public class PositiveNumberProcessor implements Chain{
	private Chain nextInChain;

	public void setNext(Chain c) {
		nextInChain=c;
		
		
	}

	public void process(Number request) {
		if(request.getNumber()>0)
		{
			System.out.println("PositiveNumberProcessor :" +request.getNumber());
		}
		else
		{
			nextInChain.process(request);
		}
		
	}

}
