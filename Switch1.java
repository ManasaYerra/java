import java.util.Scanner;
class Switch1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day name");
		String s=sc.next();
		switch(s)
		{
			case "Mon":System.out.println("1");
			break;
			case "Tue":System.out.println("2");
			break;
			case "Wed":System.out.println("3");
			break;
			case "Thu":System.out.println("4");
			break;
			case "Fri":System.out.println("5");
			break;
			case "Sat":System.out.println("6");
			break;
			case "Sun":System.out.println("7");
			break;
			default:System.out.println("Enter the day name between Mon to Sun");
			break;
		}
	}
}
