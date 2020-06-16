package truutuong2;
import java.util.*;

public class MAIN2
{
    public static void main(String[] args)
    {
        byte choose = 0;
        Scanner s = new Scanner(System.in);
        HUMAN human;
        
        ArrayList<HUMAN> list = new ArrayList<HUMAN>();
        
        do
        {
            System.out.println("\n------------MENU------------");
            System.out.println("1: Add 1 student.");
            System.out.println("2: Add 1 management staff.");
            System.out.println("3: Add 1 teacher.");
            System.out.println("4: Export list student.");
            System.out.println("5: Export list staff.");
            System.out.println("6: Export list teacher.");
            System.out.println("7: Export ALL.");
            System.out.println("0: Exit.");
            System.out.println("----------------------------");
            System.out.print("Choose: ");
            choose = s.nextByte();
            
            switch(choose)
            {
                case 1:
                    human = new STUDENT();
                    human.input();
                    list.add(human);
                    break;
                
                case 2:
                    human = new MANAGEMENTSTAFF();
                    human.input();
                    list.add(human);
                    break;
                
                case 3:
                    human = new TEACHER();
                    human.input();
                    list.add(human);
                    break;
                    
                case 4:
                    System.out.print("\n\n\t-- LIST OF STUDENT --\n");
                    System.out.format("%-20s %-5s %-7s %-7s %-7s\n", "Name", "YOB", "Mark 1", "Mark 2", "Mark 3");
                    for (HUMAN h:list)
                        if (h instanceof STUDENT)
                            h.output();
                    break;
                
                case 5:
                    System.out.print("\n\n\t-- LIST OF MANAGEMENT STAFF --\n");
                    System.out.format("%-20s %-5s %-10s %-19s %-5s %-14s %-7s %-20s %-24s %s\n", "Name", "YOB", "Salary", "DOTTJ", "CodeDPM", "Department", "Level", "Majors", "TP","Allowances");
                    for (HUMAN h:list)
                        if (h instanceof MANAGEMENTSTAFF)
                            h.output();
                    break;
                    
                case 6:
                    System.out.print("\n\n\t-- LIST OF TEACHER --\n");
                    System.out.format("%-20s %-5s %-10s %-19s %-5s %-14s %-7s %-20s %-24s %s\n", "Name", "YOB", "Salary", "DOTTJ", "CodeDPM", "Department", "Level", "Majors", "TP","Remuneration");
                    for (HUMAN h:list)
                        if (h instanceof TEACHER)
                            h.output();
                    break;
                
                case 7:
                    System.out.print("\n\n\t-- LIST OF ALL --\n");
                    for (HUMAN h:list)
                        h.output();
                    break;
                    
                default:
                    choose = 0;
                    break;
            }
        }
        while(choose != 0);
    }
}
