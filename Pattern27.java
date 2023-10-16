class Pattern27
{
	public static void main(String[] args) 
	{
		int rows=4;
		int columns=4;
		for(int i=1;i<=rows;i++)
		{
			int temp=i;
			for(int j=1;j<=columns;j++)
			{
				System.out.print(temp + " ");
				temp=temp+4;
			}
			System.out.println(" ");
		}
	}
}


