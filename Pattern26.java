class Pattern26
{
	public static void main(String[] args) 
	{
		int n=1;
	    char c='a';
		int rows=4;
		int columns=4;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=columns;j++)
			{
				if(i==1 || i==3)
				{
		System.out.print(n++ + " ");
				}
				else
				{
					System.out.print(c++ + " ");
			}
		}
		System.out.println(" ");
		}
	}
}


