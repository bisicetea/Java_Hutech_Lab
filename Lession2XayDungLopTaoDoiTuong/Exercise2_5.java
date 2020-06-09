import java.io.*;
import java.util.*;
import java.math.*;

class Triangle
{
    int c1, c2, c3;
    Triangle()
    {
        c1 = c2 = c3 = 0;
    }
    Triangle(int a1, int a2, int a3)
    {
        c1 = a1;
        c2 = a2;
        c3 = a3;
    }

    public void input()
    {
        do
        {
            Scanner s = new Scanner(System.in);
            System.out.print("-> Nhap canh thu nhat: ");
            c1 = s.nextInt();
            System.out.print("-> Nhap canh thu hai: ");
            c2 = s.nextInt();
            System.out.print("-> Nhap canh thu ba: ");
            c3 = s.nextInt();
            if (c1 + c2 <= c3 || c1 + c3 <= c2 || c2 + c3 <= c1)
                System.out.print("Khong tao thanh mot tam giac. Vui long nhap lai.\n\n");
        }
        while(c1 + c2 <= c3 || c1 + c3 <= c2 || c2 + c3 <= c1);
    }

    public int CV()
    {
        return c1 + c2 + c3;
    }

    public double DT()
    {
        double s, p;
        p = (c1 + c2 + c3) / 2.0;
        s = Math.sqrt(p * (p - c1) * (p - c2) * (p - c3));
        return s;
    }

    public void Identified()
    {
        if (Math.pow(c1, 2) == Math.pow(c2, 2) + Math.pow(c3, 2) || Math.pow(c2, 2) == Math.pow(c1, 2) + Math.pow(c3, 2) || Math.pow(c3, 2) == Math.pow(c1, 2) + Math.pow(c2, 2))
            System.out.print("\nDay la tam giac vuong.");
        else
            if (c1 == c2 && c2 == c3)
                System.out.print("\nDay la tam giac deu.");
            else
                if (c1 == c2 || c2 == c3 || c3 == c1)
                    System.out.print("\nDay la tam giac can.");
                else
                    if (c1 + c2 == c3 || c3 + c2 == c1 || c3 + c1 == c2)
                        System.out.print("\nDay la tam giac suy bien.");
                    else
                        System.out.print("\nDay la tam giac thuong.");
    }
}

class Exercise2_5
{
    public static void main(String[] args)
    {
        Triangle ABC = new Triangle();
        ABC.input();
        System.out.print("\n\n---- Tam giac ABC ----\n");
        System.out.print("Chu vi:" + ABC.CV());
        System.out.print("\nDien tich: " + ABC.DT());
        ABC.Identified();

        Triangle XYZ = new Triangle(3, 4, 5);
        System.out.print("\n\n---- Tam giac XYZ ----\n");
        System.out.print("Chu vi: " + XYZ.CV());
        System.out.print("\nDien tich: " + XYZ.DT());
        XYZ.Identified();
    }
}