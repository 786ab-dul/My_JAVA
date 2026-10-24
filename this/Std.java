class  Std
{
	char sec;
	String stdname;
	double fees;
	
	Std(char sec, String stdname, double fees){
		this.sec=sec;
		this.stdname=stdname;
		this.fees=fees;
		
		return;
	}
	public static void main(String[] args) 
	{
	    Std s1= new Std('A', "ABDUL", 454654);
		System.out.println(s1.sec);
		System.out.println(s1.stdname);
		System.out.println(s1.fees);
	}
}

