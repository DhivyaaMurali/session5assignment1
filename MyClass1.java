package session5assignment;
import session5assignment.MyInterface;

public class MyClass1 implements MyInterface {

	@Override
	public void print() 
	{
		// TODO Auto-generated method stub
		System.out.println("The number is:"+num);
		
	}
	public static void main(String[] args)
	{
	
	MyInterface i1;
	i1 = new MyClass1();
	i1.print();
	
	}

}
