import java.util.Scanner;
class LargeNum
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter First Number :");
		int a = sc.nextInt();
		System.out.print("Enter Second Number :");
		int b = sc.nextInt();

		int max = (a > b)?(a):(b);

		System.out.println("Largest Number Among " + a + "," + b + " is : " + max);
	}
}