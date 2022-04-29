package com.edu;
class OuterClass{
	int i;
	private class InnerClass{
		int varinner;
		InnerClass(){
			varinner=10;
		}
		void method_inner() {
			System.out.println("Innerclass Method = "+varinner);
			System.out.println("outer class variable = i "+i);
		}
	}//inner class end
	
	void outer_method() {
		InnerClass ob=new InnerClass();
		ob.method_inner();//call inner class method
		
	}
}
class OuterClass1{
	int j;
	private class InnerClass1{
		int varinnerV1;
		InnerClass1(){
			varinnerV1=20;
		}
		void method_Inner1() {
			System.out.println("Innerclass try it myself = "+varinnerV1);
			System.out.println("Outerclass try it myself = j "+j);
		}
	}
	void outer_method1() {
		InnerClass1 ob=new InnerClass1();
		ob.method_Inner1();
	}
}

public class MainApp {

	public static void main(String[] args) {
		OuterClass ob=new OuterClass();
		ob.outer_method();

		OuterClass1 ob1=new OuterClass1();
		ob1.outer_method1();
	}

}
