package hanghoa;
import java.util.*;

public class HANGDM extends HANGHOA
{
    // Properties.
    private int warrantyPeriod;
    private int voltage;
    private int wattage;

    // Default constructor.
    HANGDM()
    {
        super();
        warrantyPeriod = voltage = wattage = 0;
    }
    
    // Constructor have arguments.
    HANGDM(String bCode, String bName, long bCost, int bWarrantyPeriod, int bVoltage, int bWattage)
    {
        super(bCode, bName, bCost);
        warrantyPeriod = bWarrantyPeriod;
        voltage = bVoltage;
        wattage = bWarrantyPeriod;
    }
    // Copy constructor.
    HANGDM(HANGDM o)
    {
        super(o.code, o.name, o.cost);
        warrantyPeriod = o.warrantyPeriod;
        voltage = o.voltage;
        wattage = o.wattage;
    }
    
    // Methods.
    public int getWarrantyPeriod()
    {
        return warrantyPeriod;
    }
    public void setWarrantyPeriod(int wp)
    {
        warrantyPeriod = wp;
    }
    public int getVoltage()
    {
        return voltage;
    }
    public void setVoltage(int v)
    {
        voltage = v;
    }
    public int getWattage()
    {
        return wattage;
    }
    public void setWattage(int w)
    {
        wattage = w;
    }

    public void input()
    {
        Scanner s = new Scanner(System.in);
        super.input();
        System.out.print("-> Input warranty period: ");
        warrantyPeriod = s.nextInt();
        System.out.print("-> Input voltage: ");
        voltage = s.nextInt();
        System.out.print("-> Input wattage: ");
        wattage = s.nextInt();
    }
    public void output()
    {
        super.output();
        System.out.format("%-7s %-7s %-7s\n", warrantyPeriod, voltage, wattage);
    }
}
