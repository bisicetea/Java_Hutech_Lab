import java.util.*;

class Exercise9
{
	public static void main (String[] args)
	{
		int sumk = 0, k = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("-> Input column: ");
		int m = s.nextInt();
		System.out.print("-> Input row: ");
		int n = s.nextInt();
		int a[][] = new int [m][n];
		
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
			{
				System.out.print("	-> Input a[" + i + "][" + j + "]: ");
				a[i][j] = s.nextInt();
			}
		
		System.out.print("\n\nInput k: ");
		k = s.nextInt();
		for (int i = 0; i < n; i++)
			sumk += a[k - 1][i];
		
		System.out.print("\n\nSum column " + k + "= " + sumk + ".");
		s.close();
	}
}