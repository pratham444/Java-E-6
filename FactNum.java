class FactNum
{
	public static void main(String[] args) {
		
		int num = 4;
		int fact = 1;
		int op = findFact(num, fact);
		System.out.println(op);
	}

	public static int findFact(int num, int fact)
	{
		fact = fact * num;
		num --;

		if (num==0)
			return fact;

		
		return findFact(num, fact);

	}
}