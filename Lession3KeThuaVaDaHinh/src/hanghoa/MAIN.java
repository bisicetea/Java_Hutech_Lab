// Name: Tran Van Nhan
// PC: 677

package hanghoa;

import java.util.*;

public class MAIN
{
    public static void main(String[] args)
    {
        byte choose = 0;
        Scanner s = new Scanner(System.in);
        DSHANGHOA list = new DSHANGHOA();
        HANGHOA h;
        
        do
        {
            System.out.println("1: Add 1 item to the list.");
            System.out.println("2: Export items by type.");
            System.out.println("3: Exit.");
            System.out.println("----------------------------");
            System.out.print("Choose: ");
            choose = s.nextByte();
            
            switch(choose)
            {
                case 1:
                    System.out.print("1: Electronics, 2: Foods. Choose: ");
                    byte type = s.nextByte();
                    if (type == 1)
                        h = new HANGDM();
                    else
                        h = new HANGTP();
                    h.input();
                    list.inputGoods(h);
                    break;
                    
                case 2:
                    System.out.print("Export type [DM(1)/TP(2)]: ");
                    byte typeGood = s.nextByte();
                    list.outputByType(typeGood);
                    break;
                    
                default:
                    choose = 0;
                    break;
            }
        }
        while(choose != 0);
        
        // Use arraylist.
        System.out.print("\n\n\n-- ARRAYLIST --\n");
        ArrayList<HANGHOA> list2 = new ArrayList<HANGHOA>(5);
        list2.add(new HANGDM("TV1", "Tivi", 2000000, 2, 220, 1500));
        list2.add(new HANGTP("F1", "Fish", 10000, "09/06", "11/06"));
        list2.add(new HANGDM("RF2", "Refrigerator", 5000000, 2, 220, 4000));
        list2.add(new HANGTP("A2", "Apple", 5000, "22/06", "28/06"));
        list2.add(new HANGDM("LT3", "Laptop", 16000000, 2, 220, 1000));
        for(HANGHOA x:list2)
            if(x instanceof HANGDM)
                x.output();
            else if(x instanceof HANGTP)
                x.output();
    }
}
