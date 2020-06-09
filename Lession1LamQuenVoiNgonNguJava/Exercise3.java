import java.util.*;

class Exercise3
{
	public static void main (String[] args)
	{
		int a[], mount;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Input mount of array: ");
		mount = s.nextInt();
		a = new int[mount];
			 
		for(int i = 0; i < mount; i++)
		{
			System.out.print("	-> Input a[" + i + "]: ");	
			a[i] = s.nextInt();
		}
			
		int max = a[0];
		for(int i = 0; i < mount; i++)
			if(max < a[i])
				max = a[i];
		
		System.out.print("Max = " + max + ".");
		s.close();
	}
}