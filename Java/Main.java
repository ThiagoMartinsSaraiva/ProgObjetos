import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Retangulo r = new Retangulo();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the width: ");
    float width = scan.nextFloat();
    r.setWidth(width); 
    System.out.println("Enter the height: ");
    float height = scan.nextFloat();
    r.setHeight(height);
    System.out.println("Width is: " + r.getWidth());
    System.out.println("Height is: " + r.getHeight());
    System.out.println("The area is: " + r.calculateArea(r.getWidth(), r.getHeight()));
    System.out.println("The perimeter is: " + r.calculatePerimeter(r.getWidth(), r.getHeight()));
    scan.close();
  }
}