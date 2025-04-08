import java.util.Scanner;
class Pay
{
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Salary :");
		double salary = sc.nextDouble();
		System.out.print("Enter Your Target Score :");
		int score = sc.nextInt();

		if (score > 90 && score < 100)
		{

			salary = salary * 0.03 + salary;

			System.out.println("Updated Salary is :"+salary );

		}

		else
		{
			if (score < 90 && score > 0)
			{
				salary = salary * 0.01 + salary;
				System.out.println("Updated Salary is : " + salary);

			}
			
			else 
				System.out.println("Enter Valid Score");
		}
		
	}
}