package com.cglearning.tutorial_2;

public class C_InstanceVariable {
	
	String instanceVar = "I am an instance variable";
	
	public static void main(String[] args) {
		C_InstanceVariable obj1 = new C_InstanceVariable();
		C_InstanceVariable obj2 = new C_InstanceVariable();
		C_InstanceVariable obj3 = new C_InstanceVariable();
		
		System.out.println(obj1.instanceVar);
		System.out.println(obj2.instanceVar);
		System.out.println(obj3.instanceVar);
		
		obj2.instanceVar = "changed instance variable";
		
		System.out.println(obj1.instanceVar);
		System.out.println(obj2.instanceVar);
		System.out.println(obj3.instanceVar);
		
		System.out.println("------------------------------------------------");
		System.out.println("Each instance or object of a class has its own separate copy of instance variable");
		System.out.println("So, when the value of obj2 is changed, only obj2 value is changed and others remain unchanged");
		System.out.println("------------------------------------------------");
	}

}
