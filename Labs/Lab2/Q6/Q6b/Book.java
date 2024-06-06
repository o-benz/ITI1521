public class Book {
  private String title, author;

  public Book(String a, String t) {
    author = a;
    title = t;
  }

  public String getAuthor() {
    return author;
  }
  
public String getTitle() {
    return title;
  }

  public void setAuthor(String sA) {
    author = sA;
  }

  public void setTitle(String sT) {
    title = sT;
  }
    public void affiche(){
    System.out.println("Book[title="+title+", author="+author+"]");
  }
  
   public String toString() 
   {
       String str = "Book[title="+title+", author="+author+"]";
       return str;
   }
  
}