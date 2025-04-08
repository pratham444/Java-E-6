class AToZ
{
	static char ch = 'A';

	public static void main(String[] args) {
		m1();
	}

	public static void m1()
	{
		System.out.println(ch++);
		if(ch>'Z') //if (ch==91)
			return;

		m1();
	}
}