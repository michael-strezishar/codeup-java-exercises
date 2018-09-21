import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(sum(8, 9));
        System.out.println(sub(9, 6));
        System.out.println(mult(9, 9));
        System.out.println(div(81, 9));
        System.out.println(mod(81, 9));
        int userInput = getInteger(1, 109);
        System.out.println("your factorial is " + factorial(4));



    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int mod(int a, int b) {
        return b % a;
    }

    public static int getInteger() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int number = scanner.nextInt();
        return number;
    }

    public static int getInteger(int min, int max) {
        System.out.println("Enter a number between " + min + " and " + max);
        int number = getInteger();
        if (number >= min && number <= max) {
            return number;
        } else {
            System.out.println("This number is not between " + min + " and " + max);
            return getInteger(min, max);
        }


    }

    public static long factorial(int a) {
        long factorial = 1;

        while(a > 1){
            factorial *= a;
            a--;
        }
        return factorial;
    }


}


