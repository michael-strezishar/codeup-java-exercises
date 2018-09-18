import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f\n", pi);
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int numEnt = scanner.nextInt();
        System.out.format("You entered the number %d \n", numEnt);

//
        System.out.println("Please enter three words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.nextLine();
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

        System.out.println("Tell me a story in one sentence");
        String sentence = scanner.nextLine();
        System.out.println(sentence);
//
        System.out.println("Please enter the length:");
        int length = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Please enter the width:");
        int width = Integer.parseInt(scanner.nextLine());
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("The area of the classroom is " + area);
        System.out.println("The perimeter of the classroom is " + perimeter);
//        double width = scanner.nextInt();
//        int area = length *= width;
//        System.out.println(area);
//        double perimeter = 2 * length  + width * 2;
//        System.out.println(perimeter);
//        scanner.useDelimiter("\n");
    }



}
