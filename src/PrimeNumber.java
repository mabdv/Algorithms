import java.util.*;


public class PrimeNumber {
	
	static Scanner userInput = new Scanner (System.in); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value; 
		
		System.out.println("Enter in value to check if it is a prime number: ");
		value = userInput.nextInt(); 
		
		if(isPrime(value)== true)
		{
			System.out.println(value + " is a prime number!");
		}
		else
			System.out.println(value + " is not a prime number!");

	}

	public static Boolean isPrime(int value) {
		// TODO Auto-generated method stub
		
		if(value <= 1)
		{
			return false;
		}
		
		for(int checker = 2; checker < Math.sqrt(value); checker++){
			System.out.println(checker);
			if(value % checker == 0)
				return false; 
		}
		return true; 
	}

}
