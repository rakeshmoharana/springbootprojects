package com.methodreferce.training;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printMessage();
Thread t = new Thread(()->printMessage());
Thread t2 = new Thread(MethodReferenceExample1::printMessage);//MethodReferenceExample1::printMessage === ()->printMessage()
	}
public static void printMessage() {
	System.out.println("Hello");
}
}
