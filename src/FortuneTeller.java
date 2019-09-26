

import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Hello! What is your first name?");
		String firstName = input.nextLine();

		System.out.println("Hello " + firstName + "! What is your last name?");
		String lastName = input.nextLine();

		System.out.println("Thank you, " + firstName +" " + lastName + "!");
		System.out.println("I am going to tell you your fortune but, first you will need to answer a few questions!");

		System.out.println("Your first question: What is your age(number)?");

		int ageRetire = input.nextInt();
		if (ageRetire % 2 == 0) {
			ageRetire = 15;
		} else {
			ageRetire = 5;
		}

		System.out.println("What month were you born? Please enter a number.  Example May would be entered as 5");

		Double birthBank = input.nextDouble();
		input.nextLine();
		{

			if (birthBank >= 1 && birthBank <= 4) {
				birthBank = 1234000.00;
			} else if (birthBank >= 5 && birthBank <= 8) {
				birthBank = 5678.00;
			} else if (birthBank >= 9 && birthBank <= 12) {
				birthBank = 91011.12;
			} else {
				birthBank = 0.00;
			}
		}
		
		System.out.println("What is your favorite ROYGBIV color? If unsure, enter Help"); 
		
		String color = input.nextLine();
		{
		if(color.toLowerCase().contains("help")) {
			System.out.println (" ROYGBIV OPTIONS: \nred \norange \nyellow \ngreen \nblue \nindigo \nviolet \nPlease Start Over");
		} else if 
			(color.toLowerCase().contains("red")){
			color="bicycle";
		}else if (color.toLowerCase().contains("orange")){
			color="hitchhike";
		} else if (color.toLowerCase().contains("yellow")){
			 color="motorcycle";
		}else if (color.toLowerCase().contains("green")){
			color="VW Wagon";
		} else if (color.toLowerCase().contains("blue")){ 
			color="Mercedes X Class";
		}else if (color.toLowerCase().contains("indigo")){ 
			color="minivan";
		} else if (color.toLowerCase().contains("violet")){
			color="private jet";
		} else {
			System.out.println("Failed to choose a correct ROYGBIV color. Please start over.");
		}
		
		}
		System.out.println("Last Question, how many siblings do you have?");
		
		int siblingsHome = input.nextInt();
				
		
		
		String siblingsHomeString;

		switch (siblingsHome) {
		
		case 0:
			siblingsHomeString = "Las Vegas, Nevada";
			break;
		case 1:
			siblingsHomeString = "San Diego, California";
			break;
		case 2:
			siblingsHomeString = "London, England";
			break;
		case 3:
			siblingsHomeString = "Aspen, Colorado";
			break;
			default:
				if (siblingsHome >3) {
					siblingsHomeString = "Charleston, South Carolina";
				} else  {
					siblingsHomeString = "Fukushima, Japan";		
				}
		}
	
System.out.println(firstName +" "+ lastName + " will retire in " + ageRetire + " years with $" + birthBank + " in your bank account, a vacation home in "+ siblingsHomeString + "!");
	
	}
}
