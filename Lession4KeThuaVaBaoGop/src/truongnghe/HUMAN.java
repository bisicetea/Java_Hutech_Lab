package truongnghe;
import java.util.*;

public class HUMAN
{
    // Properties.
    private String name;
    private int year_of_birth;
    
    // 3 constructors.
    HUMAN()
    {
        name = null;
        year_of_birth = 0;
    }
    HUMAN(String aName, int aYOB)
    {
        name = aName;
        year_of_birth = aYOB;
    }
    HUMAN(HUMAN obj)
    {
        name = obj.name;
        year_of_birth = obj.year_of_birth;
    }
    
    // Method: set, get, input, output
    public String getName()
    {
        return name;
    }
    public void setName(String bName)
    {
        name = bName;
    }
    public int getYOB()
    {
        return year_of_birth;
    }
    public void setYOB(int year)
    {
        year_of_birth = year;
    }
    
    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input name: ");
        name = s.nextLine();
        System.out.print("-> Input year of birth: ");
        year_of_birth =  s.nextInt();
    }
    
    public void output()
    {
        System.out.format("%-20s %-6s", name, year_of_birth);
    }
}
