package com.example.builder;

public class Cake {
private final double sugar;
private final double butter;
private final double milk;
private final int cherry;

public static class CakeBuilder
{
	private  double sugar;
	private  double butter;
	private  double milk;
	private int cherry;
	public CakeBuilder sugar(double cup)
	{
		this.sugar=cup;
		return this;
	}
	public CakeBuilder butter(double cup)
	{
		this.butter=cup;
		return this;
	}
	public CakeBuilder milk(double cup)
	{
		this.milk=cup;
		return this;
	}
	public CakeBuilder cherry(int number)
	{
		this.cherry=number;
		return this;
	}
	public Cake build()
	{
		return new Cake(this);
	}
}
private Cake (CakeBuilder builder)
{
	this.sugar=builder.sugar;
	this.butter=builder.butter;
	this.milk=builder.milk;
	this.cherry=builder.cherry;
}
@Override
public String toString() {
	return "Cake [sugar=" + sugar + ", butter=" + butter + ", milk=" + milk + ", cherry=" + cherry + "]";
}

}

