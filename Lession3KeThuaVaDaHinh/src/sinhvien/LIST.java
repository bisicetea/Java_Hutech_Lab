package sinhvien;
import java.util.*;

import jdk.internal.jshell.tool.resources.l10n;

public class LIST
{
    // Properties.
    STUDENT st[];
    private int mount;
    static int MAX = 100;

    // 2 constructors.
    LIST()
    {
        st = new STUDENT[MAX];
        mount = 0;
    }
    LIST(LIST obj)
    {
        st = obj.st;
        mount = obj.mount;
    }

    // Methods: set, get, input, 
    public int getMount()
    {
        return this.mount;
    }
    public void setMount(int mount)
    {
        this.mount = mount;
    }

    public void inputStudent(STUDENT s)
    {
        if (s instanceof UNIVERSITY)
        {
            st[mount] = new UNIVERSITY();
            st[mount] = s;
            mount++;
        }
        
        if (s instanceof COLLEGE)
        {
            st[mount] = new COLLEGE();
            st[mount] = s;
            mount++;
        }
    }

    public void outputUNI()
    {
        Title();
        for (int i = 0; i < mount; i++)
            if (st[i] instanceof UNIVERSITY)
                st[i].output();
    }

    public void outputCOL()
    {
        Title();
        for (int i = 0; i < mount; i++)
            if (st[i] instanceof COLLEGE)
                st[i].output();
    }

    public void Title()
    {
        System.out.format("\n\n%-7s %-19s %-7s %-20s %s\n", "Code", "Name", "Year", "Faculty", "Branch");
    }
}
