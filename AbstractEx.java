abstract class Parent{
	abstract void m1();
	abstract void m2();
}
abstract class ChildA extends Parent{
	void m1(){
		System.out.println("M1() Implimented By ChildA");
	}

}

class GrandChildA extends ChildA{
	void m2()
	{
		System.out.println("GrandChild Implimened M2()");
	}
}

abstract class ChildB extends Parent{
	void m1()
	{
		System.out.println("M1() Implimented by childB");
	}
	void m2()
	{
		System.out.println("M2 () Implimented by childB");
	}

	abstract void m3();
}
abstract class GrandChildB extends ChildB
{
	void m3()
	{
		System.out.println("M3() Implimented by GrandChildB" );
	}


}

abstract class GrandChildC extends ChildB{

}

class ExampleA extends GrandChildC
{
	void m3(){
		System.out.println("Example A Implimented m3()");
	}
}

class AbstractEx
{
	GrandChildA obj = new GrandChildA();
	obj.m1();
	obj.m2();

	GrandChildB obj1 = new GrandChildB();
	obj1.m1();
	obj1.m2();
	obj1.m3();

	ExampleA obj2 = new ExampleA();
	obj2.m3();
}