package session5assignment;
import session5assignment.MyInterface;

public class MyClass2 implements MyInterface
{

	
	@Override
	public void print() 
	{
		// TODO Auto-generated method stub
		int sqrnum = 0;
		sqrnum = (num * num);
		System.out.println("The square of the number is:"+sqrnum);
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyInterface i2;
		i2 = new MyClass2();
		//sqrnum =num*num;
		i2.print();
		
		
	}


}
