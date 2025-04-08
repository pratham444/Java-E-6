class Largest3
{
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 3;

		int max = (a>b)?(a>c ? a : c):(b>c ? b : c);
		System.out.print("Biggest Nuber Among Three :" +max);
	}
}