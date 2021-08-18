package com.lambda.training;

public class ClosuresExamples1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 10;
int b = 20;
doProcess(a, j->System.out.println(j+b));

	}
	
	public static void doProcess(int i,Process p) {
		p.process(0);
	}
	
	interface Process{
		void process(int i);
	}

}
