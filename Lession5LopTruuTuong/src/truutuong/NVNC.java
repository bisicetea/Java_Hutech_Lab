package truutuong;
import java.util.*;

public class NVNC extends NV
{
    // Properties.
    private String specialize;
    private float basicSalary, allowance;;

    // 3 constructor.
    NVNC()
    {
        super();
        specialize = null;
        basicSalary = allowance = 0;
    }
    NVNC(String code, String name, String level, String specialize, float basicSalary, float allowance)
    {
        super(code, name, level);
        this.specialize = specialize;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }
    NVNC(NVNC obj)
    {
        super(obj.getCode(), obj.getName(), obj.getLevel());
        specialize = obj.specialize;
        basicSalary = obj.basicSalary;
        allowance = obj.allowance;
    }

    // Methods: set, get, input, output
    public String getSpecialize()
    {
        return this.specialize;
    }
    public void setSpecialize(String specialize)
    {
        this.specialize = specialize;
    }
    public float getBasicSalary()
    {
        return this.basicSalary;
    }
    public void setBasicSalary(float basicSalary)
    {
        this.basicSalary = basicSalary;
    }
    public float getAllowance()
    {
        return this.allowance;
    }
    public void setAllowance(float allowance)
    {
        this.allowance = allowance;
    }
    public float CalSalary()
    {
        float salary = basicSalary + allowance;
        return salary;
    }

    public void input()
    {
        super.input();
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input specialize: ");
        specialize = s.nextLine();
        System.out.print("-> Input basicSalary: ");
        basicSalary = s.nextFloat();
        System.out.print("-> Input allowance: ");
        allowance = s.nextFloat();
    }

    public void output()
    {
        super.output();
        System.out.format("%-13s", specialize);
        System.out.println(CalSalary());
    }
}
