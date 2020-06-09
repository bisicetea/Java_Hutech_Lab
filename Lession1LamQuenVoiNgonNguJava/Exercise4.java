import java.util.*;

class Exercise4
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("-> Input m: ");
		int m = s.nextInt();
		System.out.print("-> Input n: ");
		int n = s.nextInt();
		
		int a[][] = new int [m][n];
		
		Random rand = new Random();
		for(int i = 0; i < m; i++)
			for(int j = 0; j < n; j++)
				a[i][j]=rand.nextInt(50);
		
		System.out.println("\nArray:");
		for(int i = 0; i < m; i++)
		{	
			for(int j = 0; j < n; j++)
				System.out.print(a[i][j] + "\t");
			System.out.print("\n");
		}
		int sum = 0;
		for(int i = 0; i < m; i++)
			for(int j = 0; j < n; j++)
				sum += a[i][j];
		System.out.print("\nSum = " + sum + ".");
		s.close();
	}
}