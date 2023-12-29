import java.util.*;

public class randomnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;
        int score = 0;

        while (playAgain) {
            double rand = Math.random();
            int randno = (int) (rand * 100)+1;
            

            for (int i = 0; i < 5; i++) {
                System.out.println("Enter a number:");
                int usernumber = sc.nextInt();
                System.out.println("Entered number: " + usernumber);

                if (usernumber == randno) {
                    System.out.println("Correct number!");
                    score++;
                    break;
                } else if (usernumber < randno) {
                    System.out.println("Number is lower than the random number.");
                } else {
                    System.out.println("Number is higher than the random number.");
                }
            }

            System.out.println("Your score is " + score);

            System.out.println("Do you want to play again? (yes/no)");
            String playAgainInput = sc.next().toLowerCase();

            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
