import java.util.Scanner;
class hat 
{
	static String username;
	static String password;
	static long contact;
	public static void main(String[] args) 
	{
		createCab();
		welcomeModule();
		
	}

	public static void createCab()
	{
	
	}
	public static void welcomeModule()
	{
		Scanner sc = new Scanner(System.in);
		for (; ; )
		{
			System.out.println("Welcome BlaCar");
			System.out.println();
			System.out.println("1: Create Account");
			System.out.println();
			System.out.println("2: Login ");
			System.out.println(" enter option ");
			System.out.println();
			int opt = sc.nextInt();
		    System.out.println();
			switch (opt)
			{
			case 1:createPassenger(sc);break;
			case 2:loginPassenger(sc);break;
			default:System.out.println(" enter invalid option ");
			
			}


		}
	}

		public static void  createPassenger(Scanner sc)
		{
			System.out.println("Create Account");
			System.out.println();
			sc.nextLine();
			System.out.println("Enter Your Name");
			username = sc.nextLine();
			System.out.println("Contact Number");
			contact = sc.nextLong();
			System.out.println("Password");
			password = sc.next();
			System.out.println();
			System.out.println("Account Create Successfully");



		}

		public static void loginPassenger(Scanner sc) {
		if(username==null)
		{
			System.out.println("CREATE ACCOUNT FIRST");
			System.out.println();
			return;
		}
		System.out.println(" LOGIN MODULE");
		System.out.println();
		System.out.print("Username : ");
		String username1=new Scanner(System.in).nextLine();
		sc.nextLine();
		System.out.print("Password : ");
		String password1=sc.next();
		if (username.equals(username1) && password.equals(password1))
		{
			homePage(sc);			
		}
		else{
			System.out.println("INVALID CRED");
		}
	}

	public static void homePage(Scanner sc)
	{
		for (; ; ) 
		{
			System.out.println();
			System.out.println("HOME MODULE");
			System.out.println();
			System.out.println("1.BOOK A CAB");
			System.out.println("2.CANCLE A CAB");
			System.out.println("3.PREVIOUS RIDES");
			System.out.println("4.LOGOUT");
			System.out.println();
			System.out.print("ENTER A OPTION : ");
			int opt=sc.nextInt();
			System.out.println();
			switch(opt)
			{
			case 1: bookCab();break;
			case 2: cancleCab();break;
			case 3: previousRides();break;
			case 4: System.out.println("THANK YOU VIST AGAIN");
					System.exit(0);
				default: System.out.println("INVALID OPTION ");break;
			}	
		}	
	}
			public static void bookCab()
			{
				System.out.println("BOOK CAB");
			}
			public static void cancleCab()
			{
			System.out.println("CANCLE CAB");
			}
			public static void previousRides()
			{
			System.out.println("PREVIOUS RIDES");
			}




		
		


	

	
}