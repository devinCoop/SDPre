import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name;
    int age;
    double weight, income, gainedWeight;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Well thanks for answering my rude questions, ");
    System.out.println(name + ".");

    System.out.print("How much weight did you gain this year, " + name + "? ");
    gainedWeight = keyboard.nextDouble();
    System.out.println("Wow! You gained " + gainedWeight + "lbs this year? Tighten up!");
  }
}
/* No the code does not blow up if I write an integer where it expects a double.
   The code will not blow up if I put an integer or double where it expects a string
   because a number can be a string.
   If you put two or more keywords of different types with a space the program blows up
   with every question. Because it is an input mismatch.
*/
