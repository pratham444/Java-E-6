class Ex{

	int a = 1;

	class Ex1{

		int b = 10;

		void m1()
		{
			System.out.println("Hello Inner Class Non- Static Method M1()");
		}

	}
}


class Demo{ // 2nd way of accessing inner class

	int c = 13;

	InnerDemo innerDemo = new InnerDemo(); // to acces the memebrs (non-static) of an inner class like a field we can create an object of that class in outer class

	class InnerDemo{

		int d = 12;
		void m2()
		{
			System.out.println("M2() From InnerDemo Class ");
		}
	}

}



class Access extends Ex{
	public static void main(String[] args) {
			Ex obj = new Ex(); //outer class instance 

			//in order to acces the data memebers (non static) of inner class we need to create object of that class with help of outer class reference and its instace 

			Ex.Ex1 obj1 = obj.new Ex1();  // here we are telling the compiler to go to Ex class Then Ex1 class then we are creating
											// reference variable then we are calling reference of previous object of Ex class and then we are calling the constructor of Ex1 class 
	   		System.out.println(obj.a);

	   		System.out.println(obj1.b);

	   		obj1.m1();

	   		// 2nd method to acces the inner class
	   		Demo demo = new Demo();

	   		demo.innerDemo.m2(); // here we are first refereing the object of Demo Class Then we are Referening to the field/Var which stores Instance of InnerDemo Class 
	   								//then we are accessing the Members of InnerDemo class here m2 () method 
		
	}

}

