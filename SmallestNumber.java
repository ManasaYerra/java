import java.util.Scanner;
class SmallestNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 integers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(test(a,b,c));
	}
	public static int test(int a,int b,int c)
	{
		return((a<b&&a<c)?a:(b<c)?b:c);
	}
}