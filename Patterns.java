class Patterns
{
	public static void main(String[] args) {
		for (int i = 1; i<=4 ; i++ ) { //Loop for Rows OUTER LOOP

			for (int j = 1; j<=5; j++) //Loop For Columns INNER LOOP
			{
				if(i==1 || j==1 || i==4 || j==5)
				System.out.print(" *");
			else
				System.out.print("  ");
			}

			System.out.println();
			
		}
	}
}