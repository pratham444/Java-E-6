class EvenOddDigits
{
	public static void main(String[] args) {
		
		int num = 123456789;
		int even = 0;
		int odd = 0;

		for(int i = num; i>0; i/=10)
		{
			int rem = i%10;
			if(rem%2 ==0)
				even+=rem;
			else 
				odd+=rem;

		}
		System.out.println("Number is " + num);
		System.out.println("Even number" + even);
		System.out.println("Odd Number " + odd);
	}
}