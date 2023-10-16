class Pattern32
{
	public static void main(String[] args) 
	{
	int rows=5;
	int columns=5;
		for(int i=1;i<=rows;i++)
	{
		for(int j=1;j<=columns;j++)
		{
			if(i==j && i+j==6)
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
