package menu_card;

import java.util.Scanner;

public class hotel
{
	public static void main(String[] args) 
	{
		int choice,choice1=0,bill=0,quantity=0,i=0;
		String[] item_name=new String[20];
		int item_quantity[]=new int[20];
		int amount[]=new int[20];
		char answer =' ',answer1=' ';
		Scanner input=new Scanner(System.in);
		System.out.println("***** Welcome to GITE'S pure veg Hotel ******\n");
		do
		{
			System.out.println("-*-*-* MENU -*-*-*\n"  // display main menu
					+ "1: Starters \n"
					+ "2: Soup \n"
					+ "3: main course \n"
					+ "4: Desserts & drinks \n"
					+ "Enter your choice=");
			choice=input.nextInt();
			switch(choice)
			{
				case 1:
					do
					{
						System.out.print("-=-=-= Select Starters -=-=-=\n" // display sub menu
								+ "1) sandwich \t\t 80Rs\n"
								+ "2) Plain Chips \t\t 60Rs\n"
								+ "3) french fries \t 70Rs\n"
								+ "4) masala papads \t 50 Rs\n"
								+ "Enter your choice=");
						choice1=input.nextInt();
						switch(choice1)
						{
							case 1:
								System.out.print("Enter quantity of sandwich:");
								quantity=input.nextInt();
								bill+=80*quantity;
								item_name[i]="sandwich\t\t 80Rs";
								item_quantity[i]=quantity;
								amount[i]=80*quantity;
								i++;
								break;
								
							case 2:
								System.out.print("Enter quantity of Plain Chips plates:");
								quantity=input.nextInt();
								bill+=60*quantity;
								item_name[i]="Plain Chips \t\t 65Rs";
								item_quantity[i]=quantity;
								amount[i]=60*quantity;
								i++;
								break;
								
							case 3:
								System.out.print("Enter quantity of french fries:");
								quantity=input.nextInt();
								bill+=70*quantity;
								item_name[i]="french fries \t\t 70Rs";
								item_quantity[i]=quantity;
								amount[i]=70*quantity;
								i++;
								break;
										
							case 4:
								System.out.print("Enter quantity of masala papad:");
								quantity=input.nextInt();
								bill+=50*quantity;
								item_name[i]="masala papad \t\t 70Rs";
								item_quantity[i]=quantity;
								amount[i]=50*quantity;
								i++;
								break;
								
							default:
								System.out.println("Select Proper Menu\n");
						}
						System.out.print(">>>>>>>> Have more order with Starters (Y/N):");
						answer1=input.next().charAt(0);
						
					}while(answer1=='Y' || answer1=='y');
					break;
					
				case 2:
					do
					{
						System.out.println("-=-=-= Select Soup -=-=-=\n" // display sub menu
								+ "1) plain Soup \t 130Rs1\n"
								+ "2) tomato Soup \t 130Rs\n"
								+ "3) vegetables soup\t 80Rs\n"
								+ "4) mushroom soup\t 120Rs\n"
								+ "Enter your choice=");
						choice1=input.nextInt();
						switch(choice1)
						{
							case 1:
								System.out.print("Enter quantity of plain Soup bowl:");
								quantity=input.nextInt();
								bill+=130*quantity;
								item_name[i]="plain Soup\t 130Rs";
								item_quantity[i]=quantity;
								amount[i]=130*quantity;
								i++;
								break;
								
							case 2:
								System.out.print("Enter quantity of tomato  Soup bowl:");
								quantity=input.nextInt();
								bill+=130*quantity;
								item_name[i]="tomato Soup\t130Rs";
								item_quantity[i]=quantity;
								amount[i]=130*quantity;
								i++;
								break;
								
							case 3:
								System.out.print("Enter quantity of vegetable soup bowl:");
								quantity=input.nextInt();
								bill+=80*quantity;
								item_name[i]="vegetable soup\t 80Rs";
								item_quantity[i]=quantity;
								amount[i]=80*quantity;
								i++;
								break;
								
							case 4:
								System.out.print("Enter quantity of mushroom  Soup bowl:");
								quantity=input.nextInt();
								bill+=120*quantity;
								item_name[i]="mushroom soup\t120Rs";
								item_quantity[i]=quantity;
								amount[i]=120*quantity;
								i++;
								break;
								
							default:
								System.out.println("Select Proper Menu\n");
						}
						System.out.print(">>>>>>>> Have more order with Soup (Y/N):");
						answer1=input.next().charAt(0);
						
					}while(answer1=='Y' || answer1=='y');
					break;
					
				case 3:
					do
					{
						System.out.println("-=-=-= Main course -=-=-=\n" // display sub menu
								+ "1) Paneer tikka\t\t 120Rs\n"
								+ "2) shev bhaji \t\t 100Rs\n"
								+ "3) dal rice \t\t 180Rs\n"
								+ "4) veg kofta \t\t 150Rs\n"
								+ "Enter your choice=");
						choice1=input.nextInt();
						switch(choice1)
						{
							case 1:
								System.out.print("Enter quantity of Paneer tikka:");
								quantity=input.nextInt();
								bill+=120*quantity;
								item_name[i]="Paneer tikka \t\t 120Rs";
								item_quantity[i]=quantity;
								amount[i]=120*quantity;
								i++;
								break;
								
							case 2:
								System.out.print("Enter quantity shev bhaji:");
								quantity=input.nextInt();
								bill+=100*quantity;
								item_name[i]="shev bhaji \t\t 100Rs";
								item_quantity[i]=quantity;
								amount[i]=100*quantity;
								i++;
								break;
								
							case 3:
								System.out.print("Enter quantity of dal rice:");
								quantity=input.nextInt();
								bill+=180*quantity;
								item_name[i]="dal rice \t\t 180Rs";
								item_quantity[i]=quantity;
								amount[i]=180*quantity;
								i++;
								break;
								
							case 4:
								System.out.print("Enter quantity of veg kofta:");
						        quantity=input.nextInt();
								bill+=150*quantity;
								item_name[i]="veg kofta \t\t 180Rs";
								item_quantity[i]=quantity;
								amount[i]=150*quantity;
								i++;
								break;

							default:
								System.out.println("Select Proper Menu\n");
						}
						System.out.print(">>>>>>>> Have more order with main course (Y/N):");
						answer1=input.next().charAt(0);
						
					}while(answer1=='Y' || answer1=='y');
					break;
					
				case 4:
					do
					{
						System.out.println("-=-=-= Select dessert & Cold Drinks -=-=-=\n" // display sub menu
								+ "1) icecream \t\t 50Rs\n"
								+ "2) plain Cold Coffee \t 60Rs\n"
								+ "3) basundi \t\t 90Rs\n"
								+ "4) sprite \t\t 40Rs \n"
								+ "Enter your choice=");
						choice1=input.nextInt();
						switch(choice1)
						{
							case 1:
								System.out.print("Enter quantity of icecream:");
								quantity=input.nextInt();
								bill+=50*quantity;
								item_name[i]="ice cream \t 60Rs";
								item_quantity[i]=quantity;
								amount[i]=50*quantity;
								i++;
								break;
								
							case 2:
								System.out.print("Enter quantity of plain Cold Coffee glass:");
								quantity=input.nextInt();
								bill+=60*quantity;
								item_name[i]="plain Cold Coffee \t\t 60Rs";
								item_quantity[i]=quantity;
								amount[i]=60*quantity;
								i++;
								break;
								
							case 3:
								System.out.print("Enter quantity of basundi:");
								quantity=input.nextInt();
								bill+=90*quantity;
								item_name[i]="basundi \t\t 30Rs";
								item_quantity[i]=quantity;
								amount[i]=90*quantity;
								i++;
								break;
								
							case 4:
								System.out.print("Enter quantity of sprite:");
								quantity=input.nextInt();
								bill+=40*quantity;
								item_name[i]="sprite \t\t 40Rs";
								item_quantity[i]=quantity;
								amount[i]=40*quantity;
								i++;
								break;
								
							default:
								System.out.println("Select Proper Menu\n");
						}
						System.out.print(">>>>>>>> Have more order with dessert & Cold Drinks (Y/N):");
						answer1=input.next().charAt(0);
						
					}while(answer1=='Y' || answer1=='y');
					break;
					
				default:
					System.out.println("Select Proper Menu\n");
			}
			
			System.out.print("<<<<<<<< Do you have more order (Y/N):");
			answer=input.next().charAt(0);
			
		}while(answer=='Y' || answer=='y');
		
		System.out.println("\t\t=*=*=*=*=*=*=*=* Your BILL =*=*=*=*=*=*=*=*");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Sr.No \t\t "
				+ "Item Name \t\t "
				+ "Rate \t\t "
				+ "Quantity \t\t"
				+ "Amount \n");
		System.out.println("--------------------------------------------------------------------------------------");
		for(int j=0;j<i;j++)
		{
			System.out.println(+(j+1)+"\t\t "+item_name[j]+"\t\t "+item_quantity[j]+"\t\t\t"+amount[j]+"Rs"); // Printing bill
		}
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("\n\t\t Total amount \t\t\t\t\t\t\t"+bill+"Rs");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Thank you for coming \n Have a Good Day");
	}
}
