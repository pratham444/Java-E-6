import java.util.Scanner; //Using Method
class PrimeNum
{
	static int num = 7; //use scanner class to take input from user
	public static void main(String[] args) {
		
		if(isPrime())
		{
			System.out.println(num+ " Is Prime");
		}
		else{
			System.out.println(num+ " not Prime");
		}
	}

	public static boolean isPrime()
	{
		if (num <2)
			return false;

		for (int i = 2; i<num; i++)
			if(num%i==0)
			return false;

		return true;
	}
}