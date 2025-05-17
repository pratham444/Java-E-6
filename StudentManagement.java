import java.util.ArrayList;
import java.util.Scanner;

class Driver {
    public static void main(String[] args) {
        StudentManagement.start();
    }
}

class StudentManagements {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void start() {
        while (true) {
            System.out.println("\n=== WELCOME ===");
            System.out.println("1. Student");
            System.out.println("2. HR");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> studentMenu();
                case 2 -> hrMenu();
                case 3 -> {
                    System.out.println("Thank you!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    public static void studentMenu() {
        while (true) {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1. Create Profile");
            System.out.println("2. View Profile");
            System.out.println("3. Mock Ratings");
            System.out.println("4. Requirements");
            System.out.println("5. Back");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> createProfile();
                case 2 -> viewProfile();
                case 3 -> viewMockRatings();
                case 4 -> viewRequirements();
                case 5 -> { return; }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    public static void createProfile() {
        System.out.print("Enter Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.next();
        System.out.print("Enter Contact Number: ");
        long contact = sc.nextLong();
        System.out.print("Enter Address: ");
        sc.nextLine();
        String address = sc.nextLine();

        Student s = new Student(name, email, contact, address);
        students.add(s);
        System.out.println("Profile created. Student ID: " + s.getId());
    }

    public static void viewProfile() {
        System.out.print("Enter Student ID to view: ");
        String id = sc.next();
        for (Student s : students) {
            if (s.getId().equals(id)) {
                s.displayProfile();
                System.out.print("Do you want to edit? (yes/no): ");
                String res = sc.next();
                if (res.equalsIgnoreCase("yes")) {
                    s.editProfile();
                }
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void viewMockRatings() {
        System.out.print("Enter Student ID: ");
        String id = sc.next();
        for (Student s : students) {
            if (s.getId().equals(id)) {
                s.displayMocks();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void viewRequirements() {
        System.out.print("Enter Student ID: ");
        String id = sc.next();
        for (Student s : students) {
            if (s.getId().equals(id)) {
                s.displayRequirements();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void hrMenu() {
        while (true) {
            System.out.println("\n--- HR Menu ---");
            System.out.println("1. View All Students");
            System.out.println("2. View Mock Ratings");
            System.out.println("3. View Requirements");
            System.out.println("4. Back");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    for (Student s : students) {
                        s.displayProfile();
                    }
                }
                case 2 -> {
                    for (Student s : students) {
                        s.displayMocks();
                    }
                }
                case 3 -> {
                    for (Student s : students) {
                        s.displayRequirements();
                    }
                }
                case 4 -> { return; }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}

class Student {
    private static int sidCounter = 101;
    private String id;
    private String name;
    private String email;
    private long contact;
    private String address;

    private ArrayList<Education> educations;
    private ArrayList<Mock> mocks;
    private ArrayList<Requirement> requirements;

    public Student(String name, String email, long contact, String address) {
        this.id = "QSP" + sidCounter++;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.educations = inputEducation();
        this.mocks = new ArrayList<>();
        this.requirements = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void displayProfile() {
        System.out.println("\n--- Profile ---");
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Email  : " + email);
        System.out.println("Contact: " + contact);
        System.out.println("Address: " + address);
        System.out.println("Education Details:");
        for (Education e : educations) {
            e.display();
        }
    }

    public void editProfile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new Email: ");
        email = sc.next();
        System.out.print("Enter new Contact: ");
        contact = sc.nextLong();
        System.out.print("Enter new Address: ");
        sc.nextLine();
        address = sc.nextLine();
        System.out.println("Profile Updated.");
    }

    public void displayMocks() {
        if (mocks.isEmpty()) {
            System.out.println("No mock data available.");
        } else {
            for (Mock m : mocks) {
                m.display();
            }
        }
    }

    public void displayRequirements() {
        if (requirements.isEmpty()) {
            System.out.println("No requirements posted.");
        } else {
            for (Requirement r : requirements) {
                r.display();
            }
        }
    }

    private ArrayList<Education> inputEducation() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Education> list = new ArrayList<>();
        while (true) {
            System.out.println("Enter Course Name:");
            String course = sc.nextLine();
            System.out.println("Enter Year of Passing:");
            String yop = sc.nextLine();
            System.out.println("Enter University:");
            String uni = sc.nextLine();
            System.out.println("Enter Marks:");
            double marks = sc.nextDouble();
            sc.nextLine(); 

            list.add(new Education(course, yop, uni, marks));

            System.out.print("Add more education? (yes/no): ");
            String res = sc.nextLine();
            if (!res.equalsIgnoreCase("yes")) break;
        }
        return list;
    }
}

class Education {
    private String course;
    private String yop;
    private String uni;
    private double marks;

    public Education(String course, String yop, String uni, double marks) {
        this.course = course;
        this.yop = yop;
        this.uni = uni;
        this.marks = marks;
    }

    public void display() {
        System.out.println(course + " | " + yop + " | " + uni + " | " + marks + "%");
    }
}

class Mock {
    private String tech;
    private double rating;
    private String feedback;

    public Mock(String tech, double rating, String feedback) {
        this.tech = tech;
        this.rating = rating;
        this.feedback = feedback;
    }

    public void display() {
        System.out.println("Technology: " + tech + " | Rating: " + rating + " | Feedback: " + feedback);
    }
    class Requirements {

        
    }
}

 
