class Mob{
	String processor;
	String brand;
	String model;
	String color;
	int ram;
	double price;
	double camera;
	double battery;

	Mob(String processor, String brand, String model, String color, int ram, double price, double camera, double battery)
	{
		this.processor= processor;
		this.brand = brand;
		this.model= model;
		this.color = color;
		this.ram = ram;
		this.price = price;
		this.camera = camera;
		this.battery = battery;
	}

	void displayMob(){
		System.out.println("Mob Info ");
		System.out.println("Procesor :" +processor);
		System.out.println(" Brand : "+ brand);
		System.out.println("Model :" + model);
		System.out.println("color :" + color);
		System.out.println("Ram :" + ram);
		System.out.println("Price :" + price);
		System.out.println("camera :" + camera);
		System.out.println("battery :" + battery);
		System.out.println();

	}
}

class Processor{

	String os;
	String clockSpeed;
	int ports;
	String name;

	Processor(String os, String clockSeed, int ports, String name)
	{
		this.os = os;
		this.clockSpeed = clockSpeed;
		this.ports = ports;
		this.name = name;
	}
	void displayProcessor(){
		System.out.println("Processor Info ");
		System.out.println("Os :" +os);
		System.out.println(" Clock Speed : "+ clockSpeed);
		System.out.println("ports :" + ports);
		System.out.println("name :" + name);
		System.out.println();

	}

}

class Os {
	String version;
	String name;
	String type;
	String releaseDate;

	Os(double version, String name, String type, String releaseDate)
	{
		this.version = version;
		this.name = name;
		this.type = type;
		this.releaseDate = releaseDate;
	}
	void os(){
		System.out.println("Os Info ");
		System.out.println("Version :" +version);
		System.out.println(" name : "+ name);
		System.out.println("Type : "+ type);
		System.out.println("Release Date : " +releaseDate);
		System.out.println();

	}
}

class Charger
{
	String type;
	int power;
	int watt;
	double price;

	Charger(String type, int power, int watt, double price)
	{
		this.type = type;
		this.power = power;
		this.watt = watt;
		this.price = price;
	}
	void charger(){
		System.out.println("Charger Info ");
		System.out.println("type :" +type);
		System.out.println(" power : "+ power);
		System.out.println("Watt : "+ watt);
		System.out.println("Price : " +price);
		System.out.println();

	}
}

class Headphones{
	String name;
	String brand;
	String type;
	double price;
	String color;
	String driver;

	Headphones(String name, String brand, String type, double price, String color, String driver)
	{
		this.name = name;
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
		this.driver = driver;
	}
}

class Powerbank{
	int mah;
	int ports,
	double price;
	String brand;
	String batterytype;
	String color;

	Powerbank(int mah, int ports, double price, String brand, String batterytype, String color)
	{
		this.mah = mah;
		this.ports = ports;
		this.price = price;
		this.brand = brand;
		this.batterytype = batterytype;
		this.color = color;
	}
}

class Simcard{
	String name;
	long number;
	String typeg;
	String type;

	Simcard(String name, long number, String typeg, String type)
	{
		this.name = name;
		this.number = number;
		this.typeg = typeg;
		this.type = type;
	}
}

class Mobile{
	public static void main(String[] args) {
		
	}
}