package interfaceandpackage;
import java.util.Scanner;

public class HINHVUONG implements HINH
{
    // Property
    private float edge;
    
    // Constructors
    HINHVUONG()
    {
        edge = 0;
    }
    HINHVUONG(float edge)
    {
        this.edge = edge;
    }
    HINHVUONG(HINHVUONG object)
    {
        edge = object.edge;
    }
    
    // Methods: set, get, input, output, area
    public void setEdge(float edge)
    {
        this.edge = edge;
    }
    public double getEdge()
    {
        return this.edge;
    }
    
    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input edge: ");
        edge = s.nextFloat();
    }
    
    public void output()
    {
        System.out.println("Square have edge = " + edge + ".");
    }
    
    public float Area()
    {
        return (float) Math.pow(edge, 2);
    }
}