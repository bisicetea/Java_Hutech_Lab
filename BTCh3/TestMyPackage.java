import MyPackage.Calculate;
import MyPackage.Shape.Circle;

class TestMyPackage
{
    public static void main(String[] args)
    {
        Circle C = new Circle(5);
        System.out.println(C.Area());
    }
}