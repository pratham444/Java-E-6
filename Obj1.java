class Obj1
{

	String name;
	String height;
	String skinColor;
	String hairColor;
	String nature;

	public void displayDetails()
	{
		System.out.println("Display Human Details ");
		System.out.println(" Name : " + name);
		System.out.println("Height : " + height);
		System.out.println("Sking Color : "+ skinColor);
		System.out.println("hair Color : " + hairColor);
		System.out.println(" Nature : "  + nature);

	}

	public void	behaviours()
	{
		System.out.print(" Sleeping ");
		System.out.println(" Reading ");
		System.out.println(" Learning ");
		System.out.println(" Playing ");
	}

}

class ObjDriver{

	public static void main(String[] args) {
		Obj1 obj = new Obj1();
		System.out.println();

		obj.name = "Pratham";
		obj.height = " 5.11 ";
		obj.skinColor = " light dark ";
		obj.hairColor = " Black ";
		obj.nature = " Nutral ";
		System.out.println();
		obj.displayDetails();
	}
}