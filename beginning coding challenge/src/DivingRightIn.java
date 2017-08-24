
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

				if (age == 16)
					{
						System.out.println("Basically an adult!");
					}
				if (age == 17)
					{
						System.out.println("Enjoy your senior year");
					}
				if (age == 18)
					{
						System.out.println("Officially an adult!");
					}
				else
					{
						System.out.println("I dont know what to say to people your age.");
					}
				
				for (int counter = year; counter < 2017; counter++ )
					{
						if (counter == 1)
							{
								System.out.println("In " + year + " you were a " + counter + " year old!");
							}
						else
							{
								
							}
					}
			}

	}
