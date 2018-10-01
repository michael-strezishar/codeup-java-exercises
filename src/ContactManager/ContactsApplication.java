
package ContactManager;
import util.Input;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.nio.file.*;
import java.nio.file.Files;
import java.io.*;



public class ContactsApplication {
    private Scanner scan;


    public static void main(String[] args) {
        ContactsApplication check = new ContactsApplication();
        Contacts checker = new Contacts();
        check.scan = new Scanner(System.in);
        Input confirm = new Input();
//        Contacts contact;
//        contact = new Contacts();
//        int action = 0;
//        ArrayList<Contacts>contacts = new ArrayList<Contacts>();
//        while (action != 6) {
        while (true) {

            System.out.println("\nWelcome to the contact list" +
                    " what would you like to do? \n");

            System.out.println("1. View contacts." + "\n" +
                    "2. Add a new contact." + "\n" +
                    "3. Search a contact by name." + "\n" +
                    "4. Delete an existing contact." + "\n" +
                    "5. Exit." + "\n" +
                    "Enter an option (1, 2, 3, 4 or 5):");
            int response = check.scan.nextInt();
            System.out.println(response);
            switch (response) {
                case (1):
                    checker.getContacts();
                    break;
                case (2):
                    checker.addContacts();
                    break;
                case (3):
                    checker.searchContacts();
                    break;
                case (4):
                    checker.deleteContact();
                case (5):
                    checker.writeFile();
                    return;
                default:
                    System.out.println("Invalid entry! Try again");
            }
//            Scanner scan = new Scanner(System.in);
//            scan.useDelimiter("\n");
//            action = scan.nextInt();


//            if (action <= 0 || action > 6) {
//                System.out.println("Invalid Selection.");
//            }
//            switch (action){
//
//                case 1: {
//
//                   view ();
//                   break;

//                    case 2
//                    }
//                }
//            }
//        } while (confirm.yesNo());

        }
    }

}
