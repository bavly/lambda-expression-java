package lambda;



public class lambdaImpl {
	


	public static void main(String[] args) {
		
		// here we will call the function
		// I will need to pull the change let is see what will happen
	}
	
	// That is a normal function 
	public static int addTwoNumbersDiff(int a, int b)
	{
		return a+b;
	}


	
	//convert it to lambda
	//no need to access modifier 
	// no need for return value
	
	//comment about how lambda work with in
	
	lambdaInterface addTwoNumbers  = (a, b) ->  a+b;
	

}
