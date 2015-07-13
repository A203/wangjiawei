package gg;

class A {
	static{
		System.out.print(1);
	}
	{
		System.out.print(2);
	}
	A(){
		System.out.print(3);
	}
}
public class dd {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A();
		new A();
	}

}
