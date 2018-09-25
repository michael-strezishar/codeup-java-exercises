public class sandbox {
    public static void main(String[] args) {
        int number = 8;
        System.out.printf("The Number %s is great", number);
        System.out.println();
         blastOff(10);
        System.out.println();
        countUp(7);

    }

    public static int blastOff (int num){
        if (num > 0 ){
            System.out.println(num);
            return blastOff(num-1);
        } else {
            System.out.println("blastoff");
            return 0;
            }
        }

        private static void countUp(int n){
        if (n==1){
            System.out.println(n);
        } else {
            int y = n -1;
            countUp(y);
            System.out.println(n);

        }
        }

    }

