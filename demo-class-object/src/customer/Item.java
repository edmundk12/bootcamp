package customer;

public class Item {
  private double price;
  private int quantity;
  private String name;

  public double getPrice() {
    return this.price;
  }
  public void setPrice(double price) {
    this.price = price;
  }

  public double getQuantity() {
    return this.quantity;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getName() {
    return this.name;
  }
  public void setName (String name) {
    this.name = name;
  }
}
