

public class School {
	String name;
	int strength;
	String grade;
	School(String name,int strength,String grade){
		this.name=name;
		this.strength=strength;
		this.grade=grade;
	}
	public String toString() {
		return this.name+" "+this.strength+" "+this.grade;
	}
public static void main(String[] args) {
	School s1=new School("csi",3000,"XII");
	System.out.println(s1);
}
}