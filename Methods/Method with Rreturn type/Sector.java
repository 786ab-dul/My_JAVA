class Sector 
{
	static double area(){
		int angle=80;
		int r= 18;
		double res= (angle/360.0) * 3.142 * r*r;
		return res;
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Area of Sector");
		double x= area();
		System.out.println(x);
	}
}
