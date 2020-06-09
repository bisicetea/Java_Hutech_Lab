package sinhvien;
import java.util.*;

public class STUDENT
{
    // Properties.
    protected String code, name;

    // 3 constructors.
    STUDENT()
    {
        code = name = null;
    }
    STUDENT(String aCode, String aName)
    {
        code = aCode;
        name = aName;
    }
    STUDENT(STUDENT obj)
    {
        code = obj.code;
        name = obj.name;
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
    public String getName()
    {
		return this.name;
	}
    public void setName(String name)
    {
		this.name = name;
	}

    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input code: ");
        code = s.nextLine();
        System.out.print("-> Input name: ");
        name = s.nextLine();
    }

    public void output()
    {
        System.out.format("%-7s %-20s", code, name);
    }
}
