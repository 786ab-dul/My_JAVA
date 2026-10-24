class  Bike
{
	int cost;
	String brand;
	String color;
	
	Bike(int cost, String brand, String color){
		this.cost=cost;
		this.brand=brand;
		this.color=color;
		
		return;
	}
	public static void main(String[] args) 
	{
		Bike b1= new Bike(20000, "440cc", "Black");
		System.out.println(b1.cost);
		System.out.println(b1.brand);
		System.out.println(b1.color);
	}
}
