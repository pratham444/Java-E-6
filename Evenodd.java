import java.util.Scanner;
class EvenOdd{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		if(num % 2 == 0 )
		{
			System.out.println("Its Even ");
		}
		else{
			System.out.println("Its Odd");
		}
	}
}