import static java.lang.System.*;
import java.util.Scanner;

public class SafeSquareRoot {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String ready;

    out.print("Are you ready? (Type YES! if so): ");
    ready = keyboard.next();

    while (! ready.equals("YES!")) {
      out.println("I will wait until you are ready then. ");
      out.print("Are you ready yet? (Type YES! if so): ");
      ready = keyboard.next();
    }
    out.println("Great! Let's begin!");
    out.print("Give me a number, and I'll find it's square root. ");
    out.print("(No negatives, please.) ");
    x = keyboard.nextDouble();

    while (x < 0) {
      out.println("I won't take the square root of a negative.");
      out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    out.println("The square root of " + x + " is " + y);
  }
}
