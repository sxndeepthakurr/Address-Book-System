import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("\n=================================");
            System.out.println("      ADDRESS BOOK SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Exit");

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
                    System.out.println("\nThank You!");
                    System.out.println("Exiting Address Book...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("\nInvalid Choice!");
            }
        }
    }
}