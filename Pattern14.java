class Pattern14
{
	public static void main(String[] args)
	{
		int n=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				for(int k=n+1;k<=1000;k++)
				{
					n=k;
					int cof=0;
					for(int l=1;l<=k;l++)
					{
						if(k%l==0)
						{
							cof++;
						}
					}
					if(cof==2)
					{
				System.out.print(n+ " ");
				break;
						}
					}
			}
			System.out.println(" ");
		}
	}
}
	