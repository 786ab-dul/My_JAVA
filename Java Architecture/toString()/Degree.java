

public class Degree {
	int cost;
	String deg_name;
	String uni_name;
	Degree(int cost,String deg_name,String uni_name){
		this.cost=cost;
		this.deg_name=deg_name;
		this.uni_name=uni_name;
	}
	public String toString() {
		return this.cost+" "+this.deg_name+" "+this.uni_name;
	}
	public static void main(String[] args) {
		Degree d1=new Degree(55000,"BCA","Thiruvalluar");
		System.out.println(d1);
	}
	

}