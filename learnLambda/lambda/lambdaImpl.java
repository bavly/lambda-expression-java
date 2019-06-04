package lambda;

public class lambdaImpl {
	
	
	interface AddInterfaceOne1 {
		public int add(int a, int b);
	}
	
	interface MethodReference {
		void helloMethodReference();
		
	}

	public static void main(String[] args) {

		// here we will call the function
		// I will need to pull the change let is see what will happen
		
		// We must have curly braces if we are using the keyword 'return' in Lambda Expression.
		// Correct Syntax: AddInterfaceOne1 addInterfaceOne1 = (a, b) -> {return (a + b);}; 
		//OR don't use return in Lambda Expression Correct Syntax:
		// AddInterfaceOne1 addInterfaceOne1 = (a, b) -> (a + b);
		
		AddInterfaceOne1 addInterfaceOne1 = (a, b) -> {return  (a + b);};
		int sum =addInterfaceOne1.add(100, 200);
		System.out.println("sum of two numbers : "+sum);
		
		//We must use the return keyword if Lambda expression has multiple lines. 
		//we must have curly braces if Lambda expression has multiple lines or return keyword


		AddInterfaceOne1 addInterfaceOne11 = (a, b) -> {
			System.out.println("Adding two numbers");
			return (a + b);
		};
		
		int sum1 = addInterfaceOne11.add(100, 200);
		System.out.println("sum of two numbers : " + sum1);
		
		//We can't call a non static method with Class Name

		MethodReference methodReference = StaticMethodReferenceDemo::helloMethodReference;
		methodReference.helloMethodReference();
			
	
	}

	// That is a normal function
	public static int addTwoNumbersDiff(int a, int b) {
		return a + b;
	}

	// convert it to lambda
	// no need to access modifier
	// no need for return value

	// comment about how lambda work with in

	// another example
	// return is mandatory if we have multiple line in lambda expression
	
	// {} is mandatory if we have multiple line in lambda expression
	
	public static int helloMethodReference() {
		System.out.println("From helloMethodReference!");
		return 100;
	}

	
	lambdaInterface addTwoNumbers = (a, b) -> a + b;
	
	// No override nor implements just use lambda expression 
	// we can pass a method to another method (functional programming)

	// 
	DisplayInterface display = () -> System.out.println("hello Bavly");
	
	

}


