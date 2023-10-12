class Pattern13
{
	public static void main(String[] args) 
	{
		int n=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<8;j++)
			{
			if(n%2!=0)
			System.out.print(n+" ");
			n++;
			if(n==10)
			n=1;
		    }
			System.out.println();
		}
	}
}