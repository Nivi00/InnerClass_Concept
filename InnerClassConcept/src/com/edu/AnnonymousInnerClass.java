package com.edu;

abstract class MyAbstract{
	public abstract void add();
	public abstract void sub();
	public abstract void mult();
}

public class AnnonymousInnerClass {

	public static void main(String[] args) {
		//Annonymous inner class
		//can be applied to abstract class or interface
		MyAbstract ob=new MyAbstract() {

			@Override
			public void add() {
				System.out.println("Add method");
				
			}

			@Override
			public void sub() {
				System.out.println("Subtract method");
				
			}
			
			public void mult() {
				System.out.println("Multiplication method");
			}
			
		};
		ob.add();
		ob.sub();
		ob.mult();
		

	}

}
