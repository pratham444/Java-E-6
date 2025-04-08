import java.util.Scanner;
class hi
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = sc.nextInt();


		
		if (a%5 == 0 && a%2 == 0)
		{
			System.out.println("Hi5 hi2");
		}


		if (a%5 == 0 && a%2 != 0)
		{
			System.out.println("hi5");

		}

		if (a%2 ==0 && a%5 != 0)
		{
			System.out.println("hi2");
			
		}

		

	}
}