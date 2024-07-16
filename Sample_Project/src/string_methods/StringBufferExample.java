package string_methods;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("Java");
		//System.out.println(s);
s.append("new");
System.out.println(s);
s.insert(4, " ");
System.out.println(s);
s.replace(4, 5, " Insert ");
System.out.println(s);
s.delete(5, 11);
System.out.println(s);
s.reverse();
System.out.println(s);
	}

}
