import java.util.Scanner;

public class DragonsDen {
    public static void main(String[] args) {

        Scanner choose = new Scanner(System.in);

        System.out.println("You are in a land full of dragons.  In front of you,\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "and will share his treasure with you. The other dragon\n" +
                "is greedy and hungry and will eat you on sight.\n"
                + "Which cave will you go into? (1 or 2)");
        int cave = Integer.valueOf(choose.nextLine());
        // should be able to automatically swap input to integer to make things simpler?

        if (cave == 1) {
            System.out.println("You approach the cave...\n" +
                    "It is dark and spooky...\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                    "Gobbles you down in one bite!");
            // Bummer
        }
        if (cave == 2) {
            System.out.println("You approach the cave...\n" +
                    "It is dark and spooky...\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                    "Nearly deafens you with an ear splitting belch!\n" +
                    "He clacks his teeth lazily as he meanders off to curl up in a corner\n" +
                    "Not so much friendly as unbothered by the plight of small creatures\n" +
                    "You gather what treasure you can carry, and hope this luck keeps up on the return home.");
        }
        if (cave == 3) {
            System.out.println("Well look at you, always gotta check and see if theres a secret option\n" +
                    "Well here it is! Cave number 3! The one that shouldn't exist...\n" +
                    "Dark...Rocky...Yeah, pretty much empty, nothing of note\n" +
                    "Well, that's where curiosity gets you\n" +
                    "You head home empty handed, but alive...and hey now you know a secret!");
        }
    }
}
