package com.rahmadnet.statepattern.java;

import java.util.Scanner;

public class Exec 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Pleaea Entered is Age  ");
		
		int age = scan.nextInt();
		Kid kid = new Kid(age);
		System.out.println("");
		System.out.print("> " + age +" years old child ");
		kid.eat();
		
		System.out.println("");
		System.out.print("> " + age +" years old child ");
		kid.play();
		
	}

}
