import java.util.*;


public class PrimeNumber {
	
	static Scanner userInput = new Scanner (System.in); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Value will be what will be checked if isPrime
		int value; 
		
		//Ask for userinput into value
		System.out.println("Enter in value to check if it is a prime number: ");
		//receive input
		value = userInput.nextInt(); 
		
		//Check to see if value is a big number
		if(value > 100){
			/*If value is a big number (larger than 100), check if value isPrime 
			 * by using the "isBigNumberPrime" boolean method
			 */
			if(isBigNumberPrime(value)== true)
			{
				System.out.println(value + " is a prime number!");
			}
			else
				System.out.println(value + " is not a prime number!");
		}else{
			if(isPrime(value)== true)
			{
				System.out.println(value + " is a prime number!");
			}
			else
				System.out.println(value + " is not a prime number!");
		}

	}
	
	// Boolean method that checks if value thats passed is a prime number
	public static Boolean isBigNumberPrime(int value) {
		// TODO Auto-generated method stub
		
		// If value is less than one, then value is not prime because 0 and 1 aren't prime numbers
		if(value <= 1)
		{
			return false;
		}
		
		/*
		 * If value is greater than 1, and since value is a "big number" (greater than 100),
		 * use a increasing checker to find what numbers are divisible to the squared value
		 * until checker is equal to the square root of value
		 */
		for(int checker = 2; checker <= Math.sqrt(value); checker++){
			
			//Output placed here to see the work done
			System.out.println("The remainder of " + value + " and "+ checker + " is: "+ (value % checker));
			
			/* Here is how to check if the value passed is a prime number
			 * 
			 * I.E. If the remainder of dividing problems between value and checker is 0
			 * 		then the value is not a prime number
			 */
			if(value % checker == 0)
				return false; 
		}
		return true; 
	}
	
	// Boolean method that checks if value thats passed is a prime number
	public static Boolean isPrime(int value) {
		
		// If value is less than one, then value is not prime because 0 and 1 aren't prime numbers
		if(value <= 1)
		{
			return false;
		}
		/*
		 * If value is greater than 1,
		 * use an increasing checker to find what numbers are divisible to the value
		 * until checker is equal to the square root of value
		 */
		for(int checker = 2; checker < value; checker++){
			/* Here is how to check if the value passed is a prime number
			 * 
			 * I.E. If the remainder of dividing problems between value and checker is 0
			 * 		then the value is not a prime number
			 */
			if(value % checker == 0)
				return false; 
		}
		return true; 
	}

}
