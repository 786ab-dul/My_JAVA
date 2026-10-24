class Sample 
{
	public int hashCode(){
		return 123456789;
	}
	public static void main(String[] args) 
	{
		Sample d1 = new Sample();
		System.out.println(d1.hashCode());
		
		Sample d2 = new Sample();
		System.out.println(d2.hashCode());
		
		Sample d3 = new Sample();
		System.out.println(d3.hashCode());
	}
}
