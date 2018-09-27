package grades;
import java.util.HashMap;
import util.Input;
public class GradesApplication {
    public static void main(String[] args) {
        Student newStudent = new Student ("Michael Strezishar");
        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();
        String userChoice;
        boolean finished = false;

        newStudent.addGrade(100);
        newStudent.addGrade(85);
        newStudent.addGrade(82);
        students.put("mstrez79", newStudent);

        newStudent = new Student ("Guy Incognito");
        newStudent.addGrade(80);
        newStudent.addGrade(72);
        newStudent.addGrade(66);
        students.put("GIncog56", newStudent);

        newStudent = new Student ("Joey Shabadoo");
        newStudent.addGrade(50);
        newStudent.addGrade(20);
        newStudent.addGrade(60);
        students.put("JoJoJr", newStudent);

        newStudent = new Student ("Max Power");
        newStudent.addGrade(100);
        newStudent.addGrade(99);
        newStudent.addGrade(94);
        students.put("namesoundsgood2", newStudent);

        System.out.println("Welcome!\n\nHere are the students Github user names:\n");

        String userNames = "";
        for(String userName : students.keySet()) {
            userNames += String.format("|%s| ", userName);
        }

        do {
            System.out.printf("%s\n\n", userNames);
            userChoice = input.getString("What student would you like to see more information on?\n\n> ");

            if(students.containsKey(userChoice)) {
                Student selectedStudent = students.get(userChoice);
                System.out.printf("Name: %s - Github Username: %s\nCurrent Average: %-3.1f\n",
                        selectedStudent.getName(), userChoice, selectedStudent.getGradeAverage());
            }
            else {
                System.out.printf("\nSorry, no student found with github username \"%s\"\n\n", userChoice);
            }

            finished = !input.getString("Would you like to see another student\n\n> ").toLowerCase().startsWith("y");

        } while(!finished);
    }
}





