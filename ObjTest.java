class ObjectEx
{
	int a; //non static varible
	int b; // non static var

	static ObjectEx obj = new ObjectEx(); //  created static global object of ObjectEx Class to use the variabels inside static blocks...because we cant use non static var in static context 

	static ObjEx2 obj2 = new ObjEx2(); // created static global object of ObjEx2 class to call the m3() from the ObjEx2 Class in static methods of ObjectEx class ( main )

	static{ // static block to initialize the values in the non static  variabels with the help of object obj.a = 10 ; .........

		System.out.println("Static Block 1");
		obj.a = 10; // initialized the value in non static variable a with the help of object reference 

		obj.b=20; // initialized the value in non static variable a with the help of object reference

	}
	

	public static void main(String[] args) { // used main method to call other methods 

		m1();		 			// m1() is the static method from the same class so we dirctly called it


		obj2.m3(); 			/* m3() is the non static method from ObjEx2 class so we called it with the object reference ( static global object Which we created before) 
		 					because we cant call the non static method dirctly thats why we called it with the object reference ( to call the non static method we need to create its object)*/

		obj.a = 20;  // here we reinitialized the values of non static var before calling the static  method m4() so that the values changed from a = 10 to a = 20 and b = 20 to b = 10...and output is true
		obj.b = 10;
		ObjEx2.m4();	 	/* m4() is the static method from ObjEx2 Class we can call the static method withoud creating its object 
							( we can call static methhod from any class with just class name as the reference ) */
	}

	public static void m1() // m1() static method of ObjectEx Class
	{

		System.out.println(obj.a + obj.b); //perforemd addition on the non static variable of ObjectEx class with the object reference because we cant use non static var directly in static context
		m2(); // called m2() method 


	}

	public static void m2() // m2() static method of ObjectEx Class
	{
		System.out.println(obj.a - obj.b); //performed substraction on the non static var of ObjectEx class with the object reference because we cant use non static var directly in static context

	}
}

class ObjEx2 // another class ObjEx2
{
	ObjectEx     obj =     ObjectEx.obj; 
	/*datatype  ref var  stored the static variable named obj of class ObjectEx in the non static obj var of ObjEx2 Class This is not needed since
						    the var of ObjectEx class which holds the reference of ObjectEx is static we can call it by just class name as reference in static block but
						    to use in non static blocks we need to create an object  */


	

	public void m3() //m3() is the non static method 
	{
		System.out.println(obj.a * obj.b); // here we accesed the variabels of ObjectEx class With the help of Object which we created in this class (ObjEx2) named obj and performed *
	}

	public static void m4() //m4() is the static method 
	{

		System.out.println(ObjectEx.obj.a >= ObjectEx.obj.b); 
		
	}
}