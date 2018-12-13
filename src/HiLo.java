import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {

		//Pulls input from the user's keyboard//
		Scanner scan = new Scanner(System.in);

		//Creates a variable to store whether the player wishes to play again or not// 
		String playAgain = "";

		do{
			//Create the number for the user to guess//
			int theNumber = (int)(Math.random() * 200 - 100);
			//System.out.println(theNumber);//

			//Declare and initialise variable 'guess' to store user's guess//
			int guess = 0; 
			
			//Keeps a track of guesses//
			int attempt = 0; 

			//Creates a loop that will continue until the user guesses the number correctly// 
			while (guess != theNumber) {
				
				//Gives the user instructions.//
				System.out.println("Guess a number from -100 to 100:");
				
				//Assigns user's guess to the guess variable// 
				guess = scan.nextInt();
				
				//Keeps a track of the number of user attempts//
				attempt = attempt + 1; 
				
				//Lets the user know what they have input// 
				System.out.println("You entered " + guess + ".");
				
				//If the guess is less than the number, informs user//
				if (guess < theNumber) 
					System.out.println(guess + " is too low, try again!");
					
				//If the guess is higher than the number, informs user//
				else if (guess > theNumber) 
					System.out.println(guess + " is too high, try again!");
				
				//If the guess matches the number, informs user//

				else 
					System.out.println("Great job, you guessed " + guess + ", which is correct! "
							+ "It took you " + attempt + " guesses to win!");
			}

			//Resets attempt counter.//
			attempt = 0;
			
			//Asks user if they want to play another game// 
			System.out.println("Would you like to play again? Y / N:");
			playAgain = scan.next(); 

		} while (playAgain.equalsIgnoreCase("y"));
		
		System.out.println("Thank you for playing!");
		scan.close();
	}

}
