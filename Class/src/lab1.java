import java.util.Scanner;
public class lab1 {
 private static final double PI = 3.14;
 private final double radius;
 public lab1 (double radius) {
 this.radius = radius;
 }
 public static void main(String[] args) {
 System.out.println("------------------------------------------------------------");
 System.out.println("CircleCalc v1.0");
 System.out.println();
 System.out.println("Calculates and prints information for a user-supplied radius");
 System.out.println("------------------------------------------------------------");
 System.out.print("Enter the circle's radius: ");
 Scanner in = new Scanner(System.in);

 double r = in.nextDouble();
 double A;
 A= PI*r*r;
 System.out.printf("Area of "+ r + " is " + A);
 System.out.printf("Just checking...");
 in.close();
 }
}