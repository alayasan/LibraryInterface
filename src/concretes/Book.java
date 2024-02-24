package concretes;

import interfaces.LibraryItem;

// Book class
public class Book implements LibraryItem {
  private String title;
  private String author;
  private boolean borrowed;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.borrowed = false;
  }

  public void borrowItem() {
    borrowed = true;
  }

  public void returnItem() {
    borrowed = false;
  }

  public boolean isBorrowed() {
    return borrowed;
  }

  public String toString() {
    return "Book: " + title + " by " + author;
  }
}
