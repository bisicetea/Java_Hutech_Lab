import java.util.*;

class Exercise8
{
	public static void main (String[] args)
	{
		int a[];
		int mount = 10;
		a = new int[mount];
		
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < mount; i++)
		{
			System.out.print("-> Input a[" + i + "]: ");
			a[i] = s.nextInt();
		}
		
		for (int i = 0; i < mount - 1; i++)
			for (int j = i + 1; j < mount; j++)
				if (a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		
		System.out.print("\n\nArray after sort:\n");
		for (int i = 0; i < mount; i++)
			System.out.print(a[i] + " ");
		s.close();
	}
}