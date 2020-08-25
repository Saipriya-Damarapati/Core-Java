package com.cglearning.tutorial_2;

public class D_LocalVariable {
	
	String myInsatnceVar = "I am an instance variable";
	
	public void myMethod() {
		// Scope of the variables here is limited to this method only and they cannot be accesses outside this method
		String myVar = "Local Variable inside the method";
		System.out.println("Printing local variable inside the method --> " + myVar);
	}
	
	public static void main(String[] args) {
		D_LocalVariable obj1 = new D_LocalVariable();
		System.out.println("Now calling the method");
		obj1.myMethod();
		System.out.println("Now printing the instance variable");
		System.out.println(obj1.myInsatnceVar);
	}

}
