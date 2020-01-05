import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double feet, inches, totalInches, pounds, bmi;

    System.out.print("Your height (feet only): ");
    feet = keyboard.nextDouble();

    System.out.print("Your height (inches): ");
    inches = keyboard.nextDouble();

    totalInches = (feet*12)+inches;

    System.out.print("Your weight in pounds: ");
    pounds = keyboard.nextDouble();

    bmi = 703 * pounds / (totalInches*totalInches);

    System.out.println("Your BMI is " + bmi);
  }
}
