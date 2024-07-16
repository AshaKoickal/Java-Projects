package package1;

public class Sample {

	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.calculate(10,20);
		String d=args[0];
//System.out.println(+args[0]);
System.out.println("CommandLine arg is:"+args[0]);
	}
	public void calculate(int a, int b)
	{
		int c =a+b;
		System.out.println("Total:"+c);
	}
	
	
	}


