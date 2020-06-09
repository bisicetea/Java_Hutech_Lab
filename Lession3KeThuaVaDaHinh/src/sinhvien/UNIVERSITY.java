package sinhvien;
import java.util.Scanner;

public class UNIVERSITY extends STUDENT
{
    // Properties.
    private int year;
    private String faculty;
    private String branch;

    // 3 constructors.
    UNIVERSITY()
    {
        super();
        year = 0;
        faculty = branch = null;
    }
    UNIVERSITY(String aCode, String aName, int aYear, String fac, String bra)
    {
        super(aCode, aName);
        year = aYear;
        faculty = fac;
        branch = bra;
    }
    UNIVERSITY(UNIVERSITY obj)
    {
        super(obj.code, obj.name);
        year = obj.year;
        faculty = obj.faculty;
        branch = obj.branch;
    }

    //Methods: set, get, input, output
    public int getYear() {
        return this.year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public String getFaculty()
    {
        return this.faculty;
    }
    public void setFaculty(String faculty)
    {
        this.faculty = faculty;
    }
    public String getBranch()
    {
        return this.branch;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }

    public void input()
    {
        super.input();
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input year: ");
        year = s.nextInt();
        s.nextLine();
        System.out.print("-> Input faculty: ");
        faculty = s.nextLine();
        System.out.print("-> Input branch: ");
        branch = s.nextLine();
    }
    public void output()
    {
        super.output();
        System.out.format("%-7s %-20s %s\n", year, faculty, branch);
    }
}
