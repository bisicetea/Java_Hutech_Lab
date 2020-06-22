package interfaceandpackage;
import java.util.Scanner;

public class HINHTRON implements HINH
{
    // Property.
    private float radius;
    
    // Constructors.
    HINHTRON()
    {
        radius = 0;
    }
    HINHTRON(float radius)
    {
        this.radius = radius;
    }
    HINHTRON(HINHTRON object)
    {
        radius = object.radius;
    }
    
    // Methods: set, get, in-output, area
    public void setRadius(float radius)
    {
        this.radius = radius;
    }
    public float getRadius()
    {
        return radius;
    }
    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input radius: ");
        radius = s.nextFloat();
    }
    
    public void output()
    {
        System.out.println("Circle have radius = " + radius + ".");
    }
    
    public float Area()
    {
        return pi * (float)Math.pow(radius, 2);
    }
}