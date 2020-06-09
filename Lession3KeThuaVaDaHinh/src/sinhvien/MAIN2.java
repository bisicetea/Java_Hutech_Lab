package sinhvien;
import java.util.*;

public class MAIN2
{
    public static void main(String[] args)
    {
        byte choose = 0;
        Scanner s = new Scanner(System.in);
        LIST list1 = new LIST();
        STUDENT st;
        
        do
        {
            System.out.println("1: Add 1 student college.");
            System.out.println("2: Add 1 student university.");
            System.out.println("3: Export student college.");
            System.out.println("4: Export student university.");
            System.out.println("0: Exit.");
            System.out.println("----------------------------");
            System.out.print("Choose: ");
            choose = s.nextByte();
            
            switch(choose)
            {
                case 1:
                    st = new COLLEGE();
                    st.input();
                    list1.inputStudent(st);
                    break;
                    
                case 2:
                    st = new UNIVERSITY();
                    st.input();
                    list1.inputStudent(st);
                    break;
                    
                case 3:
                    System.out.print("Export college students: ");
                    list1.outputCOL();
                    break;
                
                case 4:
                    System.out.print("Export university students: ");
                    list1.outputUNI();
                    break;
                    
                default:
                    choose = 0;
                    break;
            }
        }
        while(choose != 0);
    }
}
