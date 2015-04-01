/*
Carlos F. Meneses
03/24/2015
Bergen Community College
Advanced Java Programming

Homework Project 3, Phase 1, Problem 1
*/
/**
StringApp.java: Reads strings from the user until the user enters "DONE". If a 
string is entered that has too many characters (say 20), throw the exception. 
The exception StringTooLongException catches and handles the exception if it is 
thrown. Handle the exception by printing an appropriate message, and then 
continue processing more strings. (see also: StringTooLongException.java)
*/

import java.util.Scanner;

public class StringApp
{
	public static void main(String[] args) throws StringTooLongException
	{
		String doneString = "done";
		String inputMsg = "Please enter a string, type " + 
						   doneString.toUpperCase() + " to finish > ";
		String userInput = "";
		boolean done = false;
		String byeMsg = "Have a great day!";
		int maxLength = 20;
		Scanner scan = new Scanner(System.in);
		
		while (!done)
		{
			try
			{
				System.out.print(inputMsg);
				userInput = scan.nextLine();
				
				if (userInput.length() >= maxLength)
				{
					throw(new StringTooLongException());
				}
			}
			
			catch (StringTooLongException stle)
			{
				System.out.println(stle);
			}
			
			if (doneString.equalsIgnoreCase(userInput))
			{
				done = true;
			}
		}
		System.out.println(byeMsg);
	}
}