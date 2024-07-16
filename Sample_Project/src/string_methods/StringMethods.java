package string_methods;

public class StringMethods {

	String s="Hello";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringMethods obj=new StringMethods();
obj.display();
	}
	public void display()
	{
		int length=s.length();
		//System.out.println("Length:"+length);
		char position=s.charAt(2);
		//System.out.println("Position:"+position);
		int c=10;
		String x=String.valueOf(c);
		//System.out.println(+c);
		String str1="Java";
		String str2="Java";
		String str3="JAVA";
		String str4="Welcome";
		//System.out.println(str1.equals(str2));
		//System.out.println(str1.equals(str3));
		//System.out.println(str1.equals(str4));
		//System.out.println(str1.equalsIgnoreCase(str3));
		
		String emptycheck="";
		System.out.println(emptycheck.isEmpty());
	}
	}


