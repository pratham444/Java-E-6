import java.util.Scanner;
class assi
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in)
		System.out.print("Enter The Number :");
		int num = sc.nextInt();

		boolean flag = true;
		if (num <= 0)
		{
			flag = false;
		}
		else 
		{
			for (int i = 2; i * i <= num; i++ )
			{
				if (num % i == 0)
				{
					flag = false;
					break;

				}
			}
			 
		}

		int largeprime = num + 1;
		while(true)
		{
			flag = true;
		}
	}
}
