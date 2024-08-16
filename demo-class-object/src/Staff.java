public class Staff {
  private double salary;
  private int id;
  private String firstName;
  private String lastName;
  private double height;
  private double weight;

  public Staff() {
    
  }

  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }
  public double getBMI() {
    return (this.weight/Math.pow(this.height, 2));
  }

  public void setHeight (double height) {
    this.height = height;
  }

  public void setWeight (double weight) {
    this.weight = weight;
  }
}
