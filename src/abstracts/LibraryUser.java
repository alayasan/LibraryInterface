package abstracts;

import interfaces.LibraryItem;

// Abstract LibraryUser class
public abstract class LibraryUser {
  protected LibraryItem[] borrowedItems = new LibraryItem[5];
  private int itemCount = 0;

  public void borrowItem(LibraryItem item) {
    if (itemCount < borrowedItems.length) {
      item.borrowItem();
      borrowedItems[itemCount] = item;
      itemCount++;
    }
  }

  public void returnItem(LibraryItem item) {
    for (int i = 0; i < itemCount; i++) {
      if (borrowedItems[i].equals(item)) {
        item.returnItem();
        borrowedItems[i] = null;
        itemCount--;
        break;
      }
    }
  }

  public abstract void printItemsBorrowed();
}
