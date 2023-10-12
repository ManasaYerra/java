class Pattern21
{
	public static void main(String[] args) 
	{
		int n=1;
		int rows=4;
	    int columns=4;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=columns;j++)
			{
				if(i==2 && j==2 || i==2 && j==3 || i==3 && j==2 || i==3 && j==3)
				{
		System.out.print(" " + " ");
				}
				else
				{
					System.out.print(n + " ");
					n++;
				}
				if(n==10)
					n=1;
		}
		System.out.println(" ");
		}
	}
}


