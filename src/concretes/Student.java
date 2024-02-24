package concretes;

import abstracts.LibraryUser;
import interfaces.LibraryItem;

// Student class
public class Student extends LibraryUser {
  private String name;

  public Student(String name) {
    this.name = name;
  }

  public void printItemsBorrowed() {
    System.out.println("\n-----------------------------");
    System.out.println("Student: " + name);
    System.out.println("Borrowed Items:");
    for (LibraryItem item : borrowedItems) {
        if (item != null) {
            System.out.println(" - " + item);
        }
    }
    System.out.println("-----------------------------");
}
}
