package truongnghe;
import java.util.*;

public class STUDENT extends HUMAN
{
    // Properties.
    private float mark1, mark2, mark3;

    // 3 constructors.
    STUDENT()
    {
        super();
        mark1 = mark2 = mark3 = 0f;
    }
    STUDENT(String name, int yob, float m1, float m2, float m3)
    {
        super(name, yob);
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
    STUDENT(STUDENT obj)
    {
        super(obj.getName(), obj.getYOB());
        mark1 = obj.mark1;
        mark2 = obj.mark2;
        mark3 = obj.mark3;
    }

    // Method: set, get, input, output
    public float getMark1()
    {
        return mark1;
    }
    public void setMark1(float m1)
    {
        mark1 = m1;
    }
    public float getMark2()
    {
        return mark2;
    }
    public void setMark2(float m2)
    {
        mark1 = m2;
    }public float getMark3()
    {
        return mark3;
    }
    public void setMark3(float m3)
    {
        mark1 = m3;
    }

    public void input()
    {
        Scanner s = new Scanner(System.in);
        super.input();
        System.out.print("-> Input mark 1: ");
        mark1 = s.nextFloat();
        System.out.print("-> Input mark 2: ");
        mark2 = s.nextFloat();
        System.out.print("-> Input mark 3: ");
        mark3 = s.nextFloat();
    }

    public void output()
    {
        super.output();
        System.out.format("%-7s %-7s %-7s\n", mark1, mark2, mark3);
    }
}