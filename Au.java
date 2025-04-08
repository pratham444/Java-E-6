class Au
{
	public static void main(String[] args) {
		

		int num = 25;
		int cnt = 0;
		int div = 1;

		for ( int i = num; i >= 0 ; i/=10)
		{
			cnt++;
		}

		for (int i =1; i<=cnt ; i++ )
		{
			div = div * 10;
			
		}

		int square = num * num;
		int lastDigit = square % div;

		System.out.println(lastDigit == num ? num + " is automporphc " : num + " is Not AutoMorphic");


	}
}