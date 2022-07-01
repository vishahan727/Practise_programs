

/*This program contains the following OOPS Concepts...
 
 * 1.Objects  
 * 2.Classes  
 * 3.Inheritance 
 * 4.Constructors  
 * 5.Overloading 
 * 6.Overriding. 
 * 7.Encapsulation */

package cpe;

import java.util.Scanner;

class Employee{									//Employee class created
	int id;
	String name;
	int age;
	Employee()
	{	
	}
	Employee(int a,String x)			//Parameterized Constructor
	{
		id=a;
		name=x;
	}
	void updateAge(int a)
	{
		Scanner input = new Scanner(System.in);
		while(a!=0 && a!=1)
		{
			System.out.println(a + " is not a correct number. If yes press 1 or 0 if you want to not update the Age");
			a=input.nextInt();
		}
		switch(a)
		{
		case 1 :
			{
				System.out.print("Enter the Employee Age : ");
				this.age=input.nextInt();
				break;
			}
		case 0 :
			{
				System.out.println("Ok. Age not updated...");
				break;
			}
		}
	}
}

class Department extends Employee{			//Inheritance
	String department;
	Department(int a,String x)
	{
		super(a,x);
	}
	Department()
	{
	}
	void print()
	{
		System.out.println("Name      	: " + name);
		System.out.println("ID 		: " + id);
		if(age!=0)
			System.out.println("Age     	: " + age);
		else
			System.out.println("Age not updated in the record....");
		System.out.println("Department  	: " + department);
	}
}

class Addition				
{
	void add()														//OVERRIDDEN METHOD
	{
		System.out.println("Addition of 5 & 6 is " + (5+6) );
	}
}
class Decimal extends Addition
{
	void add()														//OVERRIDING METHOD
	{
		System.out.println("Addition of 2.5 & 4.5 is " + (2.5+4.5));
	}
}

public class CPE3 {

	public static void main(String[] args) {	
		inheritance();		//class created,object created,constructor,inheritance.
		System.out.println();
		calculation(8,6,5.5,0.5);	//Calling the function which executes Method overloaded functions..
		System.out.println();
		System.out.println("Method Overriding...");
		Addition c = new Addition();
		Decimal d = new Decimal();				
		c.add();
		d.add();
		
	}
	
	public static void inheritance()
	{
		Department e1 = new Department();					//Object creation
		Department e2 = new Department(27,"Joseph");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Employee Name : ");
		e1.name=input.nextLine();
		System.out.print("Enter the Employee ID : ");
		e1.id = input.nextInt();
		System.out.print("Enter the Employee 1 Department : ");
		input.nextLine();
		e1.department=input.nextLine();
		System.out.println("Want to update Employee Age? ");
		System.out.println("If yes press 1 or 0 if you want to not update the Age");
		int a = input.nextInt();
		e1.updateAge(a);
		System.out.print("Enter the Employee 2 Department : ");
		input.nextLine();
		e2.department=input.nextLine();
		System.out.println("Want to update Employee 2 Age? ");
		System.out.println("If yes press 1 or 0 if you want to not update the Age");
		a = input.nextInt();
		e2.updateAge(a);
		System.out.println();
		System.out.println("EMPLOYEE DETAILS ....");
		e1.print();
		System.out.println();
		e2.print();
		System.out.println();
	}
	 	
	public static void calculation(int x,int y,double m, double n)			
	{
		System.out.println("In Calculation method... Executing Method overloading...");
		System.out.println("Addition of 8 & 6 = " + add(x,y));					//METHOD OVERLOADING...
		System.out.println("Addition of 5.5 & 0.5 = " + add(m,n));				//METHOD OVERLOADING...
		System.out.println("Subtraction of 8 & 6 = " + sub(x,y));				//METHOD OVERLOADING...
		System.out.println("Subtraction of 5.5 & 0.5 = " + sub(m,n));			//METHOD OVERLOADING...
	}
	
	public static int add(int a,int b)											//METHOD OVERLOADING...
	{
		return a+b;
	}
	private static double add(double a,double b)								//METHOD OVERLOADING...		
	{
		return a+b;
	}
	protected static int sub(int a,int b)										//METHOD OVERLOADING...
	{
		return a-b;
	}
	static double sub(double a,double b)										//METHOD OVERLOADING...
	{
		return a-b;
	}
}
