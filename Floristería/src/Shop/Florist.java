package Shop;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Florist 
{
	private static String shopName;
	private static ArrayList<Tree> trees = new ArrayList<>();
	private static ArrayList<Flower> flowers = new ArrayList<>();
	private static ArrayList<Decoration> decorations = new ArrayList();

	public Florist (String name)
	{
		this.shopName = name;
	}
	
	public Florist(String shopName, ArrayList<Tree> trees, ArrayList<Flower> flowers, ArrayList<Decoration> decorations)
	{
		this.shopName = shopName;
		this.trees = new ArrayList<>();
		this.flowers = new ArrayList<>();
		this.decorations = new ArrayList<>();
	}
	
	public String getShopName() 
	{
		return shopName;
	}
	public void setShopName(String shopName)
	{
		this.shopName = shopName;
	}

	public ArrayList<Tree> getTrees() 
	{
		return trees;
	}
	public void setTrees(ArrayList<Tree> trees) 
	{
		this.trees = trees;
	}

	public ArrayList<Flower> getFlowers() 
	{
		return flowers;
	}
	public void setFlowers(ArrayList<Flower> flowers) 
	{
		this.flowers = flowers;
	}

	public ArrayList<Decoration> getDecorations() 
	{
		return decorations;
	}
	public void setDecorations(ArrayList<Decoration> decorations) 
	{
		this.decorations = decorations;
	}

	
	public static void createTree()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the tree");
		String name = sc.nextLine();
		System.out.println("Enter the size of the tree");
		int size = sc.nextInt();
		System.out.println("Enter the price of the tree");
		int price = sc.nextInt();
        System.out.println("The tree: " + name + "/" + size + "/" + price + " has been created");
        Tree tree = new Tree();
		trees.add(tree);
	}
	
	public static void createFlower()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the flower");
		String name = sc.nextLine();
		System.out.println("Enter the color of the flower");
		String color = sc.nextLine();
		System.out.println("Enter the price of the flower");
		int price = sc.nextInt();
		System.out.println("The flower: " + name + "/" + color + "/" + price + " has been created");
	}
	
	public static void createDecoration()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the decoration");
		String name = sc.nextLine();
		System.out.println("Choose between 'WOOD' or 'PLASTIC'");
		String material = sc.nextLine();
		System.out.println("Enter the price of the decoration");
		int price = sc.nextInt();
		System.out.println("The decoration: " + name + "/" + material + "/" + price + " has been created");
	}
	
	/*public void insertTree()
	{
		Tree tree = new Tree();
		trees.add(tree);
	}
	public void insertFlower()
	{
		Flower flower = new Flower();
		flowers.add(flower);
	}
	public void insertDecoration()
	{
		Decoration decoration = new Decoration();
		decorations.add(decoration);
	}*/

	public static void showStock()
	{
		System.out.println("Florist [shopName=" + shopName + ", trees=" + trees + ", flowers=" + flowers + ", decorations="
				+ decorations + "]");
	}
	
	@Override
	public String toString() {
		return "Florist [shopName=" + shopName + ", trees=" + trees + ", flowers=" + flowers + ", decorations="
				+ decorations + "]";
	}
	
	
	
}
