package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString() {

        String response;

        response = scanner.nextLine();
        return response;

    }
    public String getString(String prompt) {
        System.out.print(prompt);
        return getString();
    }

    public boolean yesNo() {
        String response;

        response = scanner.nextLine();
        return (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y"));
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        return yesNo();
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return getInt();
    }

    public int getInt() {
        String response = getString();

        try {
            return Integer.valueOf(response);

        } catch (NumberFormatException nfe) {
            System.out.println("Input must be an integer!");
            return getInt();
        }
    }


    public double getDouble() {
        String response = getString();
        try {
            return Double.valueOf(response);

        } catch (NumberFormatException nfe) {
            System.out.println("Input must be a number!");
            return getDouble();
        }
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        return getDouble();
    }
     public double getDouble(double min, double max){
        return getDouble(min , max);
     }


}
