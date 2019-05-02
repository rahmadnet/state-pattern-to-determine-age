package com.rahmadnet.statepattern.java;

public class FourthYearKid implements KidState
{

	@Override
	public void play() 
	{
		System.out.println("Play Football");
	}

	@Override
	public void eat() 
	{
		System.out.println("Eat cakes");
	}

}
