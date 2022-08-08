package com;

import java.io.IOException;

public class ParentChildDifferentExceptions {
	public static void main(String [] args) {
		Parent p = new Child();
		p.method1();
	}
}
class Parent{
	public void method1() throws ArithmeticException {
		System.out.println("Parent class must throw the specific exception or "
				+ "its superclass thrown by the child class in case of checked exception only.");
	}
	
	public void method2() {
		System.out.println("Parent class must throw the specific exception or "
				+ "its superclass thrown by the child class in case of checked exception.");
	}
	
}
class Child extends Parent {
	@Override
	public void method1() throws IndexOutOfBoundsException{
		System.out.println("Child class throws IndexOutOfBoundsException."
				+ " IndexOutOfBoundsException is an unchecked exception");
	}
//	@Override
//	public void method2() throws IOException{
//		System.out.println("Child class throws IndexOutOfBoundsException."
//				+ " IndexOutOfBoundsException is an unchecked exception");
//	}
}
