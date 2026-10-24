class  Home
{
	String name;
	int cost;
	String color;
	
	Home(String name, int cost, String color){
		this.name=name;
		this.cost=cost;
		this.color=color;
		
		return;
	}
	public static void main(String[] args) 
	{
		Home h1= new Home("AMR", 520000, "Pink");
		System.out.println(h1.name);
		System.out.println(h1.cost);
		System.out.println(h1.color);
	}
}