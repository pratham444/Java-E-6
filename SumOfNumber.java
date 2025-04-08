class SumOfNumber
{
	public static void main(String[] args) {
		int num = 123;
		int dup = num;
		int sum = 0;
		for (int i = num ; i >0; i /=10 )
		{
			sum += i%10;

		}
		
		System.out.println("Sum of Digit of " + num +  " is " + sum);

	}
}