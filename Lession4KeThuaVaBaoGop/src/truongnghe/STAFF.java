package truongnghe;
import java.util.*;

public class STAFF extends HUMAN
{
    // Properties.
    private double salary;
    private String dottj;
    private DEPARTMENT dpm = new DEPARTMENT();

    // 3 constructors.
    STAFF()
    {
        super();
        salary = 0;
        dottj = null;
    }
    STAFF(String name, int yob, double slr, String dot, DEPARTMENT D)
    {
        super(name, yob);
        salary = slr;
        dottj = dot;
        dpm = D;
    }
    STAFF(STAFF obj)
    {
        super(obj.getName(), obj.getYOB());
        salary = obj.salary;
        dottj = obj.dottj;
        dpm = obj.dpm;
    }
    
    // Methods: set, get, input, output
    public double getSalary()
    {
        return salary;
    }
    
    public void setSalary(double SLR)
    {
        salary = SLR;
    }
    
    public String getDOTTJ()
    {
        return dottj;
    }
    
    public void setDOTTJ(String d)
    {
        dottj = d;
    }
    
    public DEPARTMENT getDepartment()
    {
        return dpm;
    }
    
    public void setDepartment(String c, String de)
    {
        dpm.setCode(c);
        dpm.setDepartment(de);
    }

    public void input()
    {
        super.input();
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input salary: ");
        salary = s.nextDouble();
        s.nextLine();
        System.out.print("-> Input date of taking the job: ");
        dottj = s.nextLine();
        dpm.input();
    }

    public void output()
    {
        super.output();
        System.out.format("%-10s %-20s", salary, dottj);
        dpm.output();
    }
}
