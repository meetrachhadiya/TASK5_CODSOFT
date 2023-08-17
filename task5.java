import java.util.List;
import java.util.Scanner;

import model.Contact;
import model.AddressBook;


public class task5 {
    private static Scanner scanner = new Scanner(System.in);
    private static AddressBook addressBook = new AddressBook();

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        int choice;

        do {
            System.out.println("\nAddress Book System Menu");
            System.out.println("1. Add a new contact");
            System.out.println("2. Search for a contact");
            System.out.println("3. Display all contacts");
            System.out.println("4. Remove a contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            switch (choice) {
                case 1:
                    addNewContact();
                    break;
                case 2:
                    searchContact();
                    break;
                case 3:
                    displayAllContacts();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    System.out.println("Exiting the Address Book System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void addNewContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter email address: ");
        String emailAddress = scanner.nextLine();

        // Add other relevant attributes if needed

        Contact newContact = new Contact(name, phoneNumber, emailAddress);
        addressBook.addContact(newContact);
        System.out.println("Contact added successfully.");
    }

    private static void searchContact() {
        System.out.print("Enter the name to search: ");
        String name = scanner.nextLine();

        Contact foundContact = addressBook.searchContact(name);

        if (foundContact != null) {
            System.out.println("Contact found: " + foundContact.toString());
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void displayAllContacts() {
        List<Contact> allContacts = addressBook.getAllContacts();
        if (allContacts.isEmpty()) {
            System.out.println("Address book is empty.");
        } else {
            System.out.println("All contacts in the address book:");
            for (Contact contact : allContacts) {
                System.out.println(contact.toString());
            }
        }
    }

    private static void removeContact() {
        System.out.print("Enter the name of the contact to remove: ");
        String name = scanner.nextLine();

        Contact contactToRemove = addressBook.searchContact(name);

        if (contactToRemove != null) {
            addressBook.removeContact(contactToRemove);
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }
}
 