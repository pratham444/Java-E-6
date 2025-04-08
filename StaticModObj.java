class StaticModObj 
{
	static int a; /*static variable a declaration (these variabls can be accesed directly withing 
	               same class and with class name as a reference in other class)*/
	static int b; /* static variable b declaration (these variabls can be accesed directly withing 
	                same class and with class name as a reference in other class)*/

	static //static block to initialize the static variables 
	{  
		a = 5; // initialized the static variable a with value as it is static var we can directly call it in same class
		b = 2;  // initialized the static variable b with value as it is static var we can directly call it in same class
	}

	public static void main(String[] args) { // main method to call other methods 

		m1(); // called ( invoked ) m1() directly as it is static method it can be called directly in static context

		StaticModObj2.m3(); /*called m3() with the class name as the reference as its in another call and is static so no need to create an object
							and we are calling it in main method because first the control is going to m1() and m1() is calling m2() and m2() is
							returning value so we cant write any code or call any method after the return statements because it will cause CTE
							( Unreachable statement as return will terminate the further execution of the block ) and after executing the m2()
							control is comming back to m1() so we can call m3() in m1() also but as we want to print the output of m3() at last
							we are calling m3() in main method as the contol will come back to main method at last */
	}

	public static void m1() /* this is static method m1() so we can call it directly in the same class and in another 
	                           class we need class name as reference */
	{
		System.out.println();
		System.out.println(" static m1() Method from StaticObjMod Class " );
		System.out.println(" Result of Operation Performed is : " + (a + b) ); 
							// directly performed addition on the var as they are static they can be called directly

		System.out.println(" Result : "+ StaticModObj2.m2(10+10, 20)); /*as m2() is static method in other class we are calling it with the class name
		                                             as reference and it is parametarised method so we are passing actual arguments(values) in it
		                                             and we are calling it in printing statements because it will return value so we need to print those*/
		

	}
}

/* 1. we can call static members in any block ( context ) weather it is static or non-static directly without any object ( instance ) creation.
   2. we can call non-static members directly only in non-static context to call them in static context we need object creation. */

class StaticModObj2
{
	public static int m2(int c , int d) /*this is static method in StaticObjMod class which can be called 
	                                     any where with the class name as reference and this conatins formal arguments so we need to pass values
	                                     while calling it and its return type is int so we need to return int value  */
	{
		System.out.println();
		System.out.println(" static m2() method from StaticObjMod2 Class");

		return (c * d); // we are returning multiplication of the passed actual arguments.
		

	}

	// now we are going to change the values of static variabels and perform any operation on them in this below method m3()

	public static void m3()
	{
		StaticModObj.a = 2 ;/* as the variable a & b in the StaticModObj class is static we can call them 
		                       directly with class name as reference so we are calling them and reinitializing the vlaues for further operation
		                       which we are performing in m3() */
		StaticModObj.b  = 5 ;
		System.out.println();
		System.out.println(" m3() from StaticModObj2 Class ");
		System.out.println( " Result : " + (StaticModObj.a > StaticModObj.b) ); /* here we are checking weather the var 
		                                                                      a is > than var b as we updated the values from a = 5 and b = 2 
		                                                                      to a = 2 and b = 5 the output should be false */
	}
}


