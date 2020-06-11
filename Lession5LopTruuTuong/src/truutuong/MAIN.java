package truutuong;
import java.util.*;

public class MAIN
{
    public static void main(String[] args)
    {
        byte choose = 0;
        Scanner s = new Scanner(System.in);
        NV nv;
        
        ArrayList<NV> list = new ArrayList<NV>();
        
        do
        {
            System.out.println("\n------------MENU------------");
            System.out.println("1: Add 1 management staff.");
            System.out.println("2: Add 1 research staff.");
            System.out.println("3: Add 1 serve staff.");
            System.out.println("4: Export list management staff.");
            System.out.println("5: Export list research staff.");
            System.out.println("6: Export list serve staff.");
            System.out.println("7: Export ALL.");
            System.out.println("0: Exit.");
            System.out.println("----------------------------");
            System.out.print("Choose: ");
            choose = s.nextByte();
            
            switch(choose)
            {
                case 1:
                    nv = new NVQL();
                    nv.input();
                    list.add(nv);
                    break;
                
                case 2:
                    nv = new NVNC();
                    nv.input();
                    list.add(nv);
                    break;
                
                case 3:
                    nv = new NVPV();
                    nv.input();
                    list.add(nv);
                    break;
                    
                case 4:
                    System.out.print("\n\n\t-- LIST OF MANEGEMENT STAFF --\n");
                    System.out.format("%-7s %-20s %-7s %-12s %s\n", "Code", "Name", "Level", "Specialize", "Salary");
                    for (NV n:list)
                        if (n instanceof NVQL)
                            n.output();
                    break;
                
                case 5:
                    System.out.print("\n\n\t-- LIST OF RESEARCH STAFF --\n");
                    System.out.format("%-7s %-20s %-7s %-12s %s\n", "Code", "Name", "Level", "Specialize", "Salary");
                    for (NV n:list)
                        if (n instanceof NVNC)
                            n.output();
                    break;
                    
                case 6:
                    System.out.print("\n\n\t-- LIST OF SERVE STAFF --\n");
                    System.out.format("%-7s %-20s %-7s %s\n", "Code", "Name", "Level", "Salary");
                    for (NV n:list)
                        if (n instanceof NVPV)
                            n.output();
                    break;
                
                case 7:
                    System.out.print("\n\n\t-- LIST OF ALL --\n");
                    for (NV n:list)
                        n.output();
                    break;
                    
                default:
                    choose = 0;
                    break;
            }
        }
        while(choose != 0);
    }
}