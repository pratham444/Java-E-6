import java.util.Scanner;
class Calculator
{
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int num2 = sc.nextInt();
		System.out.print("Enter An Operator :");
		char ope = sc.next().charAt(0);
		boolean flag = true;


		int output = 0;
		if (ope =='+')
		{
			output = num1 + num2 ;

		}
		else if (ope =='-')
		{
			output = num1 - num2;

		}
		else if(ope =='*')
		{
			output = num1 * num2;
		}
		else if (ope == '/')
		{
			output = num1 / num2;
		}
		else if (ope == '%')
		{
			output = num1 % num2;

		}
		else
		{
			System.out.println("Invalid Operator Entered");
			flag = false;
		}

		if (flag = true)
			{
				System.out.println(num1+ " " +ope+ " " + num2 + " =" +output);
			}
		}
	}
