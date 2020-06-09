package sinhvien;

import java.util.*;

class Student
{
    private int mssv;
	private String ten;
	private double dtb;
	
	//Constructor default
	Student()
	{
		mssv = 0;
		ten = "";
		dtb = 0.0;
	}
	
	//Constructor
	Student(int a, String b, double c)
	{
		mssv = a;
		ten = b;
		dtb = c;
	}
	
	public int getmssv()
	{
		return mssv;
	}
	
	public void setmssv(int c)
	{
		mssv = c;
	}
	
	String getten()
	{
		return ten;
	}
	
	public void setten(String b)
	{
		ten = b;
	}
	
	public double getdtb()
	{
		return dtb;
	}
	
	public void setdtb(double a)
	{
		dtb = a;
	}
	
	Scanner s = new Scanner(System.in);
	public void input()
	{	
		System.out.print("-> Nhap mssv: ");
		mssv = s.nextInt();
		
		s.nextLine();
		System.out.print("-> Nhap ten: ");
		ten = s.nextLine();
		
		do
		{
			System.out.print("-> Nhap dtb: ");
			dtb = s.nextDouble();
		}while(dtb < 0 && dtb > 10);
	}
	
	public void output()
	{
		System.out.print("\n");
		System.out.print(mssv + "\t" + ten + "\t" + dtb + "\t");
	}
	
	public void rank()
	{
		if (dtb < 5)
			System.out.print("YEU");
		else
			if (dtb < 6.5)
				System.out.print("TB");
			else
				if(dtb < 8)
					System.out.print("KHA");
				else
                    System.out.print("GIOI");
    }
}

class List
{
    Student st[];
	int sl;

	Scanner s = new Scanner(System.in);
    public void inputList()
    {
        System.out.println("-> Nhap so luong sinh vien: ");
        sl = s.nextInt();
        st = new Student[sl];

        for (int i = 0; i < sl; i++)
        {
            System.out.print("\nNhap thong tin sinh vien thu 0" + (i + 1) + "\n---------------------------------------\n");
            st[i] = new Student();
            st[i].input();
        }
    }
    public void outputList()
    {
        for (int i = 0; i < sl; i++)
        {
            st[i].output();
            st[i].rank();
        }
    }

    public void Sort()
    {
        System.out.print("\n\nSau khi sap xep theo mssv\n---------------------------------------");
        for (int i = 0; i < sl - 1; i++)
            for (int j = i + 1; j < sl; j++)
                if (st[i].getmssv() > st[j].getmssv())
                {
                    Student temp = st[i];
                    st[i] = st[j];
                    st[j] = temp;
                }
        outputList();
    }
}

class SINHVIEN
{
    public static void main(String[] args)
    {
        List a = new List();
        a.inputList();
        System.out.print("\n\n    Thong tin sinh vien\n-----------------------------------");
        a.outputList();
        a.Sort();
    }
}