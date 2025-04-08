import java.util.Scanner;
class RajaSoftCode
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in)
		int num = sc.nextInt();

		int beforeprime = 0;
		for (int i = num -1 ; i >=2 ; i-- )
		{
			boolean flag = true;
			for (int j = 2; j<i; j++)
			{
				if (i%j == 0)
				{
					flag = false;
					break;
				}
			}
			if (flag)
				beforeprime = i;
			if (beforeprime!=0)
				break;
			
			if(beforePrime !=0)
				break;
				
			
		}

	}
}