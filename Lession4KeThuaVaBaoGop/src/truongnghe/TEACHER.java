package truongnghe;
import java.util.*;

public class TEACHER extends STAFFCLC
{
    // Properties.
    private float remuneration;
    
    // 3 constructors.
    TEACHER()
    {
        super();
        remuneration = 0;
    }
    TEACHER(String name, int yob, double slr, String dot, DEPARTMENT D, String lvl, String mj, String tP, float remu)
    {
        super(name, yob, slr, dot, D, lvl, mj, tP);
        remuneration = remu;
    }
    TEACHER(TEACHER obj)
    {
        super(obj.getName(), obj.getYOB(), obj.getSalary(), obj.getDOTTJ(), obj.getDepartment(), obj.getLevel(), obj.getMajors(), obj.getTrainningPlace());
        remuneration = obj.remuneration;
    }
    
    // Methods: set, get, input, output
    public float getRemuneration()
    {
        return remuneration;
    }
    public void setRemuneration(float remu)
    {
        remuneration = remu;
    }
    
    public void input()
    {
        super.input();
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input remuneration: ");
        remuneration = s.nextFloat();
    }
    
    public void output()
    {
        super.output();
        System.out.println(remuneration);
    }
}
