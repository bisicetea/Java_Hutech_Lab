package MyPackage.Shape;
import MyPackage.Calculate;

public class Circle implements Calculate
{
    //Property.
    private float edge;

    // Constructors.
    Circle()
    {
        edge = 0;
    }
    public Circle(float edge)
    {
        this.edge = edge;
    }
    Circle(Circle object)
    {
        edge = object.edge;
    }

    // Methods.
    public void setEdge(float edge)
    {
        this.edge = edge;
    }
    public float getEdge()
    {
        return edge;
    }

    public float Parameter()
    {
        return 2f * (float)Math.PI * edge;
    }

    public float Area()
    {
        return (float) ((float) Math.PI * Math.pow(edge, 2));
    }
}