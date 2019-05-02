package com.rahmadnet.statepattern.java;

public class ThirdYearKid implements KidState
{

	@Override
	public void play() 
	{
		System.out.println("Run and Roll");
	}

	@Override
	public void eat() 
	{
		System.out.println("Eat chocolates");
	}

}
