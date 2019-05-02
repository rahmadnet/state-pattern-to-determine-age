package com.rahmadnet.statepattern.java;

public class SecondYearKid implements KidState
{

	@Override
	public void play() 
	{
		System.out.println("Play With Toys");
	}

	@Override
	public void eat() 
	{
		System.out.println("Eat Potatoes and Drink milk");
	}

}
