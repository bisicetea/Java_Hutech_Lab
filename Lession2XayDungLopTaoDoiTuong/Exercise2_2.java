import java.io.*;
import java.util.*;

class PhanSo2_2
{
    private int tu;
    private int mau;

    //Constructor Default
    PhanSo2_2()
    {
        tu = 0;
        mau = 1;
    }

    //Constructor
    PhanSo2_2(int tu2, int mau2)
    {
        tu = tu2;
        mau = mau2;
    }

    PhanSo2_2(PhanSo2_2 a)
    {
        tu = a.tu;
        mau = a.mau;
    }

    public int getTu()
    {
        return tu;
    }
    public void setTu(int t)
    {
        tu = t;
    }

    public int getMau()
    {
        return mau;
    }
    public void setMau(int m)
    {
        mau = m;
    }

    public void input()
    {
        Scanner s = new Scanner(System.in);
        do
        {
            System.out.print("-> Nhap tu so: ");
            tu = s.nextInt();
            System.out.print("-> Nhap mau so: ");
            mau = s.nextInt();
            if (mau == 0)
                System.out.println("Mau so khong duoc = 0. Nhap lai.");
        }
        while(mau == 0);
    }

    public void output()
    {
        System.out.print(tu + "/" + mau);
    }

    public int UCLN(int a, int b)
    {
        while (a != b)
        {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    public void TGPS()
    {
        int i = UCLN(tu, mau);
        tu = tu / i;
        mau = mau / i;
    }

    public PhanSo2_2 CongPS(PhanSo2_2 p)
    {
        int ts = tu * p.mau + p.tu * mau;
        int ms = mau * p.mau;
        PhanSo2_2 temp = new PhanSo2_2(ts, ms);
        temp.TGPS();
        //temp.output();
        return temp;
    }

    public void TruPS(PhanSo2_2 p)
    {
        int ts = tu * p.mau - p.tu * mau;
        int ms = mau * p.mau;
        PhanSo2_2 temp = new PhanSo2_2(ts, ms);
        temp.TGPS();
        temp.output();
    }

    public void NhanPS(PhanSo2_2 p)
    {
        int ts = tu * p.tu;
        int ms = mau * p.mau;
        PhanSo2_2 temp = new PhanSo2_2(ts, ms);
        temp.TGPS();
        temp.output();
    }

    public void ChiaPS(PhanSo2_2 p)
    {
        int ts = tu * p.mau;
        int ms = mau * p.tu;
        PhanSo2_2 temp = new PhanSo2_2(ts, ms);
        temp.TGPS();
        temp.output();
    }
    public void Test(PhanSo2_2 p)
    {
        if (p.mau == 0)
        {
            System.out.print("\nMau cua phan so b = 0. End program.");
            System.exit(0);
        }
    }
}

class Exercise2_2
{
    public static void main(String[] args)
    {
        // PS 1.
        PhanSo2_2 a = new PhanSo2_2();
        a.input();
        a.TGPS();
        System.out.print("\nPhan so thu nhat: ");
        a.output();

        // PS 2.
        System.out.print("\nPhan so thu hai: ");
        PhanSo2_2 b = new PhanSo2_2(4, 16);
        b.Test(b);
        b.TGPS();
        b.output();

        // PS 3.
        System.out.print("\nPhan so thu ba: \n");
        PhanSo2_2 c = new PhanSo2_2();
        c.input();

        // Cong p1 va p3.
        PhanSo2_2 sum = c.CongPS(a);
        System.out.println("\nCong phan so 1 va phan so 3: " + sum.getTu() + "/" + sum.getMau());

        // Copy p4 from calcutate.
        PhanSo2_2 d = new PhanSo2_2();
        d = c.CongPS(a);
        System.out.print("Nhan phan so 4 va phan so 2: ");
        d.NhanPS(b);
    }
}