/*Implement Dynamic method dispatch in a HR System
Consider following simplified representation of a Human Resource (HR) System and implement dynamic method dispatch.
1. Employee (Superclass):
• Properties: id, name, salary
• Methods: calculateSalary(), displayDetails()
2. Manager (Subclass):
• Properties: teamSize
• Methods: calculateSalary() (overrides the superclass method)
3. Intern (Subclass):
• Properties: duration, supervisor
• Methods: calculateSalary() (overrides the superclass method)
*/

import java.util.*;
class Employee
{
	int id;
	String name;
	int salary=1000000;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void calculateSalary()
	{
		int bonus=50000;
		salary=salary+bonus;
		System.out.println("Salary: $"+salary);
	}
	void displayDetails()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		
	}
}


class Manager extends Employee
{
	int teamSize;
	Manager(int teamSize)
	{
		super(id ,name);
		this.teamSize=teamSize;
	}
	void calculateSalary()
	{
		int bonus=100000;
		salary=salary+bonus;
		System.out.println("Salary: $"+salary);
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Team Size: "+teamSize);
	}

}

class Intern extends Employee
{
	int duration;
	String supervisor;
	Intern(int duration,String supervisor)
	{
		super(id,name);
		this.duration=duration;
		this.supervisor=supervisor;
	}
	void calculateSalary()
	{
		int bonus=1000;
		salary=salary*duration/12+bonus;
		System.out.println("Salary: $"+salary);
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Duration: "+duration);
		System.out.println("Supervisor: "+supervisor);

	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enetr employee name: ");
		String name=Sc.nextLine();
		System.out.println("Enter Id: ");
		int id=Sc.nextInt();
		Employee emp=new Employee(id,name);
		System.out.println("Team Size: ");
		int teamSize=Sc.nextInt();
		Employee manager=new Manager(teamSize);
		manager.calculateSalary();
		manager.displayDetails();
		System.out.println("Enter duration of internship: ");
		int duration=Sc.nextInt();
		System.out.println("enetr Supervisor; ");
		String supervisor=Sc.nextLine();
		Employee intern=new Intern(duration,supervisor);
		intern.calculateSalary();
		intern.displayDetails();


	}
}

/*class Employee {
    private int id;
    private String name;
    protected double salary;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0.0;
    }

    public void calculateSalary() {
        // Default implementation
        System.out.println("Calculating salary for Employee");
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(int id, String name, int teamSize) {
        super(id, name);
        this.teamSize = teamSize;
    }

    @Override
    public void calculateSalary() {
        // Calculate salary for Manager
        System.out.println("Calculating salary for Manager");
        salary = 5000.0 + (teamSize * 1000.0);
    }
}

class Intern extends Employee {
    private int duration;
    private String supervisor;

    public Intern(int id, String name, int duration, String supervisor) {
        super(id, name);
        this.duration = duration;
        this.supervisor = supervisor;
    }

    @Override
    public void calculateSalary() {
        // Calculate salary for Intern
        System.out.println("Calculating salary for Intern");
        salary = 2000.0 + (duration * 100.0);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration + " months");
        System.out.println("Supervisor: " + supervisor);
    }
}

public class HRSystem {
    public static void main(String[] args) {
        // Creating objects of different classes
        Employee emp = new Employee(1, "John Doe");
        Manager manager = new Manager(2, "Jane Smith", 5);
        Intern intern = new Intern(3, "Alice Johnson", 6, "Bob");

        // Dynamic method dispatch
        emp.calculateSalary();
        emp.displayDetails();

        manager.calculateSalary();
        manager.displayDetails();

        intern.calculateSalary();
        intern.displayDetails();
    }
}
*/