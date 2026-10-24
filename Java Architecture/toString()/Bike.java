

public class Bike {
	String brand;
	int cost;
	String color;
	Bike(String brand,int cost,String color){
		this.brand=brand;
		this.cost=cost;
		this.color=color;
	}
	public String toString() {
		return this.brand+" "+this.cost+" "+this.color;
	
	}
	public static void main(String[] args) {
		Bike b1=new Bike("Duke 390",4500000,"orange");
		System.out.println(b1);
	}

}