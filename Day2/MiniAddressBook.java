package Day2;

import java.util.Scanner;

public class MiniAddressBook {
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] names = new String[5]; 
        String[] phones = new String[5];
        int count = 0;
        while (true) {
            System.out.println("1) Add a contact");
            System.out.println("2) Search a contact");
           System.out.println("3) List the contacts");
            System.out.println("4) Exit addressbook");
            System.out.print("Enter an option: ");
            int choice = s.nextInt();
            s.nextLine(); 
            if (choice == 1) {
                if (count < names.length) {
                    System.out.print("Name of the person: ");
                    names[count] = s.nextLine();
                    System.out.print("Phone no: ");
                   phones[count] = s.nextLine();
                    count++;
                } else {
                    System.out.println("Address Book Full");
                }
            } else if (choice == 2) {
                System.out.print("Search name: ");
                String searchName = s.nextLine();
                for (int i = 0; i < count; i++) {
                   if (names[i].equalsIgnoreCase(searchName)) {
                        System.out.println("Found: " + names[i] + " - " + phones[i]);
                        break;
                    }
               }
            } else if (choice == 3) {
                for (int i = 0; i < count; i++) {
                    System.out.println(names[i] + " - " + phones[i]);
                }
            } else if (choice == 4) {
                System.out.println("Exited the addressbook");
                s.close();
                return;
            } else {
               System.out.println("Invalid");
          }
        }
  }
}