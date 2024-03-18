                            // ATM Machine With the help of Switch Statement

import java.util.Scanner;

public class AtmMachine {
	static String Name="Rahul";
	static int pin=9900;
	long AccNumber=0;
	static long totalBalance=10000;
	public static void main(String[] args) {
		System.err.println("                    Welcome....   ");
		Scanner sc=new Scanner(System.in);
		int a;
	do {
		Display();
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter Name");
			String Name5=sc.next();
			System.out.println("Enter your Pin");
			int pin5=sc.nextInt();
			if(Name==Name5 || pin==pin5) {
				CheckBalance();
			}
			else {
				System.out.println("   Sorry!... Invalid Details.   ");
			}
			
			break;
		case 2:
			System.out.println("Enter Name");
			String Name6=sc.next();
			System.out.println("Enter your Pin");
			int pin6=sc.nextInt();
			if(Name==Name6 ||pin==pin6) {
			    System.out.println("Enter Amount for Withrawal: ");
			    int amount=sc.nextInt();
			    Withrawal(amount);
			}
			else {
				System.out.println("   Sorry!... Invalid Details.   ");
			}
			
			break;
		case 3:
			System.out.println("Enter Name");
			String Name8=sc.next();
			System.out.println("Enter your Pin");
			int pin8=sc.nextInt();
			if(Name==Name8 || pin==pin8) {
			   System.out.println("Enter Amount for Deposite: ");
	           int amountD=sc.nextInt();
		   	   Deposite(amountD);
		    }
			else {
				System.out.println("   Sorry!... Invalid Details.   ");
			}
			break;
			
		case 4:
			System.out.println("Enter Name");
			String Name7=sc.next();
			System.out.println("Enter your Pin");
			int pin7=sc.nextInt();
			if(Name==Name7 || pin==pin7) {
		    	System.out.println("Enter Pin: ");
		    	int pin1=sc.nextInt();
			    CheckAmount(pin1);
	      	}
			else {
				System.out.println("   Sorry!... Invalid Details.   ");
			}
			break;
		}
		System.out.println("Press 1 for Continue Application");
		a=sc.nextInt();
	}while(a==1);
	System.err.println("             Thank You for using Our Applicaton....   ");
		
	}
	public static void CheckAmount(int pin2) {
		pin=pin2;
		System.out.println("pin is Created");
		
	}
	public static void Display() {
		System.out.println("Press 1 for Check Balance: ");
		System.out.println("Press 2 for Withdrawal Money: ");
		System.out.println("Press 3 for Deposite Money: ");
		System.out.println("Press 4 for Set Pin: ");
	}
	public static void Deposite(int amount) {
		totalBalance=totalBalance+amount;
		CheckBalance();
	}
	public static void Withrawal(int amount) {
		
		if(amount<=totalBalance)
		{
		  totalBalance=totalBalance-amount;
		  CheckBalance();
		}
		else {
			System.out.println("Sorry! Invalid Amount.....");
		}
	}
	public static void CheckBalance() {
		System.out.println("Your Account Balance Is: " +totalBalance);
	}
	
}
