package khachhang;
import java.util.*;
class Customer
{
    // Properties.
    private String code, name, address;
    private byte old;

    // Default constructor.
    Customer()
    {
        code = name = address = null;
        old = 0;
    }

    // Constructor have arguments.
    Customer(String c, String n, String a, byte o)
    {
        code = c;
        name = n;
        address = a;
        old = o;
    }

    // Copy constructor.
    Customer(Customer obj)
    {
        code = obj.code;
        name = obj.name;
        address = obj.address;
        old = obj.old;
    }

    // Methods.
    public String getCode()
    {
        return code;
    }

    public void setCode(String aCode)
    {
        code = aCode;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String aName)
    {
        name = aName;
    }

    public byte getOld()
    {
        return old;
    }

    public void setOld(byte aOld)
    {
        old = aOld;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String aAddress)
    {
        address = aAddress;
    }

    Scanner s = new Scanner(System.in);
    public void input()
    {
        
        System.out.print("-> Input code: ");
        code = s.nextLine();
        System.out.print("-> Input name: ");
        name = s.nextLine();
        System.out.print("-> Input old: ");
        old = s.nextByte();
        s.nextLine();
        System.out.print("-> Input address: ");
        address = s.nextLine();
    }

    public void output()
    {
        System.out.format("%-7s %-15s %-4s %-20s\n", code, name, old, address);
    }
}

class List
{
    // Properties.
    Customer ctm[];
    private int count;

    //  Default constructor.
    List()
    {
        ctm = null;
        count = 0;
    }

    // Copy constructor.
    List(List obj)
    {
        ctm = obj.ctm;
        count = obj.count;
    }

    // Methods.
    public int getCount()
    {
        return count;
    }

    public void setCount(int c)
    {
        count = c;
    }

    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input count: ");
        count = s.nextInt();
        ctm = new Customer[count];

        for (int i = 0; i < count; i++)
        {
            System.out.print("\nInput info customer " + (i + 1) + "\n--------------------------------\n");
            ctm[i] = new Customer();
            ctm[i].input();
        }
        s.close();
    }

    public void output()
    {
        Title();
        for (int i = 0; i < count; i++)
            ctm[i].output();
    }

    void Title()
    {
        System.out.print("\n\n");
        System.out.format("%-7s %-15s %-4s %-20s", "Code", "Name", "Old", "Address");
        System.out.print("\n");
    }
}

class Demo
{
    public static void main(String[] args)
    {
        List a = new List();
        a.input();
        a.output();
    }
}