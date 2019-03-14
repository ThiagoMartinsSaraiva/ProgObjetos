import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Retangulo r = new Retangulo();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the width: ");
    r.width = scan.nextFloat();
    System.out.println("Enter the height: ");
    r.height = scan.nextFloat();
    System.out.println("Width is: " + r.width);
    System.out.println("Height is: " + r.height);
    System.out.println("The area is: " + r.calculateArea(r.width, r.height));
    System.out.println("The perimeter is: " + r.calculatePerimeter(r.width, r.height));
  }
}