package com.lambda.training;

public class TypeInferenceExample {
	public static void main(String args[]) {
StringLengthLambda sLLambda =  s -> s.length();
System.out.println(sLLambda.getLength("kjhkj"));
System.out.println(sLLambda.getLength("kjhkj"));
	}

	interface StringLengthLambda {
int getLength(String s);
	}
}
