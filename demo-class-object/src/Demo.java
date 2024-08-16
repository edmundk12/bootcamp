public class Demo {
  public static void main(String[] args) {
    
    Cat cat = new Cat();
    cat.setName("John");
    System.out.println(cat.getName());
    cat.setColor("White");
    System.out.println(cat.getColor());
    cat.setAge(2);
    System.out.println(cat.getAge());

    Staff staff = new Staff();
    staff.setHeight(1.755);
    staff.setWeight(72.22);
    System.out.println(staff.getBMI());

    
  }
}
