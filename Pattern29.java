class Pattern29
{
	public static void main(String[] args) 
	{
		int n=65;
	    char c=(char)n;
		for(int i=1;i<=4;i++)
		{
			int temp=i+64;
			for(int j=1;j<=4;j++)
			{
					System.out.print(temp++ + " ");
					temp=temp+4;
			}
		}
		System.out.println(" ");
	}
}
