class  Cloth
{
	String color;
	int cost;
	String size;
	
	Cloth(String color, int cost, String size){
		this.color=color;
		this.cost=cost;
		this.size=size;
		
		return;
	}
	public static void main(String[] args) 
	{
		Cloth c1= new Cloth("Balck", 520, "XL");
		System.out.println(c1.color);
		System.out.println(c1.cost);
		System.out.println(c1.size);
	}
}