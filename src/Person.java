import java.util.Scanner;
public class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello(){
        return String.format("Hello, my name is %s!", name);

    }

    public static void main(String[] args) {
        Person me = new Person("Mike");
        String newName = "Magic Mike and his Wonder Bike";
        System.out.printf("Testing Person getName() method: %s\n", me.getName());
        System.out.printf("Setting my name to %s...\n", newName);
        me.setName(newName);
        System.out.printf("Testing Person sayHello() method: %s\n", me.sayHello());
    }
//    exercise # 2 understanding references
//public static void main(String[] args) {
//
//    Person person1 = new Person("John");
//    Person person2 = new Person("John");
//    System.out.println(person1.getName().equals(person2.getName()));
//    System.out.println(person1 == person2);
//
//    Person person1 = new Person("John");
//    Person person2 = person1;
//    System.out.println(person1 == person2);
//
//    Person person1 = new Person("John");
//    Person person2 = person1;
//    System.out.println(person1.getName());
//    System.out.println(person2.getName());
//    person2.setName("Jane");
//    System.out.println(person1.getName());
//    System.out.println(person2.getName());
//
}









