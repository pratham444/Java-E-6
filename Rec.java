class Rec
{
	static{ //executing the program without main method with the help of static block as static block gets executed at very beginning 
		    //of the exectuion it gets loaded first in the class loeader subsystem 

		System.out.print("Hello"); // this line gets exectued but with the error main method not found in the class so to prevent this we are using the next statement System.exit(0);

		System.exit(0);// this statement prevents the error cant find main method in the class 

		//here System referes to the  built-in class in java and exit is parameteriesed 
		//function/method presesnt inside the System class which terminates the execution of the program
	}
}