class Tester3
{
	int r=10;
	void disp(){
		System.out.println("Hi");
	}
}
class Tista1 extends Tester3
{
	void uliya(){
		System.out.println("Hello");
	}
}


class Main10
{
	public static void main(String[] args) 
	{
		Tester3 t3 = new Tista1();
		t3.disp();
		System.out.println(t3.r);
		
		Tista1 t1 = (Tista1)t3;
		t1.uliya();
		
	}
}