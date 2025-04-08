import java.util.Scanner;
class Factoriall 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Number To Check Factorial : ");
		int a = sc.nextInt();

		for (int i = 1; i<=a ; i++ ) {

			if (a % i == 0)
				System.out.println(i);
			
		}
	}
}