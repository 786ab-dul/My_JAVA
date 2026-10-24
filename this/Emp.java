class  Emp
{
	
	int id, sal; 
		char grade;
	
	
	Emp(int id, int sal, char grade){
		this.id=id;
		this.sal=sal;
		this.grade=grade;
		
		return;
	}
	public static void main(String[] args) 
	{
	    Emp e1= new Emp(101, 520000, 'A');
		System.out.println(e1.id);
		System.out.println(e1.sal);
		System.out.println(e1.grade);
	}
}