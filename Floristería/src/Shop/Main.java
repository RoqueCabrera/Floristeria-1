package Shop;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Flower Shop Creator!");
		Scanner sc = new Scanner (System.in);	
		System.out.println("Insert the name of the Flower Shop.");
		String shopName =sc.nextLine();
		Florist name = new Florist (shopName);
		System.out.println("The shop " + shopName + " has been created.");
		
		boolean exit = true;
		
		while (exit != false) 
		{
			System.out.println("What do you want to do?");
			System.out.println("Press '1' to add a Tree.");
			System.out.println("Press '2' to add a Flower.");
			System.out.println("Press '3' to add Decoration.");
			System.out.println("Press '4' to see the stock.");
			System.out.println("Press '5' to EXIT.");
		
			int choice = sc.nextInt();
			
			switch (choice)
			{
			case 1:
				System.out.println("Welcome to the Tree Creator!");
				Florist.createTree();
				exit =true;
				break;
				
			case 2:
				System.out.println("Welcome to the Flower Creator!");
				Florist.createFlower();
				exit =true;
				break;
				
			case 3:
				System.out.println("Welcome to the Decoration Creator!");
				Florist.createDecoration();
				exit =true;
				break;
				
			case 4:
				Florist.showStock();
				exit =true;
				break;
				
			case 5:
				exit = false;
				System.out.println("Goodbye!");
				break;
			}
		}
		
	}

}
