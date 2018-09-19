import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        String input1;
        boolean havingAConversation = true;
        System.out.println("Talk to Bob");
        do {
            input1 = scanner.nextLine();
            if (input1.endsWith("?")) {
                System.out.println("Sure.");
            } else if (input1.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (input1.isEmpty()) {
                System.out.println("Fine. Be that way!");

            } else {
                System.out.println("Whatever.");
            }
        } while (havingAConversation);

    }
}
