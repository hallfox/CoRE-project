package scrabbleCalc;
import java.util.Scanner;

public class Word {
	String theword;
	public Word(String inputtedWord){ 
		theword = inputtedWord;
		
	}
	
	public static String getInput() { //actually understanding what the fuck this is doing, thanks to javadocs!
		Scanner sc = new Scanner(System.in); //and CoRE project too. Gave me a reason to actually understand this stuff
		boolean everythingisfine = true;
	    String input = sc.nextLine(); 
	    sc.close();
		//let's do some input santization! (everythingisfine is false if something is wrong
		if ((input.isEmpty()) || (input.length() > 15) ||(isLettersOnly(input) == false )) {
			everythingisfine = false;
		}
			
		if (everythingisfine == false){
			return "ERROR";
		}
		return input;
	}
	
	public static boolean isLettersOnly(String input) {
	    return input.matches("[a-zA-Z]+");
	}
	public static void main(String[] args) {

		String test;
		test = getInput();
		Word word1 =  new Word(test);
		System.out.println(word1.theword);
	}
	
}
