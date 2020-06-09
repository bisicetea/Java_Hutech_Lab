import java.io.*;
import java.util.*;

class PTBN
{
    int a, b;

    //Constructor default
    PTBN()
    {
        a = b = 0;
    }
    //Constructor
    PTBN(int a1, int b1)
    {
        a = a1;
        b = b1;
    }

    public int getA()
    {
        return a;
    }
    public void setA(int a2)
    {
        a = a2;
    }
    public int getB()
    {
        return b;
    }
    public void setB(int b2)
    {
        b = b2;
    }

    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input a: ");
        a = s.nextInt();
        System.out.print("-> Input b: ");
        b = s.nextInt();
    }

    public void Solve()
    {
        float s = 0;
        if (a == 0)
            if (b == 0)
                System.out.print("Phuong trinh vo so nghiem.");
            else
                System.out.print("Phuong trinh vo nghiem.");
        else
            System.out.print("Phuong trinh co nghiem = " + (float)-b / a);
    }
}

class Exercise2_6
{
    public static void main(String[] args)
    {
        PTBN a = new PTBN();
        a.input();
        System.out.print("\nPhuong trinh thu 1\n--------------------------\n");
        a.Solve();

        System.out.println("\n\nPhuong trinh thu 2\n--------------------------");
        PTBN b = new PTBN(3, 4);
        b.Solve();
    }
}