import java.io.*;
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
	}
	
	public void output()
	{
		System.out.print("\n");
		System.out.print(code + "\t" + name + "\t" + average + "\t");
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

class List
{
    Student st[];
    int mount;
    public void inputList()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("-> Input mount of student: ");
        mount = s.nextInt();
        st = new Student[mount];

        for (int i = 0; i < mount; i++)
        {
            System.out.print("\nInput info student 0" + (i + 1) + "\n--------------------------------\n");
            st[i] = new Student();
            st[i].input();
        }
    }
    public void outputList()
    {
        for (int i = 0; i < mount; i++)
        {
            st[i].output();
            st[i].rank();
        }
    }

    public void Sort()
    {
        System.out.print("\n\nInfo of all student after sort\n--------------------------------");
        for (int i = 0; i < mount - 1; i++)
            for (int j = i + 1; j < mount; j++)
                if (st[i].getAverage() < st[j].getAverage())
                {
                    Student temp = st[i];
                    st[i] = st[j];
                    st[j] = temp;
                }
        outputList();
    }
}

class Exercise2_1
{
    public static void main(String[] args)
    {
        List a = new List();
        a.inputList();
        System.out.print("\n\n    Info of all student\n--------------------------------");
        a.outputList();
        a.Sort();
    }
}