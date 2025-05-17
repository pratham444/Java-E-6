class Uni {
	String name;
	String address;
	String estYear;
	String dean;
	int colleges;
	int code;

	Uni(String name, String address, String estYear, String dean, int colleges, int code)
	{
		this.name = name;
		this.address = address;
		this.estYeaar = estYear;
		this.dean = dean;
		this colleges = colleges;
		this.code = code;

	}

	void displayUni()
	{
		System.out.println();
		System.out.println("Universtiy Info");
		System.out.println("Name : "+ name);
		System.out.println("Address : "+ address);
		System.out.println("Establish year : "+ estYear);
		System.out.println("Dean Name: "=dean);
		System.out.println("Colleges : " + colleges);
		System.out.println("Code : " + code);
	}
}
class Collage
{
	String name ;
	String address;
	String principle;
	int students;
	int staffs;
	String grade;
    int code;
	int departments;

	Collage(String name, String address, String principle, int students, int staffs, String grade, int code, int departments)
	{
		this.name = name;
		this.address = address;
		this.principle = principle;
		this.students = students;
		this.staffs = staffs;
		this.grade = grade;
		this.code = code;
		this.departments = departments;
	}

	vooid displayCollages()
	{
		System.out.println();
		System.out.println("Collage Details");
		System.out.println("Name : "+ name);
		System.out.println("Address :" + address);
		System.out.println("Studens Count : " +students);
		System.out.println("Principle :" + principle);
		System.out.println("Staff Count :"+ staffs);
		System.out.println("Grades : " +grade);
		System.out.println("CLG Code :" +code);
		System.out.println("Departments :" +departments);
	}


}

class Department{
	String name;
	String hod;
	int staff;
	int students;

	Department(String name, String hod, int staff, int students)
	{
		this.name = name;
		this.hod = hod;
		this.staff = staff;
		this.students = students;
	}

	void displayDepartments()
	{
		System.out.println();
		System.out.println("Name : " + name);
		System.out.println("HOD : " + hod);
		System.out.println("Staff : "+ staff);
		System.out.println("Students : " + students);
	}

	
	class UniDriver()
	{
		public static void main(String[] args) {
			
		}
	}
}
