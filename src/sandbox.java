//import util.Input;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.List;
//import java.util.ArrayList;
    public class sandbox {
        public static long fibonacci(int n){
            if (n <= 1) return n;
            else return fibonacci(n-1)+fibonacci(n-2);
        }

        public static void main(String[] args) {
            int n = Integer.parseInt(args[0]);
            for (int i = 1; i <= n; i++)
                System.out.println(i +": " + fibonacci(i));
        }
    }



//    public static void main(String[] args) {
//        Path newDirectory = Paths.get("./newDirectory");
//        Path fileName = Paths.get("./newDirectory", "newFile.txt");
//        System.out.println(path.toAbsolutePath());
//        Path file = Files.createFile(fileName);
//        List<String> lines = new ArrayList<>();
//        lines.add("Hello");
//        lines.add("Hallo");
//        lines.add("bonjour");
//        try {
//            if (Files.notExists(newDirectory))
//                Files.createDirectory(newDirectory);
//            if (Files.notExists(fileName)) {
//                lines = Files.readAllLines(fileName);
//                lines.add("");
//            }
//        } catch (IOException e){
//            System.out.println(e);
//        }
//            Files.createDirectory();
//            Path file = Files.createFile(fileName);
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }


//    public static void main(String[] args) {
//        int number = 8;
//        System.out.printf("The Number %s is great", number);
//        System.out.println();
//         blastOff(10);
//        System.out.println();
//        countUp(7);
//
//    }
//
//    public static int blastOff (int num){
//        if (num > 0 ){
//            System.out.println(num);
//            return blastOff(num-1);
//        } else {
//            System.out.println("blastoff");
//            return 0;
//            }
//        }
//
//        private static void countUp(int n){
//        if (n==1){
//            System.out.println(n);
//        } else {
//            int y = n -1;
//            countUp(y);
//            System.out.println(n);
//
//        }
//        }
//
//        boolean sleepIn(boolean weekday, boolean vacation){
//            return (!weekday || vacation);
//        }
//
//    public static void main(String[] args) {
//        System.out.println(sleepIn(weekday, vacation));
//    }
//
//        }



