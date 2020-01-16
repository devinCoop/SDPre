import static java.lang.System.*;
import java.util.Scanner;

public class PigDice {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int roll, ptot, ctot, turnTotal;
    String choice = "";

    ptot = 0;
    ctot = 0;

    do {
      turnTotal = 0;
      out.println("You have " + ptot + " points.");

      do {
        roll = 1 + (int)(Math.random()*6);
        out.println("\tYou rolled a " + roll + ".");
        if (roll == 1) {
          out.println("\tThat ends your turn.");
          turnTotal = 0;
        }
        else {
          turnTotal += roll;
          out.print("\tYou have " + turnTotal + " points");
          out.print(" so far this round.\n");
          out.print("\tWould you like to \"roll\" again");
          out.print(" or \"hold\"? ");
          choice = keyboard.next();
        }
      } while (roll != 1 && choice.equals("roll"));

      ptot += turnTotal;
      out.println("\tYou end the round with " + ptot + " points");

      if (ptot < 100) {
        turnTotal = 0;
        out.println("Computer has " + ctot + " points.");

        do {
          roll = 1 + (int)(Math.random()*6);
          out.println("\tComputer rolled a " + roll + ".");
          if (roll == 1) {
            out.println("\tThat ends its turn.");
            turnTotal = 0;
          }
          else {
            turnTotal += roll;
            out.print("\tComputer has " + turnTotal);
            out.print(" points so far this round.\n");
            if (turnTotal < 20) {
              out.println("\tComputer will roll again.");
            }
          }
        } while (roll != 1 && turnTotal < 20 && ctot + turnTotal < 100);

        ctot += turnTotal;
        out.print("\tComputer ends the round with ");
        out.print(ctot + " points.\n");
      }
    } while (ptot < 100 && ctot < 100);

    if (ptot > ctot) {
      out.println("Humanity wins!");
    }
    else {
      out.println("The computer wins.");
    }
  }
}
