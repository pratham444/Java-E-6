class Engine {

	String bhp;
	String type;
	String cc;
	int piston;
	int gear;

	Engine(String bhp, String type, String cc, int piston, int gear)
	{
		this.bhp = bhp;
		this.type = type;
		this.cc = cc;
		this.piston = piston;
		this.gear = gear;
	}

	void displayEngine()
	{
		System.out.println();
		System.out.println("Engine Info");
		System.out.println("BHP :" + bhp);
		System.out.println("Type :" + type);
		System.out.println("CC :" +cc);
		System.out.println("Piston :" + piston);
		System.out.print("Gear : "+ gear);
		System.out.println();
	}


}

class Car {

	String brand;
	String model;
	String	type;
	String	color;
	int seatingcap;
	double price;
	Engine engine;

	Car (String brand, String model, String type,String color, int seatingcap,double price)
	{
		this.brand = brand;
		this.model= model;
		this.type= type;
		this.color=color;
		this.seatingcap= seatingcap;
		this.price= price;
		this.engine = new Engine("22", "SHK", "120", 2, 4);
	}

	void displayCar()
	{
		System.out.println();
		System.out.println("Car Info");
		System.out.println("brand : "+ brand);
		System.out.println("model :" + model);
		System.out.println("type : " + type);
		System.out.println("color : " + color);
		System.out.println("SeatingCap : " + seatingcap);
		System.out.println("Price : " + price);
		System.out.println();

	}

}

class CarDriver {

	public static void main(String[] args) {
		Car obj = new Car("Maruti", "OMNI", "SUV", "White", 10, 350000);


		obj.displayCar();
		obj.engine.displayEngine();

		
	}

	//ass = writeame program with differnet example 
}