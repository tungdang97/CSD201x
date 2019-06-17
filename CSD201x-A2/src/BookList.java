
import com.entity.Book;
import com.util.MyList;
import com.util.Node;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tiny
 */
public class BookList {

  // A list of book
  private MyList books;

  public MyList getBooks() {
    return books;
  }

  public BookList() {
    books = new MyList();
  }

  // Accept information of a Book
  private Book getBook() {
    throw new UnsupportedOperationException("Remove this line and implement your code here!");
  }

  // Accept and add a new Book to the end of book list
  public void addLast(Book b) {
    books.addLast(b);
  }

  // Output information of book list
  public void list() {
    if (books.isEmpty()) {
      System.err.println("Books list is empty...");
    } else {
      books.traverse();
    }
  }

  // Search book by book code
  public void search(String bCode) {
    Node<Book> book = books.search(bCode);
    if (book == null) {
      System.err.println(bCode + " is not exist...");
    } else {
      System.out.println("Infomation of book code " + bCode);
      System.out.println(book.info.toString());
    }
  }

  // Accept and add a new Book to the begining of book list
  public void addFirst(Book b) {
    books.addFirst(b);
  }

  // Add a new Book after a position k
  public void addAfter(Book b, int k) {
    books.addAfter(b, k);
  }

  // Delete a Book at position k
  public void deleteAt() {
    throw new UnsupportedOperationException("Remove this line and implement your code here!");
  }

  public boolean checkBCode(String bCode) {
    return books.checkBCode(bCode);
  }
}
