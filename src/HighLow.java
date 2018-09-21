import java.util.Scanner;
public class HighLow {
    static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        playGame();

    }
        public static void playGame() {
            int randomNumber = (int) (Math.ceil(Math.random() * 100));

            int userGuess;
            do {
                System.out.println("Please guess a number between 1 and 100");
                userGuess = getInt(1, 100);
                if (userGuess < randomNumber) {
                    System.out.println("higher");
                } else if (userGuess > randomNumber) {
                    System.out.println("lower");
                }
            } while (userGuess != randomNumber);
            System.out.println("You guessed it! RIGHT ON!!!!");
            System.out.println("Do you want to play again? Press y for yes");
            String userAnswer = scan.next();
            if (userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
                playGame();
            } else {
                System.out.println("Goodbye");
            }
        }
        public static int getInt ( int min, int max){

            int userInt = scan.nextInt();
            if (userInt >= min && userInt <= max) {
                return userInt;
            } else {
                System.out.println("You sure that number is between " + min + " and " + max);
                return getInt(min, max);

            }
        }
    }
