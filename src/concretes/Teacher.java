package concretes;

import abstracts.LibraryUser;
import interfaces.LibraryItem;

// Teacher class
public class Teacher extends LibraryUser {
  private String name;

  public Teacher(String name) {
    this.name = name;
  }

  public void printItemsBorrowed() {
    System.out.println("\n-----------------------------");
    System.out.println("Teacher: " + name);
    System.out.println("Borrowed Items:");
    for (LibraryItem item : borrowedItems) {
      if (item != null) {
        System.out.println(" - " + item);
      }
    }
    System.out.println("-----------------------------");
  }
}
