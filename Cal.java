import java.util.Scanner;
class Cal
{
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.println("If You Want To Print Patterns (* Patterns) Press '1'");
		System.out.println();
		System.out.println("If You Want To Perform Aritmetic Operations Enter These Symbols (-,/,%,+,*)");
		System.out.println();
		System.out.print("Enter Your Choice Here : ");
		char ch = sc.next().charAt(0);

		if (ch=='-' || ch=='+' || ch=='*' || ch=='/' || ch=='%' || ch == '1')
		{
			if(ch=='-')
				SubTheNum();
			if(ch=='+')
				AddTheNum();
			if(ch=='*')
				MulTheNum();
			if(ch == '/')
				DivTheNum();
			if(ch == '%')
				ModTheNum();
			if(ch== '1')
				Patterns();
		}
		else
		{
			System.out.println("Please Enter The Correct Symbol");
		}
	}

	public static void SubTheNum()
	{
		System.out.print("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int num2 = sc.nextInt();

		int sub = num1 - num2 ;

		System.out.println("Your Output is : " + sub);
	}

	public static void AddTheNum()
	{
		System.out.print("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int num2 = sc.nextInt();

		int add = num1 + num2 ;

		System.out.println("Your Output is : " + add);
	}

	public static void MulTheNum()
	{
		System.out.print("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int num2 = sc.nextInt();

		int mul = num1 * num2 ;

		System.out.println("Your Output is : " + mul);

	}

	public static void DivTheNum()
	{
		System.out.print("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int num2 = sc.nextInt();

		int div = num1 / num2 ;

		System.out.println("Your Output is : " + div);

	}

	public static void ModTheNum()
	{
		System.out.print("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int num2 = sc.nextInt();

		int mod = num1 % num2 ;

		System.out.println("Your Output is : " + mod);
	}
	public static void Patterns()
	{
		System.out.println();
		System.out.println("Choose Your Patterns From The List By Entering The Number (1,2,3,4,etc...)");
		System.out.println();
		System.out.println("Options Are As Follows : ");
		System.out.println();
		System.out.println("1. 4x4 Solid Rectangle Pattern ");
		System.out.println("2. 4x5 Hollow Rectangle Pattern ");
		System.out.println("3.  Hollow Triangle Pattern ");
		System.out.println("4. Right Angled Triangle Pattern");
		System.out.println();
		System.out.print("Enter Your Option : ");
		char ch = sc.next().charAt(0);

		if (ch=='1' || ch=='2' || ch == '3' || ch == '4')
		{
			if (ch=='1')
				SolidRectangle();
			if (ch=='2')
				HollowRectangle();
			if (ch == '3')
				HollowTriangle();
			if (ch=='4')
				RightAngleTriangle();
		}
		else 
		{
			System.out.println("Enter Valid Number ");
		}

	} 

	public static void SolidRectangle()
	{
		for (int i = 1; i<=4 ; i++ ) {

			for (int j = 1; j<=4; j++)
			{
				System.out.print(" *");

			}
			System.out.println();
			
		}
	}

	public static void HollowRectangle()
	{
		for (int i = 1; i<=4;i++ ) {

			for (int j=1; j<=5 ; j++ ) {
				if(i==1 || j==1 || i==4 ||j==5 )
					System.out.print(" *");
				else
					System.out.print("  ");
				
			}

			System.out.println();
			
		}
	}

	public static void HollowTriangle()
	{
		int rows = 4; // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            
            // Print stars and spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == rows) {
                    // Print stars at edges and in the last row
                    System.out.print("*");
                } else {
                    // Print spaces inside the hollow triangle
                    System.out.print(" ");
                }
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void	RightAngleTriangle ()
    {
    	  int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next row
        }
    }

}