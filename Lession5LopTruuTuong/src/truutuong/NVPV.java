package truutuong;
import java.util.*;

public class NVPV extends NV
{
    // Properties.
    private float basicSalary;
    
    // 3 constructors.
    NVPV()
    {
        super();
        basicSalary = 0;
    }   
    NVPV(String code, String name, String level, float basicSalary)
    {
        super(code, name, level);
        this.basicSalary = basicSalary;
    }
    NVPV(NVPV obj)
    {
        super(obj.getCode(), obj.getName(), obj.getLevel());
        basicSalary = obj.basicSalary;
    }
    
    // Methods: set, get, input, output, Calculate salary.
    public float getBasicSalary()
    {
        return this.basicSalary;
    }
    public void setBasicSalary(float basicSalary)
    {
        this.basicSalary = basicSalary;
    }
    
    public float CalSalary()
    {
        return basicSalary;
    }
    
    public void input()
    {
        super.input();
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input basicSalary: ");
        basicSalary = s.nextFloat();
    }
    
    public void output()
    {
        super.output();
        System.out.println(CalSalary());
    }
}
