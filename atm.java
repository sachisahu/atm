import java .util.Scanner;
class atm
{
	public static void main(String args[])
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.PIN CHANGE                                   4.BANKING");
		System.out.println("2.PIN GENERATE                              5.BALANCE");
		System.out.println("3.CHANGE MOBILE NUMBER          6.TRANSFER");
		x=sc.nextInt();
		if(x==1)
		{
			System.out.println("ENTER OLD PIN");
			int a=sc.nextInt();
			System.out.println("ENTER NEW PIN");
			int b=sc.nextInt();
			System.out.println("REENTER NEW PIN");
			int c=sc.nextInt();
			if(b==c)
			{
				System.out.println("ENTER RMN");
				int d=sc.nextInt();
				System.out.println("VERIFY OTP");
				int otp=sc.nextInt();
				System.out.println("PIN HAS BEEN SUCCESSFULLY CHANGED");
			}
			else
			{
				System.out.println("WRONG INPUT");
				
			}
			
		}
		else if(x==2)
		{
			System.out.println("ENTER RMN");
			int a=sc.nextInt();
			System.out.println("ENTER ANY TWO DIGIT");
			int b=sc.nextInt();
			System.out.println("THIS IS YOUR LAST TWO DIGIT PIN FIRST TWO HAS BEEN SENT TO RMN");
		}
		else if(x==3)
		{
			System.out.println("ENTER YOUR AC/NO");
			int a=sc.nextInt();
			System.out.println("ENTER NEW MOBILE NUMBER");
			int b=sc.nextInt();
			System.out.println("ENTER OTP SENT TO OLD MOBILE NUMBER");
			int c=sc.nextInt();
			System.out.println("we have successfully changed your mobile number");
		}
		else if(x==4)
		{
			int y;
			System.out.println("1.DEPOSITE");
			System.out.println("2.FAST CASH");
			System.out.println("3.CASH WITHDRAW");
			System.out.println("4.MINI STATEMENT");
			System.out.println("5.OTHERS");
			y=sc.nextInt();
			if(y==1)
			{
				System.out.println("PUT YOUR CASH IN DIPOSITER");
				System.out.println("EXAMPLE IF U HAVE TO DEPOSITE 5 (100 NOTES) WRITE 100*5");
				String s=sc.next();
				System.out.println("SCANNING YOUR CASH");
				System.out.println("YOUR NOTES ARE "+s);
				System.out.println("ENTER YOUR PIN");
				int pin=sc.nextInt();
				System.out.println("you have successfully deposited");
			}
			else if(y==2)
			{
				System.out.println("SELECT ONE");
				System.out.println("100");
				System.out.println("500");
				System.out.println("1000");
				System.out.println("5000");
				System.out.println("10000");
				int a=sc.nextInt();
				System.out.println("ENTER PIN");
				int pin=sc.nextInt();
				System.out.println("COLLECT YOUR CASH");
			}
			else if(y==3)
			{
				System.out.println("ENTER AMOUNT");
				int a=sc.nextInt();
				System.out.println("ENTER PIN");
				int pin=sc.nextInt();
				System.out.println("COLLECT YOUR CASH");
			}
			else if(y==4)
			{
				System.out.println("ENTER PIN");
				int pin=sc.nextInt();
				System.out.println("12-oct-2019   -        200000(credit)");
				System.out.println("13-oct-2019   -        2000(credit)");
				System.out.println("16-oct-2019   -        20000(debit)");
				System.out.println("AVLAIBLE BALANCE= 182000");
			}
			else if(y==5)
			{
				System.out.println("othes not avlaible right now");
			}
			else
			{
				System.out.println("choose correct option");
			}
		}
		else if(x==5)
		{
			System.out.println("AVLAIBLE BALANCE= 182000");
		}
		else if(x==6)
		{
			System.out.println("select any one");
			System.out.println("1.THIS BANK");
			System.out.println("2.OTHER BANK");
			int t;
			t=sc.nextInt();
			if(t==1)
			{
				System.out.println("ENTER IFSC CODE");
				String s=sc.next();
				System.out.println("ACCONNT NO TO BE TRANSFERED");
				int y=sc.nextInt();
				System.out.println("AMONT TO BE TRANSFERED");
				int amt=sc.nextInt();
				System.out.println("AMOUNT OF "+amt+" HAS BEEN TRANSFERED TO "+y);
			}
			else if(t==2)
			{
				System.out.println("          SELECT BANK");
				System.out.println("HDFC BANK");
				System.out.println("ICICI BANK");
				System.out.println("ANDHRA BANK");
				String l=sc.next();
				System.out.println("ENTER IFSC CODE");
				String n=sc.next();
				System.out.println("ACCONNT NO TO BE TRANSFERED");
				int y=sc.nextInt();
				System.out.println("AMONT TO BE TRANSFERED");
				int amt=sc.nextInt();
				System.out.println("AMOUNT OF "+amt+" HAS BEEN TRANSFERED TO "+y);
			}
			else
			{
				System.out.println("CHOOSE CORRECT OPTION");
			}
		}
				
		else
		{
			System.out.println("CHOOSE CORRECT OPTION");
		}
	}
}