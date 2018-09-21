import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println(input.getString("Enter a string: "));

        System.out.println(input.yesNo("Would you like to continue? [Y/N]:") ? "Yes" : "No");

        System.out.printf("You entered %d\n", input.getInt("Enter an integer: "));

        System.out.printf("You entered %.2f\n", input.getDouble("Enter a number: "));


    }
}
