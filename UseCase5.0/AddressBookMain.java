import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("\n=================================");
            System.out.println("      ADDRESS BOOK SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Contact(s)");
            System.out.println("2. Display Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("\nEnter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addContact(sc);
                    break;

                case 2:
                    addressBook.displayContacts();
                    break;

                case 3:
                    addressBook.editContact(sc);
                    break;

                case 4:
                    addressBook.deleteContact(sc);
                    break;

                case 5:
                    System.out.println("\nExiting Address Book. Goodbye!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("\nInvalid Choice! Please enter a valid option.");
            }
        }
    }
}
