package com.rahmadnet.statepattern.java;

public class NoAge implements KidState
{

	@Override
	public void play() 
	{
		System.out.println(" not found enter number 1 2 3 4");		
	}

	@Override
	public void eat() 
	{
		System.out.println("not found enter number 1 2 3 4");		
	}
	
}
