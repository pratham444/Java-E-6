class Testing1 //checking the accessibility of non-static variable in non static context in same class and different class
{
	int a ; // declared non static variable a
	int b; // declared non static variable b

	static Testing1 obj0 = new Testing1(); // created an static object of Testing1 class in order to access the non-static m1() inside static blocks main()
	static Testt obj1 = new Testt(); //created an static object of Testt class in order to access its members (here to invoke m2() in main())
	
	public static void main(String[] args) {
		obj0.m1(); // invoked m1() with the help of object reference as m1() is non static 

		obj1.m2();//invoked m2() with the help of object reference of Testt class as m2() is in Testt class and we created its object (obj1)
	}

	public void m1() // non static method m1()
	{
		System.out.println(" Non-Static m1() From Testing1 class ");
		a = 10; // directly accesed non static variable a and initiaalized value in it
		b = 10; // directly accesed non static varibale b and initialized value in it 
		int c = a + b ; // directly performed operation on a and b without object reference 
		System.out.println(c); // output 20

	}
	
	// if we want to access non static 
	 //variable inside  static context within same class or different class we need to create an object and use the reference to access them...
}

class Testt // created new class
{
	Testing1 obj2 = new Testing1(); // created non static object of Testing1 Class as we want to access its members in non-static context
	public void m2()// non-static method m2() in Testt Class
	{
		System.out.println(" Non-static m2() from Testt Class ");
		obj2.a = 20; //reinitialized the non static var a from Testing1 class with the object reference created in Testt class (obj2) 
		obj2.b = 20; //reinitialized the non static var b from Testing1 class with the object reference created in Testt class (obj2) 
		System.out.println(obj2.a + obj2.b); // output 40
	}
}

