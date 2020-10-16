package org.java.core;

public class LocalVsInstance {
	public static void main(String...strings)
	{
		Abc obj=new Abc();
		obj.accept();
	}
}
class Abc{
	private int i;
	public void show()
	{
		
		int i=10;
		System.out.println("Value of Local Variable i is:"+i);
		System.out.println("Value of Instance Variable i is"+this.i);
	}
	public void accept()
	{
		i=20;
		show();
	}

}