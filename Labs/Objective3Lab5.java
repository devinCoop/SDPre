import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double x, y, sum;

    System.out.println("Please enter a number:");
    x = input.nextDouble();

    System.out.println("Please enter another number:");
    y = input.nextDouble();

    sum = x + y;

    System.out.println("The sum of " + x + " + " + y + " = " + sum);

  }
}
