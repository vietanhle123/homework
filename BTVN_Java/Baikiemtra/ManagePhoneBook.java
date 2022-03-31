package BTVN_Java.Baikiemtra;

import java.util.Scanner;

public class ManagePhoneBook {

  static PhoneBook pb = new PhoneBook();
  static Scanner scanner = new Scanner(System.in);
  static String name, phone;

  static void menu() {
    System.out.println("PHONEBOOK MANAGEMENT SYSTEM");
    System.out.println("1. Insert phone");
    System.out.println("2. Remove phone");
    System.out.println("3. Update phone");
    System.out.println("4. Search phone");
    System.out.println("5. Sort");
    System.out.println("6. Exit");
  }

  public static void main(String[] args) {
    menu();
    while (true) {
      System.out.print("Please choose an option: ");
      switch (scanner.nextInt()) {
        case 1:
          insertPhone();
          break;
        case 2:
          removePhone();
        case 3:
          updatePhone();
          break;
        case 4:
          searchPhone();
          break;
        case 5:
          sortPhone();
          break;
        case 6:
          return;
      }
    }
  }

  private static void removePhone() {
    scanner.nextLine();
    System.out.print("Input name of person you want to remove: ");
    name = scanner.nextLine();
    pb.removePhone(name);
  }

  private static void searchPhone() {
    scanner.nextLine();
    System.out.print("Please input name of person you want to search the phone: ");
    name = scanner.nextLine();
    pb.searchPhone(name);
  }

  private static void updatePhone() {
    boolean searched = false;
    scanner.nextLine();
    System.out.print("Input name of person you want to update: ");
    name = scanner.nextLine();
    for (String s : pb.PhoneList) {
      if (name.equals(s.substring(0, s.indexOf(",")))) {
        searched = true;
        System.out.print("Input phone number you want to update: ");
        phone = scanner.nextLine();
        pb.updatePhone(name, phone);
        break;
      }
    }
    if (!searched) System.out.println("Not found person with name is: " + name);
  }

  private static void sortPhone() {
    pb.sort();
  }

  private static void insertPhone() {
    scanner.nextLine();
    System.out.print("Input name: ");
    name = scanner.nextLine();
    System.out.print("Input phone: ");
    phone = scanner.nextLine();
    pb.insertPhone(name, phone);
  }


}
