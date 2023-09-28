import java.util.Scanner;
class Switch2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter uppercase alphabet");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
			case 'A':System.out.println("is an vowel");
			break;
			case 'E':System.out.println("is an vowel");
			break;
			case 'I':System.out.println("is an vowel");
			break;
			case 'O':System.out.println("is an vowel");
			break;
			case 'U':System.out.println("is an vowel");
			break;
			default:System.out.println("the given alphabet is not an vowel");
			break;
		}
	}
}
