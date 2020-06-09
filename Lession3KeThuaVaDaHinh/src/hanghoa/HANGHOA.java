package hanghoa;
import java.util.*;

public class HANGHOA
{
    // Properties.
    protected String code;
    protected String name;
    protected long cost;

    // Default constructor.
    HANGHOA()
    {
        code = name = null;
        cost = 0;
    }
    // Constructor have arguments.
    HANGHOA(String aCode, String aName, long aCost)
    {
        code = aCode;
        name = aName;
        cost = aCost;
    }

    // Copy constructor.
    HANGHOA(HANGHOA o)
    {
        code = o.code;
        name = o.name;
        cost = o.cost;
    }

    // Methods: set, get, input, output
    public String getCode()
    {
        return code;
    }
    public void setCode(String bCode)
    {
        code = bCode;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String bName)
    {
        name = bName;
    }
    public long getCost()
    {
        return cost;
    }
    public void setCost(long bCost)
    {
        cost = bCost;
    }
    
    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input code: ");
        code = s.nextLine();
        System.out.print("-> Input name: ");
        name = s.nextLine();
        System.out.print("-> Input cost: ");
        cost = s.nextLong();
    }
    public void output()
    {
        System.out.format("%-5s %-20s %-10s", code, name, cost);
    }
}
