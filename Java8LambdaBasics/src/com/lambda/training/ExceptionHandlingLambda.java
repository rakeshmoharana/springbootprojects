package com.lambda.training;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] someNumbers = { 1, 2, 3, 4 };
		int key = 0;
		process(someNumbers, key, (v, k) -> {
			try {
				System.out.println( v/k);
			} catch (ArithmeticException ae) {
				System.out.println("Arithmetic Exception");
			}
		});
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumetr) {
		for (int l : someNumbers) {
			consumetr.accept(l, key);
		}
	}

}
