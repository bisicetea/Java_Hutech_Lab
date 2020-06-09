import java.io.*;
import java.util.*;

class COODINATE
{
    int x, y;
    COODINATE()
    {
        x = 0;
        y = 0;
    }
    COODINATE(int x2, int y2)
    {
        x = x2;
        y = y2;
    }

    void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("-> Horizontal axis: ");
        x = s.nextInt();
        System.out.print("-> Vertical axis: ");
        y = s.nextInt();
    }

    void output()
    {
        System.out.print("(" + x + ", " + y + ")\n");
    }

    public void Sum2TP(COODINATE c)
    {
        int ha = x + c.x;
        int va = y + c.y;;
        COODINATE temp = new COODINATE(ha,va);
        System.out.print("\nC = A + B => C");
        temp.output();
    }

    public void Opposite()
    {
        int ha = x;
        int va = y;
        COODINATE temp = new COODINATE(ha, -va);
        temp.output();
    }
}

class Exercise2_3
{
    public static void main(String[] args)
    {
        COODINATE a = new COODINATE();
        a.input();
        System.out.print("\nA");
        a.output();
        COODINATE b = new COODINATE(2, 3);
        System.out.print("B");
        b.output();
        a.Sum2TP(b);
        System.out.print("Opposite of A = ");
        a.Opposite();
        System.out.print("Opposite of B = ");
        b.Opposite();
    }
}
