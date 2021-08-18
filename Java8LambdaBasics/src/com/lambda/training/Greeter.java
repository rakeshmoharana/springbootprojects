package com.lambda.training;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	
	}
	
	public static void main(String args[]) {
		Greeter greeter = new Greeter();
		HelloWorldGreeting hellowWorldGreeting = new HelloWorldGreeting();		
		Greeting myLambdaFunction = () -> System.out.println("Print My Lambda");
		greeter.greet(myLambdaFunction );
		MyAdd myLambdaAddFunction = (int a, int b)-> a+b;
		
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Print Inner Class Greeing - Hello world");
			}
		};
		innerClassGreeting.perform();
		greeter.greet(innerClassGreeting);
	}
	
	
	
	
}

interface MyAdd{
	int addInt(int a, int b);
}

interface MyLambda {
	void foo();
}