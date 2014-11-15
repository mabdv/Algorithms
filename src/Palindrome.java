import java.util.*;

public class Palindrome {
	
	static Scanner userInput = new Scanner (System.in); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter in the word: ");
		String forwardWord = userInput.nextLine();
		
		System.out.println();
		
		char[] actualWord = forwardWord.toCharArray(); 
				
		if(isPalindrome(actualWord) == true){
			System.out.println("The word " + forwardWord + " is a palindrome.");
		}
		
		if(isPalindrome(actualWord) == false){
			System.out.println("The word " + forwardWord + " is not a palindrome.");
		}
		
		char[] backwardsWord = new char[actualWord.length]; 
		
		int i = 0; 
		for(int k = actualWord.length - 1; k >= 0; k--){
			
			backwardsWord[i] = actualWord[k];
			i++; 
		}
		System.out.print("See, that word would be: ");
		System.out.println(backwardsWord);

	}
	
	public static boolean isPalindrome(char[] word){
		int i = 0;
		int j = word.length - 1;
		
				while(j > i){
					if(word[i] != word[j]){
						return false;
						
					}	
					j--;
					i++;
				}
	
		return true; 
		
	}

}
