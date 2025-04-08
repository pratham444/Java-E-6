import java.util.Scanner;
class ConsGame
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name :");
		String name = sc.next();
		
		System.out.println("Hello Nice To Meet You " + name + " Are You Ready To Play This Game : Type (Yes / No)" );
		String choice = sc.next().toUpperCase();

		if (choice.equals("YES"))
		{
			System.out.println("Great to Hear That !! " + name + ", So Lets Start Our Game.");

			System.out.println("  ");

			System.out.println("You Woke up in a dark Haunted , unfamiliar room. You Heared Creapy Noice with pain, and you can't" + "" + 
				"remember how you got here. As you look around, you notice a faint light coming from under the door.");

			System.out.println("Do You Want To Go and Explore Whats Behind That Haunted Door ? (Yes / No)");
			String choice1 = sc.next().toUpperCase();
			if (choice1.equals("YES"))
			{
				System.out.println("You Get Up And Go Towards The Door , Do You :" +
					"1. Push Open The Door and Step Into The Door " +
					"2. Look For Any Clue In The Curent Room  (choose : 1 / 2)");
					
					
					
				int choose = sc.nextInt();

				if (choose == 1)
				{
					System.out.println("You step into the hallway and see a shadowy figure at the end. Do you:  1. Call out to the figure."
					+ " 2. Quietly follow the figure.");
					
				}
			}

		}

		else 
		{
			System.out.println("You Missed A Chance To Play A Best Haunted Game ):");
		}




		
	}
}