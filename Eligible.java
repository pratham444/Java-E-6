import java.util.Scanner;
class Eligible
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age :");
		int age = sc.nextInt();
		System.out.print("Enter the Ammount Of Property :");
		long property = sc.nextLong();
		System.out.print("Enter Your Surname :");
		String surname = sc.next();

		if ( (age > 21 && property >= 10000000 )|| surname.equalsIgnoreCase("Ambani"))
		{
			System.out.println("Eligible For Marriage!!");

			
		}

		else 
		{

			System.out.println( "Not Eligible For Marriage!!!");
		}
	}
}