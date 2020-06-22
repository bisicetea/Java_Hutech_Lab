package interfaceandpackage;
import java.util.Scanner;

public class MAIN
{
    public static void main(String[] args)
    {
        int n, choose;
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input mount: ");
        n = s.nextInt();
        
        HINH list[] = new HINH[n];
        
        for(int i = 0; i < n; i++)
        {
            System.out.println("-----------------------");
            System.out.print("1: Square.\n2: Rectangle.\n3: Circle.\n");
            System.out.println("-----------------------");
            System.out.print("Choose: ");
            choose = s.nextInt();
            switch(choose)
            {
                case 1:
                    list[i] = new HINHVUONG();
                    list[i].input();
                    break;
                    
                case 2:
                    list[i] = new HINHCN();
                    list[i].input();
                    break;
                
                case 3:
                    list[i] = new HINHTRON();
                    list[i].input();
                    break;
                    
                default:
                    System.out.print("Error, only 1 -> 3. Exit.");
                    break;
            }
        }
        for (int j = 0; j < n; j++)
        {
            System.out.print("\n");
            list[j].output();
            System.out.println("Area: " + list[j].Area() + ".");
        }
    }
}