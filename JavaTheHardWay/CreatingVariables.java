public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age, days;
    double seconds, e, checking, savings;
    String firstName, lastName, title, occupation, employer;

    x = 10;
    y = 400;
    age = 39;
    days = 30;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    savings = 5000.58;

    firstName = "Devin";
    lastName = "Cooper";
    title = "Mr.";
    occupation = "Developer";
    employer = "Oracle";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + " " + firstName + " " + lastName);
    System.out.println("I have $" + savings + " in savings.");
    System.out.println("I have been employed as a " + occupation + " at " + employer + " for " + days + " days.");
  }
}
