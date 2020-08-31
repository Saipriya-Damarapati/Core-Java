package com.cglearning.tutorial_3;

public class A_ByteProgram {

	public static void main(String[] args) {
		System.out.println("Java is a statically typed language! "
				+ "If the data type of a language is known at the compile time, then it is called statically typed language");
		
		System.out.println("Byte is a primitive data type, "
				+ "it can store numbers between -127 to 128");
		System.out.println("Default Size: 1");
		System.out.println("Default value: 0");
		
		byte num;
		num = 113;
		
		System.out.println("Value stored in byte is " + num);
		
		//byte num1 = 135;
		System.out.println("If a byte data type holds value > 128, "
				+ "then it raises compilation error - type mismatch error");
	}

}
