public class Book {
  int numPages;

  public Book() {
    System.out.println("create a book");
  } // Book default constructor

  public Book(int p) {
    System.out.print("create a book with ");
    System.out.print(p);
    System.out.println(" pages");
  } // Book parameterized constructor
} // OrigamiCake class