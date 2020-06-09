import java.util.*;

class Exercise2
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input student code: ");
        String code = s.nextLine();

        System.out.print("Input name: ");
        String name = s.nextLine();

        System.out.print("Input age: ");
        int age = s.nextInt();

        System.out.print("Input points: ");
        double points = s.nextFloat();

        System.out.print(code + " " + name + " " + age + " " + points);
        s.close();
    }
}