import java.io.*;
import java.util.*;

class Employee
{
    String code, name;
    static float basicSalary;
    static int count;
    float salaryCoef;

    Employee()
    {
        code = name = null;
        basicSalary = 0;
        salaryCoef = 0;
        count++;
    }
    Employee(String aCode, String aName, float bS ,float sal)
    {
        code = aCode;
        name = aName;
        basicSalary = bS;
        salaryCoef = sal;
        count++;
    }
    Employee(Employee copy)
    {
        code = copy.code;
        name = copy.name;
        basicSalary = copy.basicSalary;
        salaryCoef = copy.salaryCoef;
        count++;
    }

    public String getCode()
    {
        return code;
    }
    public void setCode(String aCode)
    {
        code = aCode;
    }
    String getName()
    {
        return name;
    }
    public void setName(String aName)
    {
        name = aName;
    }
    public float getBasicSalary()
    {
        return basicSalary;
    }
    public void setBasicSalary(float basicSalary2)
    {
        basicSalary = basicSalary2;
    }
    public float getSalaryCoef()
    {
        return  salaryCoef;
    }
    public void setSalaryCoef(float salaryCoef2)
    {
        salaryCoef = salaryCoef2;
    }

    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("-> Input code: ");
        code = s.nextLine();
        System.out.print("-> Input name: ");
        name = s.nextLine();
        System.out.print("-> Input basic salary: ");
        basicSalary = s.nextFloat();
        System.out.print("-> Input coefficients salary: ");
        salaryCoef = s.nextFloat();
    }

    public void output()
    {
        System.out.print(code + " " + name + " " + basicSalary + " "+salaryCoef + "\n");
    }
    
    public float Salary()
    {
        return basicSalary * salaryCoef;
    }

    public int Mount()
    {
        return count;
    }
}

class ListEmployee
{
    Employee emp[];
    int count;
    public void inputList()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("\n\n-> Input mount of Employee: ");
        count = s.nextInt();
        emp = new Employee[count];

        for (int i = 0; i < count; i++)
        {
            System.out.print("\nInput info employ " + (i + 1) + "\n--------------------------------\n");
            emp[i] = new Employee();
            emp[i].input();
        }
    }
    public void outputList()
    {
        for (int i = 0; i < count; i++)
            emp[i].output();
    }
}

class Exercise2_4
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        e1.input();
        Employee e2 = new Employee("E2", "John Hammond", (float)7300, (float)5.2);
        Employee e3 = new Employee(e1);

        // Output 3 employees.
        System.out.print("\n\n   Output 3 employee in constructor\n---------------------------------------\n");
        e1.output();
        e2.output();
        e3.output();

        // Set name and output.
        System.out.print("\n\n   Rename employee 3 in constructor\n---------------------------------------\n");
        e3.setName("Steve Jobs");
        e3.output();

        // Max of coefficients salary.
        float max = e1.getSalaryCoef();
        Employee employeeMax = new Employee(e1);
        if (max < e2.getSalaryCoef())
        {
            max = e2.getSalaryCoef();
            employeeMax = e2;
        }
        if (max < e3.getSalaryCoef())
        {
            max = e3.getSalaryCoef();
            employeeMax = e3;
        }
        System.out.println("\n\nEmployee have max of coefficients salary:");
        employeeMax.output();

        // Output list.
        ListEmployee a = new ListEmployee();
        a.inputList();
        System.out.print("\n\n\tInfo of all in list\n---------------------------------------\n");
        a.outputList();

        // Output count of employee.
        System.out.print("\nCount = " + e3.count);
    }
}