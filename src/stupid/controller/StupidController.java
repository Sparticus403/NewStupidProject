package stupid.controller;

import java.util.Scanner;

public class StupidController
{
	private String myName;
	private Scanner inputReader;
	String sample = "some words are niftier than others";
	String otherValue = " ";
	int index = -99;

	public StupidController()
	{
		myName = "Todd Williamson";
		inputReader = new Scanner(System.in);
	}

	public void start()
	{
		System.out.println("the");
		System.out.println(myName);
		//askQuestions();
		playWithStrings();
		playWithSubstrings();
	}
	
	private void playWithStrings()
	{
		index = sample.toLowerCase().indexOf(otherValue.toLowerCase());
		
		System.out.println("The index of otherValue in sample is: " + index);
		
		index = sample.indexOf(otherValue);
		
		index = otherValue.indexOf(sample);
		if(index >= 0)
		{
			//do something because it exists
			//like change a boolean
			//or check further
			int otherIndex = sample.indexOf("other search", index + 1);
		}
		System.out.println("The index of otherValue in sample is: " + index);
	}
	
	private void playWithSubstrings()
	{
		String partOne = sample.substring(5);
		String partTwo = sample.substring(5, sample.length());
		
		System.out.println("Here is partOne: " + partOne);
		System.out.println("Here is partTwo: " + partTwo);
	}
	
	private void askQuestions()
	{
		System.out.println("How is your day?");
		String input = inputReader.nextLine();
		System.out.println("Oh, you said: " + input + " about your day.");
		
		System.out.println("My next question is this: What is the best type of food?");
		String foodInput = inputReader.nextLine();
		if(!foodInput.equals(""))
		{
			System.out.println("Ok, you typed this: " + foodInput);
			
		}
		inputReader.nextLine();
		
		System.out.println("How many cookies do you want?");
		int cookieInput = inputReader.nextInt();
		System.out.println("You want " + cookieInput + " cookies.");
		inputReader.nextLine(); //Used to consume unneeded input.
		
		System.out.println("What is pi? has to be a decimal.");
		double piInput = inputReader.nextDouble();
		System.out.println(piInput + "? That can't be right.");
		inputReader.nextLine();
		
		System.out.println("Now, what is the square root of pi?");
		float testInput = inputReader.nextFloat();
		System.out.println("You said that " + testInput + " is the suare root of pi.");
		inputReader.nextLine();
		
		System.out.println("What is your favorite decimal?");
		boolean booleanInput = inputReader.nextBoolean();
		System.out.println("You said" + booleanInput);
		inputReader.nextLine();
		
		System.out.println("How would you describe yourself in one word");
		String someInput = inputReader.next();
		System.out.println("Ok, you described yourself as " + someInput);
		inputReader.nextLine();
		
		System.out.println("What do you like to do in your free time?");
		String freeInput = inputReader.nextLine();
		System.out.println("You like to " + freeInput + "in your free time.");
		
		
	}
}
