package stupid.controller;

import java.util.Scanner;

public class StupidController
{
	private String myName;
	private Scanner inputReader;

	public StupidController()
	{
		myName = "Todd Williamson";
		inputReader = new Scanner(System.in);
	}

	public void start()
	{
		System.out.println("the");
		System.out.println(myName);
		askQuestions();
	}
	
	private void askQuestions()
	{
		System.out.println("How is your day?");
		String input = inputReader.nextLine();
		System.out.println("Oh, you said: " + input + " about your day.");
		
		System.out.println("My next question is this: What is the best type of food?");
		String foodInput = inputReader.next();
		System.out.println("Ok, you typed this: " + foodInput);
		inputReader.nextLine();
		
		System.out.println("How many cookies do you want?");
		int cookieInput = inputReader.nextInt();
		System.out.println("You want " + cookieInput + " cookies.");
		inputReader.nextLine(); //Used to consume unneeded input.
		
		System.out.println("What is pi? has to be a decimal.");
		double piInput = inputReader.nextDouble();
		System.out.println(piInput + "? That can't be right.");
		
		System.out.println("Now, what is the square root of pi?");
		float testInput = inputReader.nextFloat();
		System.out.println("You said that " + testInput + " is the suare root of pi.");
		
		System.out.println("What is your favorite decimal?");
		boolean booleanInput = inputReader.nextBoolean();
		System.out.println("You said" + booleanInput);
		
		System.out.println("");
		String someInput = inputReader.next();
		System.out.println("Ok, you typed this: " + someInput);
		
	}
}
