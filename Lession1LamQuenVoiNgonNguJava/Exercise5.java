import java.util.*;

class Student
{
	private int code;
	private String name;
	private double average;
	
	//Constructor default
	Student()
	{
		code = 0;
		name = "";
		average = 0.0;
	}
	
	//Constructor
	Student(int a, String b, double c)
	{
		code = a;
		name = b;
		average = c;
	}
	
	public int getCode()
	{
		return code;
	}
	
	public void setCode(int c)
	{
		code = c;
	}
	
	String getName()
	{
		return name;
	}
	
	public void setName(String b)
	{
		name = b;
	}
	
	public double getAverage()
	{
		return average;
	}
	
	public void setAverage(double a)
	{
		average = a;
	}
	
	public void input()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("-> Input code: ");
		code = s.nextInt();
		
		s.nextLine();
		System.out.print("-> Input name: ");
		name = s.nextLine();
		
		do
		{
			System.out.print("-> Input average mark: ");
			average = s.nextDouble();
		}while(average < 0 && average > 10);
		s.close();
	}
	
	public void output()
	{
		System.out.print("\n");
		System.out.print(code + " " + name + " " + average + " ");
	}
	
	public void rank()
	{
		if (average < 5)
			System.out.print("YEU");
		else
			if (average < 6.5)
				System.out.print("TB");
			else
				if(average < 8)
					System.out.print("KHA");
				else
					System.out.print("GIOI");
	}
}

class Demo1
{
	public static void main (String[] args)
	{
		
		Student a = new Student(123, "Le Van A", 9.5);
		System.out.print("Input info student 1:\n");
	//	a.input();
		a.output();
		a.rank();
		System.out.print("\n");
		System.out.print("->Rename student 1: ");
		a.setName("Le Van B");
		a.output();
		a.rank();
		System.out.print("\n\n");
		
		Student b = new Student();
		System.out.print("Input info student 2:\n");
		b.input();
		b.output();
		b.rank();
		if (a.getAverage() > b.getAverage())
			System.out.print("\n\nAverage mark of student " + a.getName() + " > " + b.getName() + ".");
		else
			if (a.getAverage() == b.getAverage())
				System.out.print("\n\nAverage mark of student " + a.getName() + " equal " + b.getName() + ".");
			else
				System.out.print("\n\nAverage mark of student " + a.getName() + " < " + b.getName() + ".");
	}
}