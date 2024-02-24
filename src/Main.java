// Main class

import concretes.Book;
import concretes.Dvd;
import concretes.Student;
import concretes.Teacher;

public class Main {
  public static void main(String[] args) {
    // Create some library items
    Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
    Dvd dvd1 = new Dvd("The Shawshank Redemption", "Frank Darabont");

    // Create some library users
    Student student1 = new Student("Alice");
    Teacher teacher1 = new Teacher("Bob");

    // Borrow some items
    student1.borrowItem(book1);
    student1.borrowItem(book1);
    student1.borrowItem(book1);
    student1.borrowItem(book1);
    teacher1.borrowItem(dvd1);

    // Print borrowed items
    student1.printItemsBorrowed();
    teacher1.printItemsBorrowed();

    // Return some items
    student1.returnItem(book1);
    teacher1.returnItem(dvd1);

    // Print borrowed items again
    student1.printItemsBorrowed();
    teacher1.printItemsBorrowed();
  }
}