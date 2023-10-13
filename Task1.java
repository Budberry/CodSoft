import java.util.Scanner;
public class Task1 {
    public static void guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int K = 5;

        int i, guess;

        System.out.println("A number is chosen between 1 to 100. Guess the number within "+ K +" trials.");
        
        for (i = 0; i < K; i++) {
            System.out.println("Guess the number:");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess && i != K - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }

        if (i == K) {
            System.out.println("You have exhausted " + K + " trials.");

            System.out.println("The number was " + number);

            System.out.println("1>Try Again");
            System.out.println("2>EXIT");
            int ch = sc.nextInt();

            if(ch==1){
                guessingNumberGame();
            }
            else if (ch==2) {
                System.out.println("Thanks for Playing");
            }
            else{
                System.out.println("Choose a valid option between 1 & 2");
            }
        }
    }

    public static void main(String[] args)
    {
        guessingNumberGame();
    }
}