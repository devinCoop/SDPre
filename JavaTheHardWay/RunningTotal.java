import static java.lang.System.*;
import java.util.Scanner;

public class RunningTotal {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int current = 8675309, total = 0; // initialized current to compile while loop

    out.print("Type in a bunch of values and I'll add them up. ");
    out.println("I'll stop when you type a zero.");

    do/*while (current != 0)*/ {
      out.print("Value: ");
      current = keyboard.nextInt();
      total += current;
      if (current != 0)
      out.println("The total so far is: " + total);
    } while (current != 0); // delete while condition here and place at the beginning

    out.println("The final total is: " + total);
  }
}
