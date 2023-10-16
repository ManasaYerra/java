class Pattern39
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++)
		{
			int n=1;
		    char c='a';
			for(int j=1;j<=4;j++)
				{
				if(i==1 || i==2)
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