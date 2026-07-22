import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Scanner sc) {
        System.out.println("\nEnter Contact Details");
        System.out.print("First Name : ");
        String firstName = sc.next();
        System.out.print("Last Name : ");
        String lastName = sc.next();

        sc.nextLine();

        System.out.print("Address : ");
        String address = sc.nextLine();

        System.out.print("City : ");
        String city = sc.nextLine();

        System.out.print("State : ");
        String state = sc.nextLine();

        System.out.print("Zip : ");
        String zip = sc.nextLine();

        System.out.print("Phone Number : ");
        String phone = sc.nextLine();

        System.out.print("Email : ");
        String email = sc.nextLine();

        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phone, email);
        contacts.add(contact);

        System.out.println("\nContact Added Successfully!");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("\nNo Contacts Found.");
            return;
        }
        System.out.println("\n===== CONTACT LIST =====");

        for (Contact contact : contacts) {
            contact.displayContact();
        }
    }
}