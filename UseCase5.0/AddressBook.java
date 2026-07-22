import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
    // Collection class storing multiple contact persons
    private ArrayList<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    // UC 5: Add multiple contact persons continuously
    public void addContact(Scanner sc) {
        char choice;
        do {
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

            // Create new contact and add it to the ArrayList collection
            Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
            contacts.add(contact);

            System.out.println("\nContact Added Successfully!");

            // Prompt to add another contact immediately
            System.out.print("\nDo you want to add another contact? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
    }

    // Display all contacts in the collection
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("\nNo Contacts Found.");
            return;
        }
        System.out.println("\n===== CONTACT LIST (" + contacts.size() + " Total) =====");
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

    // UC 4: Delete a person using person's name
    public void deleteContact(Scanner sc) {
        if (contacts.isEmpty()) {
            System.out.println("\nAddress Book is empty. Nothing to delete.");
            return;
        }

        System.out.print("\nEnter First Name of person to delete: ");
        String name = sc.next();

        boolean isFound = false;
        Iterator<Contact> iterator = contacts.iterator();

        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                iterator.remove();
                isFound = true;
                System.out.println("\nContact for '" + name + "' deleted successfully!");
                break;
            }
        }

        if (!isFound) {
            System.out.println("\nContact with name '" + name + "' not found.");
        }
    }
}