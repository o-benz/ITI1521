
/*************************Question 4 LAB3 ********************************/

public class Accountant  {
  private double totalPrice = 0.0;

  public double getTotalPrice() {
    return totalPrice;
  }

  public void count(Book b){
    totalPrice += b.getPrice();
  }
}
