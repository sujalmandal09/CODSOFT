// 1. Generate a random number within a specified range, such as 1 to 100.

// 2. Prompt the user to enter their guess for the generated number.

// 3. Compare the user's guess with the generated number and provide feedback on whether the guess
// is correct, too high, or too low.

// 4. Repeat steps 2 and 3 until the user guesses the correct number.

// You can incorporate additional details as follows:

// 5. Limit the number of attempts the user has to guess the number.
// 6. Add the option for multiple rounds, allowing the user to play again.
// 7. Display the user's score, which can be based on the number of attempts taken or rounds won.



import java.util.Random;
import java.util.Scanner;
public class numgme {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playagain = true;
        while (playagain) {
            int guessnum = rand.nextInt(100)+1;
            int tries = 0;
            int guess = 0;
            int Tot_chances = 10;
            System.out.println("Choose any number from 1 to 100, you have " + Tot_chances + " chances left" );

            while (guessnum != guess && tries < Tot_chances) {
                System.out.println("What's your guess?");
                guess = sc.nextInt();
                tries++;

                if (guess<guessnum){
                    System.out.println("Its higher");
                }else if(guess>guessnum){
                        System.out.println("It is lower");
                } else {
                    System.out.println("You have guessed the correct number within " + tries + "tries");                            
                    }
            }
            if (tries == Tot_chances && guess != guessnum){
                System.out.println("You have used your max attemps " + tries + " and the Actual number to guess was " + guessnum);
          
            }       
            System.out.print("Do you want to play again? (yes/no): ");
            String response = sc.next();
            playagain = response.equalsIgnoreCase("yes");
        }
        sc.close();
        System.out.println("The game has ended, Thanks for playing!");    
                

        

     
    }
}
