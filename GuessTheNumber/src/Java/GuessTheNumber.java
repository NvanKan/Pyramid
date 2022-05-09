import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args){
        /* guess the number generates a number at random between 1-20,
        user gets 6 input attempts to guess number, to which sys outputs high or low
        if guessed correct, system announces attempt number and huzzah
         */
    Scanner userI = new Scanner(System.in);
    Random key = new Random();
    int round = 0;
    int bingo = key.nextInt(20)+1;
    int attempt = 0;
    String name = "";
    String replay = "y";

    System.out.println("Hello! What is your name?");
    name = userI.nextLine();
    System.out.println("Well, "+name+" I am thinking of a number between 1 and 20");
    // Now to get into the various options and the cycle they will create win, high or low
    while(replay.equals("y")){
        //Using the try to build a quick catch-all for incorrect input
        System.out.println("Take a guess");
        round++;
        try{attempt =Integer.parseInt(userI.next());}
        catch(Exception e){attempt = 0;}

        if(attempt <= 0 && round <6 || attempt>= 21 && round<6){
            round--;
            continue;
        }

        if(attempt>bingo && round<6){
            System.out.println("Your guess is too high.");}

        if(attempt<bingo && round<6){
            System.out.println("Your guess is too low.");}

        if(round==6 && attempt!=bingo) {
            System.out.println("Your midiclorian count is embarrassingly low... The correct answer was "+ bingo +
                    "\nYou'll never make it to the rank of Master Jedi at this rate");
            System.out.println("Would you like to play again? (y or n)");
            replay = userI.next();
            // even if user input is y, it is not catching continuing the loop
            round=0;
            bingo= key.nextInt(20)+1;
        }

        if(attempt==bingo){
            System.out.println("Good job, "+name+"! You guessed my number in "+round+" guesses!\n"+
                    "Would you like to play again? (y or n)");
            replay = userI.next();
            round=0;
            bingo= key.nextInt(20)+1;}
        }
    }
}

