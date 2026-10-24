class  Tv
{
	String brand;
	int cost;
	String type;
	
	Tv(String brand, int cost, String type){
		this.brand=brand;
		this.cost=cost;
		this.type=type;
		
		return;
	}
	public static void main(String[] args) 
	{
		Tv t1= new Tv("DELL", 500000, "LED");
		System.out.println(t1.brand);
		System.out.println(t1.cost);
		System.out.println(t1.type);
	}
}
