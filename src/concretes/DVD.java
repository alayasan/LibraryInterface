package concretes;

import interfaces.LibraryItem;

// DVD class
public class DVD implements LibraryItem {
  private String title;
  private String director;
  private boolean borrowed;

  public DVD(String title, String director) {
    this.title = title;
    this.director = director;
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
    return "DVD: " + title + " directed by " + director;
  }
}
