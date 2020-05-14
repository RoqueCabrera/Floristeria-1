package Shop;

public class Decoration 
{
	String decorationName;
	String type;
	int price;
	
	public String getDecorationName() 
	{
		return decorationName;
	}
	public void setDecorationName(String decorationName) 
	{
		this.decorationName = decorationName;
	}
	public String getType() 
	{
		return type;
	}
	public void setType(String type) 
	{
		this.type = type;
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
		return "Decoration [decorationName=" + decorationName + ", type=" + type
				+ ", price=" + price + "]";
	}
	
	
	
}
