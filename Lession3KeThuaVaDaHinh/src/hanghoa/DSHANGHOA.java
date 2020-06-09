package hanghoa;

public class DSHANGHOA
{
    // Properties.
    HANGHOA hh[];
    private int mount;
    
    
    // Default constructor.
    DSHANGHOA()
    {
        hh = new HANGHOA[100];
        mount = 0;
    }
    
    // Copy constructor.
    DSHANGHOA(DSHANGHOA obj)
    {
        hh = obj.hh;
        //?????
        mount = obj.mount;
    }
    
    // Method: set, get, input, output.
    public int getMount()
    {
        return mount;
    }
    
    public void setMount(int m)
    {
        mount = m;
        //????
    }
    
    public void inputGoods(HANGHOA h)
    {
        if (h instanceof HANGDM)
        {
            hh[mount] = new HANGDM();
            hh[mount] = h;
            mount++;
        }
        
        if (h instanceof HANGTP)
        {
            hh[mount] = new HANGTP();
            hh[mount] = h;
            mount++;
        }
    }    
    
    public void outputByType(byte h)
    {
        if (h == 1)
        {
            TitleDM();
            for (int i = 0; i < mount; i++)
                if (hh[i] instanceof HANGDM)
                    hh[i].output();
            System.out.println("\n\n");
        }
        else
        {
            TitleTP();
            for (int i = 0; i < mount; i++)
                if (hh[i] instanceof HANGTP)
                    hh[i].output();
            System.out.println("\n\n");
        }
    }
    
    void TitleDM()
    {
        System.out.format("\n\n%-5s %-20s %-10s %-13s %-13s %-13s\n", "Code", "Name", "Cost", "WP", "Vol", "Wat");
    }
    
    void TitleTP()
    {
        System.out.format("\n\n%-5s %-20s %-10s %-13s %-13s\n", "Code", "Name", "Cost", "MF", "Exp");
    }
}
