class cons // constructor recurtion explained 
{

	cons(){ // here in the constructor we printed hello, and created obj inside constuctor so whenever the main method gets executed the obj creation statements in 
		//the main method calls constructor and then the control goes to constructor and the constructor block gets executed and there is an object creation statement in constructor too
		//so that statement again calls the constructor and this process goes on in loop until the stack overflow error this is the constuction recurtion process. 
			
			System.out.print("Hello, inside Cons");
			cons obj = new cons();
		}		

	public static void main(String[] args) {
		
		cons obj1 = new cons();
		System.out.print("Hello, Outside Cons");

	}
}