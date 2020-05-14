package Shop;

public class Flower 
{
	String flowerName;
	String color;
	int price;
	
	public String getFlowerName() 
	{
		return flowerName;
	}
	public void setFlowerName(String flowerName) 
	{
		this.flowerName = flowerName;
	}
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Flower [flowerName=" + flowerName + ", color=" + color
				+ ", price=" + price + "]";
	}
	
	
}
