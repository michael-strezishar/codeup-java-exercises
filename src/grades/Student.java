package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        for (double grade : this.grades){
            total += grade;
        }
        return total / this.grades.size();
    }

    public static void main(String[] args) {
        Student michael = new Student("Michael Strezishar");
        michael.addGrade(100);
        michael.addGrade(85);
        michael.addGrade(82);
        System.out.println(michael.getName());
        System.out.println(michael.getGradeAverage());
    }


}
