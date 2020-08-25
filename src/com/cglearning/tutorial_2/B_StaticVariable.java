package com.cglearning.tutorial_2;

public class B_StaticVariable {
	
	public static String staticVar = "I am a static variable";
	
	public static void main(String[] args) {
		B_StaticVariable obj1 = new B_StaticVariable();
		B_StaticVariable obj2 = new B_StaticVariable();
		B_StaticVariable obj3 = new B_StaticVariable();
		
		// All three will display the static variable
		System.out.println(obj1.staticVar);
		System.out.println(obj2.staticVar);
		System.out.println(obj3.staticVar);
		
		obj2.staticVar = "changed static variable";
		
		// All three will display the changed static variable 
		/* this means static variable is a class variable and is shared across all instances
		 * even if one instance alters the value of the variable, it is reflected across all instances
		 */
		System.out.println(obj1.staticVar);
		System.out.println(obj2.staticVar);
		System.out.println(obj3.staticVar);
		
		// hence we can access static variables with out object; this does not apply for instance/local variables
		System.out.println(staticVar);
	}

}
