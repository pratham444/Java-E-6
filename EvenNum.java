class EvenNum
{
	public static void main(String[] args) {
		int range = 100;
		EvenNumber(2, range);
	}
	public static void EvenNumber(int num, int range)
	{
		System.out.println(num);
		num+=2;

		if(num>range)
			return;

		EvenNumber(num, range);
	}
}