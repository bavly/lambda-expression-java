package lambda;



public class lambdaImpl {
	


	public static void main(String[] args) {
		

	}
	
	public static int addTwoNumbersDiff(int a, int b)
	{
		return a+b;
	}


	
	//convert it to lambda
	//no need to access modifier 
	// no need for return value
	
	lambdaInterface addTwoNumbers  = (a, b) ->  a+b;
	

}