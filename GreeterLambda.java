

public class GreeterLambda {

	interface GreetInterface {
		void greet();
	}


	//inflexible
	public void greet() {
		System.out.println("Hello world");
	}

	//inflexible
	//all behavior must be included inside the greet2() method
	public void greet2(int which) {
		
		switch (which) {
			case 0: System.out.println("Hello world 2 : 0"); break;
			default: System.out.println("Hello world 2 : default"); break;
		}
	}



	//flexible - behavior can be passed in via GreetInterface
	public void greet3(GreetInterface greet) {
		greet.greet();
	}

	public void greet4(GreetInterface greet) {
		greet.greet();
	}

	public static void main(String[] args) {

		GreeterLambda greeterLambda = new GreeterLambda();

		greeterLambda.greet();

		greeterLambda.greet2(0);

		greeterLambda.greet2(1);

		//on the fly
		greeterLambda.greet3(new GreetInterface() {
			public void greet() {
				System.out.println("GreetInterface does greet()");
			}
		});
		
		//on the fly
		greeterLambda.greet3(() -> { System.out.println("GreetInterface via lambda"); });
		
		//assined to a variable
		GreetInterface gi = () -> { System.out.println("GreetInterface assigned to variable"); };

		greeterLambda.greet3(gi);

		//assined to a variable
		GreetInterface gi2 = () ->  System.out.println("GreetInterface assigned to variable, no braces"); 
		greeterLambda.greet3(gi2);

	}

}
