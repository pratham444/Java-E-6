class Swap
{
	public static void main(String[] args) {
		int a = 2;
		int b =3;

		System.out.println("Value of a :" + a);
		System.out.println("Value of b:" + b);

		 a = a + b;
		 b = a - b;
		 a = a  - b;
		System.out.println("Value of a After Swap :" +a);
		System.out.println("Value of b after Swap : "+ b);

	}
}