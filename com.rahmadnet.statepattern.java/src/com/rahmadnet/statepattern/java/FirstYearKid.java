package com.rahmadnet.statepattern.java;

public class FirstYearKid implements KidState
{

	@Override
	public void play() {
		System.out.println("Play in cradle");		
	}

	@Override
	public void eat() 
	{
		System.out.println("Drink Milk");
	}
	
}
