class Pattern47
{
	public static void main(String[] args) 
	{
		int rows=4;
		int columns=7;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=columns;j++)
			{
				if(i==1 || j==1 || j==7 || i+j==5 || j-i==3)
				{
		System.out.print("*" + " ");
				}
				else
				{
					System.out.print(" " + " ");
				}
			}
					System.out.println(" ");
		}
	}
}

