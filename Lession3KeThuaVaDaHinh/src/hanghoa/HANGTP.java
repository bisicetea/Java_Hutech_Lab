package hanghoa;
import java.util.*;

public class HANGTP extends HANGHOA
{
    // Properties.
    private String manufacture;
    private String expiration;

    // Default constructor.
    HANGTP()
    {
        super();
        manufacture = expiration = null;
    }
    
    // Constructor have arguments.
    HANGTP(String cCode, String cName, long cCost, String cManufacture, String cExpiration)
    {
        super(cCode, cName, cCost);
        manufacture = cManufacture;
        expiration = cExpiration;
    }
    
    // Copy constructor.
    HANGTP(HANGTP o)
    {
        super(o.code, o.name, o.cost);
        manufacture = o.manufacture;
        expiration = o.expiration;
    }
    
    // Methods: set, get, input, output
    public String getManufacture()
    {
        return manufacture;
    }
    public void setManufacture(String mf)
    {
        manufacture = mf;
    }
    public String getExpiration()
    {
        return expiration;
    }
    public void setExpiration(String exp)
    {
        expiration = exp;
    }
    
    Scanner s = new Scanner(System.in);
    
    public void input()
    {
        super.input();
        System.out.print("-> Input manufacture: ");
        manufacture = s.nextLine();
        System.out.print("-> Input expiration: ");
        expiration = s.nextLine();
    }
    
    public void output()
    {
        super.output();
        System.out.format("%-7s %-7s\n", manufacture, expiration);
    }
}
