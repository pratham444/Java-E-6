import java.util.Scanner;
class Factorialll{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		int fact = 1;

		for (int i = 1 ; i <= num; i++)
		{
			fact *= i;

		}

		System.out.println("Factorial : " + fact);
	}
}
