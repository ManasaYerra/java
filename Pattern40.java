class Pattern40
{
	public static void main(String[] args) 
	{
		for(int i=1;i<+4;i++)
		{
			int n=2;
		    char ch='a';
			for(int j=1;j<=4;j++)
			{
				if(i == 1 || i == 3)
				{
					System.out.print(n + " ");
					n=n+2;
				}
				else
				{
					System.out.print(ch++ + " ");
					ch++;
				}
			}
			System.out.println(" ");
		}
	}
}