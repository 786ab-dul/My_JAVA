

public class Cloth {
	String size;
	String color;
	int cost;
	Cloth(String size,String color,int cost){
		this.size=size;
		this.color=color;
		this.cost=cost;
	}
	public String toString() {
		return this.size+" "+this.color+" "+this.cost;
	}
	public static void main(String[] args) {
		Cloth c1=new Cloth("XLL","Blue",550);
		System.out.println(c1);
	}

}