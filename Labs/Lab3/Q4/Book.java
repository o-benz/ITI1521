
/*************************Question 4 LAB3 ********************************/
public class Book {
  // Variables
  private String title, author;
  private double price ;
  private boolean fixedPrice = false;
  private Integer count=0;
// Le meme Accountant pour tous les livres (static)
  private static Accountant accountant = new Accountant();

 
  // Constructeurs
 
  public Book(String a, String t) {
    author = a;
    title = t;
  }

  public Book(String a, String t, double p) {
    author = a;
    title = t;
    setPrice(p);     
  }



  // Accesseurs
  public String getAuthor() {
    return author;
  }
  
public String getTitle() {
    return title;
  }

public double getPrice() {
    return price;
  }


// Modificateurs
  public void setAuthor(String sA) {
    author = sA;
  }

  public void setTitle(String sT) {
    title = sT;
  }

public void setPrice(double p) {
    if (fixedPrice ) {
      System.err.println("Price is fixed !");
    }
    else if (p >= 0.0) {
      price=p;
      fixedPrice=true;
      accountant.count(this);
    }
    else {
      System.err.println("Error : negative price !");
    }
  }

public static double getTotalPrice() {
    return accountant.getTotalPrice();
  }

 public void affiche() {
    System.out.print(toString());
  }

  public String toString() {
    return "Book[title=" + title + ", author=" + author + ", fixedPrice = " + fixedPrice + ", price = $" + price + "]";
  }
 
}



