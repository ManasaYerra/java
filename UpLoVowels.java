class UpLoVowels 
{
	public static void main(String[] args)
	{
		System.out.println("The lowercase vowels are : ");
		for(char i='a';i<='z';i++)
		{
			if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
				System.out.println(i);
		}
		System.out.println("The uppercase vowels are : ");
		for(char i='A';i<='Z';i++)
		{
			if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U')
				System.out.println(i);
		}
	}
}
