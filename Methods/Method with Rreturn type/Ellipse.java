class Ellipse 
{
	static double area(){
		final double pi = 3.142;
		int a = 2;
		int b= 2;
		double res = pi * a * b;
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println("Area of Ellipse");
		double x = area();
		System.out.println(x);
		
	}
}
