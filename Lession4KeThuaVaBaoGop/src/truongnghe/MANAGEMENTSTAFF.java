package truongnghe;
import java.util.*;

public class MANAGEMENTSTAFF extends STAFFCLC
{
    // Properties.
    private float allowances;
    // 3 constructors.
    MANAGEMENTSTAFF()
    {
        super();
        allowances = 0;
    }
    MANAGEMENTSTAFF(String name, int yob, double slr, String dot, DEPARTMENT D, String lvl, String mj, String tP, float allow)
    {
        super(name, yob, slr, dot, D, lvl, mj, tP);
        allowances = allow;
    }
    MANAGEMENTSTAFF(MANAGEMENTSTAFF obj)
    {
        super(obj.getName(), obj.getYOB(), obj.getSalary(), obj.getDOTTJ(), obj.getDepartment(), obj.getLevel(), obj.getMajors(), obj.getTrainningPlace());
        allowances = obj.allowances;
    }
    // Methods: set, get, input, output
    
    public float getAllowances()
    {
        return allowances;
    }
    public void setAllowances(float allow)
    {
        allowances = allow;
    }
    
    public void input()
    {
        super.input();
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input allowances of work: ");
        allowances = s.nextFloat();
    }
    
    public void output()
    {
        super.output();
        System.out.println(allowances);
    }
}
