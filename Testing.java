class Testing 
{
	static int a ;

	static {
		a = 10;
		System.out.println(a);
		
	}

	static{
		a = a - 2;
		System.out.println(a);
		System.exit(0);
	}
}