package gg;

public abstract class Animal {
	public abstract void sleep();
}
class Tiger extends Animal{
	public void sleep(){
		System.out.println("Å¿×ÅË¯...");
	}
}
class Monkey extends Animal{
	public void sleep(){
		System.out.println("Ñö×ÅË¯...");
	}
}
