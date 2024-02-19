package ContactList;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("07 402 911 24");
    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\nEnter action :(show available actions) ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\n Shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContacts();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }


        }

    }

    public static void addNewContacts(){
        System.out.println("Enter new contact name : ");
        String name = scanner.nextLine();
        System.out.println("Enter the Phone number : ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added :  name = "+name+" , Phone = "+phone);
        }
        System.out.println("Cannot add "+name+" already on the file");
    }
    public static void updateContact(){
        System.out.println("Enter existing contact name : ");
        String name = scanner.nextLine();

    }


        public static void startPhone(){
        System.out.println("Starting phone......");
    }
    public static void printActions(){
        System.out.println("\nAvailable actions: press\n");
        System.out.println("0 - to shut down\n");
        System.out.println("1 - to print contacts\n");
        System.out.println("2 - to add new contacts\n");
        System.out.println("3 - to update an existing contact\n");
        System.out.println("4 - to remove an existing contact\n");
        System.out.println("5 - to query if an existing contact exist\n");
        System.out.println("6 - to print a list of valuable actions\n");
        System.out.println("\nprint your action \n");
    }
}