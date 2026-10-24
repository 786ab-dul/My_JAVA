class  Lap
{
	String name;
	int cost;
	String brand;
	
	Lap(String name, int cost, String brand){
		this.name=name;
		this.cost=cost;
		this.brand=brand;
		
		return;
	}
	public static void main(String[] args) 
	{
		Lap l1= new Lap("DELL", 520000, "Inspiroon");
		System.out.println(l1.name);
		System.out.println(l1.cost);
		System.out.println(l1.brand);
	}
}
