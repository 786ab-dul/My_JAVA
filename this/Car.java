class  Car
{
	int cost;
	String model;
	String type;
	
	Car(int cost, String model, String type){
		this.cost=cost;
		this.model=model;
		this.type=type;
		
		return;
	}
	public static void main(String[] args) 
	{
		Car m1= new Car(2500000, "i20", "white");
		System.out.println(m1.cost);
		System.out.println(m1.model);
		System.out.println(m1.type);
	}
}
