import java.util.Scanner;
class PrimeOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Number :");
		int num = sc.nextInt();

		int count=0;

		//logic 

		for (int i = 1; i<=num ; i++ ) //number which is divisible by 1 and only by itself is a prime number i<=num will define the times loop will run if we type a ruff value there it will run till that value
		{
			if(num%i==0)
			{
				count++; //The count variable helps us keep track of how many numbers divide num perfectly
			}
		}
		if (count==2)
		{
			System.out.println(num+" is Prime number");
		}
		else 
		{
			System.out.println(num+" Not A Prime Number");
		}
	}
}