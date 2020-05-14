package Shop;

public class Tree 
{
	String treeName;
	int size;
	int price;
	
	
	public String getTreeName() 
	{
		return treeName;
	}
	public void setTreeName(String name) 
	{
		this.treeName = name;
	}
	public int getSize() 
	{
		return size;
	}
	public void setSize(int size) 
	{
		this.size = size;
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
		return "Tree [treeName=" + treeName + ", size=" + size + ", price="
				+ price + "]";
	}
	
}
