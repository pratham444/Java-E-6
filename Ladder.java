import java.util.Scanner;
class ladder
{
	public static void main(String[] args) 

	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Marks Obtaineed :");
		double marks = sc.nextDouble();

		if (marks <= 500 && marks >=0)
		{

			double per = marks / 500 * 100;

			System.out.print("Total Percentage Gained :"+ per);

			if (per >= 90 )
			{
				System.out.println(" You Are Out Of World !" );

			}

			else 
			{
				if ( per > 75 && per < 90)
				System.out.print( " Fc With Distinct");
			}

			

		}



	}
}