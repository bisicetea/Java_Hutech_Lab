package truutuong2;
import java.util.*;

public class STAFFCLC extends STAFF
{
    // Properties.
    private String level;
    private String majors;
    private String trainningPlace;
    
    // 3 construtors.
    STAFFCLC()
    {
        super();
        level = majors = trainningPlace = null;
    }
    STAFFCLC(String name, int yob, double slr, String dot, DEPARTMENT D, String lvl, String mj, String tP)
    {
        super(name, yob, slr, dot, D);
        level = lvl;
        majors = mj;
        trainningPlace = tP;
    }
    STAFFCLC(STAFFCLC obj)
    {
        super(obj.getName(), obj.getYOB(), obj.getSalary(), obj.getDOTTJ(), obj.getDepartment());
        level = obj.level;
        majors = obj.majors;
        trainningPlace = obj.trainningPlace;
    }
    
    // Methods: set, get, input, output
    public String getLevel()
    {
        return level;
    }
    public void setLevel(String lvl)
    {
        level = lvl;
    }
    public String getMajors()
    {
        return majors;
    }
    public void setMajors(String mj)
    {
        majors = mj;
    }
    public String getTrainningPlace()
    {
        return trainningPlace;
    }
    public void setTrainningPlace(String tP)
    {
        trainningPlace = tP;
    }
    
    public void input()
    {
        super.input();
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input level: ");
        level = s.nextLine();
        System.out.print("-> Input majors: ");
        majors = s.nextLine();
        System.out.print("-> Input trainning place: ");
        trainningPlace = s.nextLine();
    }
    
    public void output()
    {
        super.output();
        System.out.format("%-7s %-20s %-25s", level, majors, trainningPlace);
    }
}
