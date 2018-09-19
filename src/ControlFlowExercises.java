import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
        int x = 100;
        do {
            System.out.println(x);
            x -= 5;
        } while (x>=-10);

        long h = 2;
//        do {
//            System.out.println(h);
//            h *= h;
//        } while (h<1000000);

        for (long k=2; k<1000000; k*=k){
            System.out.println(k);
        }
        for (int k=100; k>=-10; k-=5){
            System.out.println(k);
        }
        for (int j = 1; j<100; j++){
            if (j % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (j % 5 == 0) {
                System.out.println("Buzz");
            } else if (j % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(j);
            }
            }
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input a integer");
//
//            int int1 = scanner.nextInt();
//
//            while (int1 < 100){
//                int1 += 2;
//            }
//        System.out.println(int1);

        System.out.println("What number would you like to go up to?");
        int integerNext = scanner.nextInt();
        {
//            int int2 = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println("Number"  + " " + "Squared" + " " + "Cubed");

            for (int j = 1; j <= integerNext; j++) {

                int intsq = (int) Math.pow(j, 2);
                int intcub = (int) Math.pow (j, 3);


                System.out.println(j + "|" + intsq + "|" + intcub);
//                System.out.format("%-10s | %10s | %10s", j, intsq, intcub );


            }
        }
        System.out.println("Please enter your grade");
        int grade = scanner.nextInt();
        char letterGrade;
        if (grade > 59 && grade <= 66){
            System.out.println("A");
        } else if (grade <= 87){
            System.out.println("B");
        }




    }

}


