package ContactManager;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacts {
    private ArrayList<String> contactsFile;
    private String file;
    private String path;
    private Scanner scan;

    public Contacts() {
//        this.file = "/contacts.txt";
//        this.path = "/.src/ContactManager";
        this.contactsFile = new ArrayList<>();
        this.scan = new Scanner(System.in);
        this.contactsFile = loadContacts();
//        Path newFile = Paths.get("./src/ContactManager/contacts.txt");
    }

    public ArrayList loadContacts() {
        try {
            Path newFile = Paths.get("./src/ContactManager/contacts.txt");
//            Path contacts = Paths.get(this.path, this.file);
            List<String> conts = Files.readAllLines(newFile);
            for (int i = 0; i < conts.size(); i += 1) {
                this.contactsFile.add(conts.get(i));
            }
        } catch (Exception e) {
            System.out.println("Could not find contacts.txt file");
        }
        return this.contactsFile;
    }


    public void addContacts() {
        System.out.println("Enter the name and number of the contact you would like to add: ");
        String contact = scan.nextLine();
        contact.trim();
        contactsFile.add(contact);
    }

    public void getContacts() {
        for (String contact : this.contactsFile) {
            System.out.println(contact);
        }
    }

    public void searchContacts() {
        System.out.println("Enter the name of the contact you are searching for: ");
        String searchName = scan.nextLine();
        searchName.toLowerCase().trim();
        for (int i = 0; i < this.contactsFile.size(); i++) {
            String comp = this.contactsFile.get(i).toLowerCase();
            if (comp.equalsIgnoreCase(searchName) || comp.contains(searchName))
                System.out.println(comp);
        }
    }

    public void deleteContact() {
        System.out.println("Enter the name of the contact to delete: ");
        String deleted = scan.nextLine();
        deleted.trim().toLowerCase();
        for (int i = 0; i < this.contactsFile.size(); i++) {
            if (this.contactsFile.get(i).equalsIgnoreCase(deleted) || this.contactsFile.get(i).contains(deleted)) {
                this.contactsFile.remove(i);
            }
        }
    }
    public void writeFile() {
        ArrayList<String> contactAdd = this.contactsFile;
        try {
            Files.write(
                    Paths.get("./src/ContactManager/contacts.txt", "contacts.txt"),
                    contactAdd
            );
        } catch (Exception e) {
            System.out.println("Failed to add contact to contacts.txt file");
        }

        System.out.println("\nThanks.\nHave a nice day.");
    }

}
//    private String lastname, firstname, phone;

//    public static void main(String[] args) {

//        Path newDirectory = Paths.get("./ContactManager");
//        Path newFile = Paths.get("./src/ContactManager/contacts.txt");
//        if (Files.exists(newFile)) System.out.printf("File exists");
//        else System.out.println("No file found");
//
//
//        List<String> lines = new ArrayList<>();
//        try {
//            lines = Files.readAllLines(newFile);
//        } catch (IOException e) {
//            System.out.println("Something went wrong!");
//        }
//        System.out.println(lines);
//






//    }
//}
