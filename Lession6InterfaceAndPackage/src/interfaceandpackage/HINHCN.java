package interfaceandpackage;
import java.util.Scanner;

public class HINHCN implements HINH
{
    // Properties.
    private float length;
    private float width;
    
    // Constructors.
    HINHCN()
    {
        length = width = 0;
    }
    HINHCN(float length, float width)
    {
        this.length = length;
        this.width = width;
    }
    HINHCN(HINHCN object)
    {
        length = object.length;
        width = object.width;
    }
    
    // Methods: set, get, in-output, area
    public void setLength(float length)
    {
        this.length = length;
    }
    public void setWidth(float width)
    {
        this.width = width;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    
    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input length: ");
        length = s.nextFloat();
        System.out.print("-> Input width: ");
        width = s.nextFloat();
    }
    
    public void output()
    {
        System.out.println("Rectangle have length = " + length + " and width = " + width + ".");
    }
    
    public float Area()
    {
        return length * width;
    }
}