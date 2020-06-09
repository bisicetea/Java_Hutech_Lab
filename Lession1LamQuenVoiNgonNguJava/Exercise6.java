import java.util.*;

class Array
{
	private int mount;
	private int a[];
	
	public int getMount()
	{
		return mount;
	}

	public void setMount(int m)
	{
		mount = m;
	}
	
	public void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("-> Input mount of array: ");
		mount = s.nextInt();
		a = new int[mount];
		
		for (int i = 0; i < mount; i++)
		{	
			System.out.print("-> Input a[" + i + "]: ");
			a[i] = s.nextInt();
		}
		s.close();
	}
	public void output()
	{
		for (int i = 0; i < mount; i++)
			System.out.print(a[i] + " ");
	}
	public double OddAverage()
	{
		int oddSum = 0, count = 0;
		for (int i = 0; i < mount; i++)
			if (a[i] % 2 == 1)
			{	
				oddSum += a[i];
				count++;
			}
		return (double)oddSum / count;
	}
	
	public int Max()
	{
		int max = a[0];
		for (int i = 0; i <  mount; i++)
			if (max < a[i])
				max = a[i];
		return max;
	}
	
	public void Sort()
	{
		for (int i = 0; i < mount - 1; i++)
			for (int j = i + 1; j < mount; j++)
				if (a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
	}
}

class Exercise6
{
	public static void main (String[] args)
	{
		Array a = new Array();
		a.input();
		System.out.print("\nArray:\n");
		a.output();
		System.out.print("\n\nTB cac so le = " + a.OddAverage());
		System.out.print("\nMax = " + a.Max() + ".");
		a.Sort();
		System.out.print("\n\nArray after sort:\n");
		a.output();
	}
}