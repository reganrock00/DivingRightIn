
import java.util.Scanner;

public class DivingRightIn
	{
		public static void main(String[] args)
			{
				Scanner reader = new Scanner(System.in);
				Scanner ageinput = new Scanner(System.in);
				Scanner birthdate = new Scanner(System.in);

				System.out.println("Who are you?");
				String name = reader.nextLine();
				System.out.println("What is your age?");
				int age = ageinput.nextInt();
				System.out.println("What was the year of your birth?");
				int year = birthdate.nextInt();

				System.out.println("Hello " + name + "!");

				if (age < 17)
					{
						System.out.println("Almost and adult.");
					}
				if (age == 17)
					{
						System.out.println("Enjoy your senior year");
					}
				if (age > 17)
					{
						System.out.println("So your legally an adult.");
					}
				System.out.println(" ");
				int counter = 0;
				int howdy = 0;
				for (counter = year; counter < 2018; counter++ )
					{
						
						if (counter == 1)
							{
								System.out.println("In " + counter + " you were a " + howdy + " year old!");
							}
						else
							{
								System.out.println("In " + counter + " you were " + howdy + " years old!");
							}
						howdy++;
					}
				double dogYear = howdy;
				dogYear = dogYear/7;
				System.out.println(" ");
				System.out.println("You are " + dogYear + " in dog years.");
				System.out.println(" ");
				int leapYear = (2017 - year)/ 4;
				if (leapYear == 1)
					{
						System.out.println("You have lived through " + leapYear + " leap year.");	
					}
				else
					{
						System.out.println("You have lived through " + leapYear + " leap years.");	
					}
			}

	}
