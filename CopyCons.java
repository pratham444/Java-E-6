class Education
{

	String course;
	int yop;
	double marks;
	String uni;

	Education(String course, int yop , double marks, String uni)
	{
		super();
		this.course = course;
		this.yop = yop;
		this.marks = marks;
		this.uni = uni;
	}

	public void displayEducation()
	{
		System.out.println(" Education Details ");
		System.out.println("Course :" + course);
		System.out.println("YOP : " + yop);
		System.out.println("Marks : " + marks);
		System.out.println("UNI : " + uni);
		System.out.println();
	}
}

class Address 
{
	String area;
	String city;
	String state;
	int pincode;

	Address(String area, String city, String state, int pincode)
	{
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public void displayAddress()
	{
		System.out.println("Address Info ");
		System.out.println("Area :" + area);
		System.out.println("City :"+ city);
		System.out.println("State :" + state);
		System.out.println("PinCode :" + pincode);
	}
}

class Student
{
	String name;
	long contact;
	String dob;
	String email;
	Address address;
	Education edu;

	Student(String name , long contact, String dob, String email, Address address, Education edu)
	{
		this.name = name;
		this.contact = contact;
		this.dob = dob;
		this.email = email;
		this.edu = edu;
		this.address = address;
	}

	//Copy of the constructor
	Student(Student old)
	{
		this.name = old.name;
		this.contact = old.contact;
		this.dob = old.dob;
		this.email = old.email;
		this.edu = old.edu;
		this.address = old.address;
	}

	public void displayStudent()
	{
		System.out.println("Student Details ");
		System.out.println("Name :" + name);
		System.out.println("Contact :" + contact);
		System.out.println("Email :" + email);
		System.out.println("DOB :" + dob);
		System.out.println();
		address.displayAddress();
		System.out.println();
		edu.displayEducation();
	}
}

class CopyCons
{

	public static void main(String[] args) {
		Address address = new Address("Deccan", "Pune", "MH", 411016);

		Education edu = new Education("BCA", 2024, 9.8, "SRTMUN");

		Student old = new Student("Ramesh Kumar", 9766414494l, "prathamkulthe444@gmail.com", "01-02-1111", address, edu);

		old.displayStudent();

		System.out.println("_________________________________________________________");
		System.out.println();
		System.out.println("Copy Below");
		System.out.println();
		Student copy = new Student(old);
		edu.displayEducation();

		System.out.println("___________________________________________________________");
		System.out.println("Copy After Change");
		copy.edu.course = "MCA";
		copy.displayStudent();

		System.out.println("______________________________________________________________");
		System.out.println("Original obj after change in copy obj");
		System.out.println();
		old.displayStudent();
	}
}