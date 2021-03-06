// Trần Văn Nhân
//PC: 677

package truongnghe;
import java.util.*;

public class MAIN
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
            System.out.println("2: Add 1 staff.");
            System.out.println("3: Export list student.");
            System.out.println("4: Export list staff.");
            System.out.println("5: Export students and staffs.");
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
                    human = new STAFF();
                    human.input();
                    list.add(human);
                    break;
                    
                case 3:
                    System.out.print("\n\n\t-- LIST OF STUDENT --\n");
                    System.out.format("%-20s %-5s %-7s %-7s %-7s\n", "Name", "YOB", "Mark 1", "Mark 2", "Mark 3");
                    for (HUMAN h:list)
                        if (h instanceof STUDENT)
                            h.output();
                    break;
                
                case 4:
                    System.out.print("\n\n\t-- LIST OF STAFF --\n");
                    System.out.format("%-20s %-5s %-10s %-19s %-4s %15s\n", "Name", "YOB", "Salary", "DOTTJ", "CodeDPM", "Department");
                    for (HUMAN h:list)
                        if (h instanceof STAFF)
                            h.output();
                    break;
                
                case 5:
                    System.out.print("\n\n\t-- LIST OF STUDENTS AND STAFFS --\n");
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