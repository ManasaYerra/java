import java.util.Scanner;
class ATMOperations 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int pin1=1234;
		int balance=500;
		System.out.println("Enter the password");
		int s1=sc.nextInt();
		int pin2=sc.nextInt();
		if(pin2==pin1)
		{
			System.out.println("Choose any 1 option from below");
			System.out.println("Choose a for Deposit");
			System.out.println("Choose b for Withdraw");
			System.out.println("Choose c for Balance enquiry");
			System.out.println("Choose d for Change the password");
			char option=sc.next().charAt(0);
			switch(option)
			{
				case 'a':System.out.println("You have choosen deposit operation");
				System.out.println("Enter the amount to be deposited");
				int deposited=sc.nextInt();
				System.out.println("deposit successful");
				break;
				case 'b':System.out.println("You have choosen the withdraw operation");
				System.out.println("Enter the amount to be withdraw");
				int withdraw=sc.nextInt();
				if(withdraw<=balance)
				{
					balance=balance-withdraw;
					System.out.println("Available balance:"+balance);
					break;
				}
				else
				{
					System.out.println("Insufficient balance");
					break;
				}
				case 'c':System.out.println("Available balance is" +balance);
				break;
				case 'd':System.out.println("You have choosen pin change");
				System.out.println("Enter the new password");
				pin1=sc.nextInt();
				System.out.println("Password is successfully changed");
				break;
				default:System.out.println("Enter the option between a to d");
			}
		}
		else
		{
			System.out.println("wrong password");
		}
	}
}	