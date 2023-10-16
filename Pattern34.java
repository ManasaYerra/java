class Pattern34 
{
	public static void main(String[] args) 
	{
		int n=1;
		char c='a';
		for(int i=1;i<=4;i++)
		{
			int temp1=i;
			int temp2=i+96;
			for(int j=1;j<=4;j++)
			{
				if(j==1||j==3)
				{
		System.out.print((char)temp2 + " ");
		temp2=temp2+4;
				}
				else
				{
					System.out.print(temp1 + " ");
					temp1=temp1+4;
				}
			}
				System.out.println(" ");
		}
	}
}
