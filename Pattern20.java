class Pattern20
{
	public static void main(String[] args) 
	{
		int rows=5;
	    int columns=5;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=columns;j++)
			{
				if(i==2 && j==2 || i==2 && j==4 || i==4 && j==2 || i==4 && j==4)
				{
		System.out.print(" " + " ");
				}
				else
				{
					System.out.print("*" + " ");
			}
		}
		System.out.println(" ");
		}
	}
}


