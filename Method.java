import java.util.Scanner;
class Method
{
	static int num;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number :");
		num = sc.nextInt();
		


	}
	public static boolean evenOdd( int num1 = num)
	{
		
		return (num%2 == 0);
	}
}
