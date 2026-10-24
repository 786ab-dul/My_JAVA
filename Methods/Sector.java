class Sector 
{
	static void area(){
		int angle=80;
		int r= 18;
		double ar= (angle/360.0) * 3.142 * r*r;
		System.out.println(ar);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Area of Sector!");
		area();
	}
}
