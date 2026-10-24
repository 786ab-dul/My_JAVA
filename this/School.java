class  School
{
	String name;
	char grade;
	String strength;
	
	School(String name, char grade, String strength){
		this.name=name;
		this.grade=grade;
		this.strength=strength;
		
		return;
	}
	public static void main(String[] args) 
	{
		School m1= new School("Primary School", 'B', "Teaching");
		System.out.println(m1.name);
		System.out.println(m1.grade);
		System.out.println(m1.strength);
	}
}
