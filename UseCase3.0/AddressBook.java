import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    // UC 1 & UC 2: Add Contact
    public void addContact(Scanner sc) {
        System.out.println("\nEnter Contact Details");
        
        System.out.print("First Name : ");
        String firstName = sc.next();
        
        System.out.print("Last Name : ");
        String lastName = sc.next();

        sc.nextLine(); // Clear newline buffer

        System.out.print("Address : ");
        String address = sc.nextLine();

        System.out.print("City : ");
        String city = sc.nextLine();

        System.out.print("State : ");
        String state = sc.nextLine();

        System.out.print("Zip Code : ");
        int zip = sc.nextInt();

        System.out.print("Phone Number : ");
        long phoneNumber = sc.nextLong();

        sc.nextLine(); // Clear newline buffer

        System.out.print("Email : ");
        String email = sc.nextLine();

        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        contacts.add(contact);

        System.out.println("\nContact Added Successfully!");
    }

    // Display all contacts
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("\nNo Contacts Found.");
            return;
        }
        System.out.println("\n===== CONTACT LIST =====");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    // UC 3: Edit existing contact person using their name
    public void editContact(Scanner sc) {
        if (contacts.isEmpty()) {
            System.out.println("\nAddress Book is empty. Nothing to edit.");
            return;
        }

        System.out.print("\nEnter First Name of person to edit: ");
        String name = sc.next();

        boolean isFound = false;

        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                isFound = true;
                System.out.println("\nContact Found! Enter New Details:");

                System.out.print("Enter Last Name : ");
                contact.setLastName(sc.next());

                sc.nextLine(); // Clear newline buffer

                System.out.print("Enter Address : ");
                contact.setAddress(sc.nextLine());

                System.out.print("Enter City : ");
                contact.setCity(sc.nextLine());

                System.out.print("Enter State : ");
                contact.setState(sc.nextLine());

                System.out.print("Enter Zip Code : ");
                contact.setZip(sc.nextInt());

                System.out.print("Enter Phone Number : ");
                contact.setPhoneNumber(sc.nextLong());

                sc.nextLine(); // Clear newline buffer

                System.out.print("Enter Email : ");
                contact.setEmail(sc.nextLine());

                System.out.println("\nContact Updated Successfully!");
                break;
            }
        }

        if (!isFound) {
            System.out.println("\nContact with name '" + name + "' not found.");
        }
    }
}