class Pattern30 
{
	public static void main(String[] args) 
	{
	int rows=3;
	int columns=3;
		for(int i=1;i<=rows;i++)
	{
		for(int j=1;j<=columns;j++)
		{
			if(i==1 && j==1 || i==2 && j==2 || i==3 && j==3)
			{
		System.out.print("*" + " ");
		}
		else
		{
			System.out.print(" " + " ");
		}
		System.out.println();
		}
	}
}
