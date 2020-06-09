package truongnghe;
import java.util.*;

public class DEPARTMENT
{
    // Properties.
    private String code, department;

    // 3 constructors.
    DEPARTMENT()
    {
        code = department = null;
    }
    DEPARTMENT(String aCode, String aDepartment)
    {
        code = aCode;
        department = aDepartment;
    }
    DEPARTMENT(DEPARTMENT obj)
    {
        code = obj.code;
        department = obj.department;
    }

    // Methods: set, get, input, output
    public String getCode()
    {
        return this.code;
    }
    public void setCode(String code)
    {
        this.code = code;
    }
    public String getDepartment()
    {
        return this.department;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }

    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input code of department: ");
        code = s.nextLine();
        System.out.print("-> Input department: ");
        department = s.nextLine();
    }

    public void output()
    {
        System.out.format("%-7s %-15s", code, department);
    }
}