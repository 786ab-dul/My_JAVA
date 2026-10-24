class Circle 
{
	static double area(){
		final double pi = 3.142;
		int r = 3;
		double res = pi*r*r;
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println("Area of Circle");
		double x= area();
		System.out.println(x);
	}
}
