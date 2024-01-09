package loopin_statement;

import java.util.Scanner;

public class Hotel_Menu {

	public static void main(String[] args)
	{
		int choice,ch1;
		int total=0;
		int qut=0;
		char ans;
		String Item_ord="";
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Priti's Hotel");
		do
		{
			System.out.println("1:Starters\n2:Main Course\n3:Deserts\n4:Drink");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
					System.out.println("Starters:");
					System.out.println("1:papad      		 40Rs.");
					System.out.println("2:masala papad       50Rs.");
					System.out.println("3:chilli manchurian  60Rs.");
					System.out.println("4:chilli popato      70Rs.");
					System.out.println("4:chilli chicken     80Rs.");
					ch1=sc.nextInt();
						switch(ch1)
						{
						case 1:
							total=total+40;
							qut=qut+1;
							Item_ord+="papad\n";
							break;
						case 2:
							total=total+50;
							Item_ord+="masala papad\n";
							qut=qut+1;
							break;
						case 3:
							total=total+60;
							Item_ord+="chilli machurian\n";
							qut=qut+1;
							break;
						case 4:
							total=total+70;
							Item_ord+="chilli popato\n";
							qut=qut+1;
							break;
						case 5:
							total=total+80;
							Item_ord+="chilli chicken\n";
							qut=qut+1;
							break;
						default:
							System.out.println("you enter invalid choice :(");
							break;
						}
					break;
			case 2:
				System.out.println("Maain course:");
				System.out.println("1:veg thali      		100Rs.");
				System.out.println("2:non-veg thali      	120Rs.");
				System.out.println("3:spcial veg thali      180Rs.");
				System.out.println("4:special non-veg thali 220Rs.");
				ch1=sc.nextInt();
				switch(ch1)
				{
				case 1:
					total=total+100;
					qut=qut+1;
					Item_ord+="veg thali\n";
					break;
				case 2:
					total=total+120;
					qut=qut+1;
					Item_ord+="non-veg thali\n";
					break;
				case 3:
					total=total+180;
					qut=qut+1;
					Item_ord+="spcial veg thali\n";
					break;
				case 4:
					total=total+220;
					qut=qut+1;
					Item_ord+="special non-veg thali\n";
					break;
				default:
					System.out.println("you enter invalid choice :(");
					break;
				}
				break;
			case 3:
				System.out.println("Deserts:");
				System.out.println("1:gulab jamun       20Rs.");
				System.out.println("2:Rusgulla      	20Rs.");
				System.out.println("3:Kala jamun   		50Rs.");
				System.out.println("4:Shreekhand      	70Rs.");
				ch1=sc.nextInt();
				switch(ch1)
				{
				case 1:
					total=total+40;
					qut=qut+1;
					Item_ord+="gulab jamun\n";
					break;
				case 2:
					total=total+50;
					qut=qut+1;
					Item_ord+="Rusgulla\n";
					break;
				case 3:
					total=total+60;
					qut=qut+1;
					Item_ord+="cKala jamun\n";
					break;
				case 4:
					total=total+70;
					qut=qut+1;
					Item_ord+="Shreekhand\n";
					break;
				default:
					System.out.println("you enter invalid choice :(");
					break;
				}
				break;
			case 4:
				System.out.println("Drinks:");
				System.out.println("1:Mocktel      	  50Rs.");
				System.out.println("2:cocktel     	  60Rs.");
				System.out.println("3:Mohito    	  70Rs.");
				System.out.println("4:Lemon juice     80Rs.");
				ch1=sc.nextInt();
				switch(ch1)
				{
				case 1:
					total=total+50;
					qut=qut+1;
					Item_ord+="Mocktel\n";
					break;
				case 2:
					total=total+60;
					qut=qut+1;
					Item_ord+="cocktel\n";
					break;
				case 3:
					total=total+70;
					qut=qut+1;
					Item_ord+="Mohito\n";
					break;
				case 4:
					total=total+80;
					qut=qut+1;
					Item_ord+="Lemon juice\n";
					break;
				default:
					System.out.println("you enter invalid choice :(");
					break;
				}
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			
			System.out.println("Do you want to add any other item Y/N");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
		
		System.out.println("Bill:");
		System.out.println("the order item are:\n"+Item_ord);
		System.out.println("the total quentity is:"+qut);
		System.out.println("Total amount="+total);
		System.out.println("Thans for coming\nVisit again :)");
	}

}
