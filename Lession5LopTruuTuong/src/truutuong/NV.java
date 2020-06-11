package truutuong;
import java.util.*;

abstract public class NV
{
    // Properties.
    private String code, name, level;
    // 3 constructors.
    NV()
    {
        code = name = level = null;
    }
    NV(String code, String name, String level)
    {
        this.code = code;
        this.name = name;
        this.level = level;
    }
    NV(NV obj)
    {
        code = obj.code;
        name = obj.name;
        level = obj.level;
    }
    
    // Methods: set, get, input, output
    public String getCode()
    {
        return this.code;
    }
    public String getName()
    {
        return this.name;
    }
    public String getLevel()
    {
        return this.level;
    }
    public void setCode(String code)
    {
        this.code = code;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setLevel(String level)
    {
        this.level = level;
    }

    abstract public float CalSalary();
    
    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input code: ");
        code = s.nextLine();
        System.out.print("-> Input name: ");
        name = s.nextLine();
        System.out.print("-> Input level: ");
        level = s.nextLine();
    }
    
    public void output()
    {
        System.out.format("%-7s %-20s %-8s", code, name, level);
    }
}