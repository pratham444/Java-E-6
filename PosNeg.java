import java.util.Scanner;
class PosNeg
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number :");
		double num = sc.nextDouble();

		if ( num > 0 )
			System.out.println("Number Entered Is Positive !!");
		else
		{
			if (num == 0)
				System.out.println("Number Is Nutral (0)");
			else
			System.out.println("Number Entered Is Negative !!!");
		}
	}
}