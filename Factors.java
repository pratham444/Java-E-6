import java.util.Scanner;
calss Factors1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Num :");
		int num = sc.nextInt();

		for(int i= 1; i <= num; i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}

	}
}