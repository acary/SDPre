import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    // Prompt user to get input for all int vars
    System.out.println("Please enter the first whole number you would like to add.");
    num1 = keyboard.nextInt();
    System.out.println("Please enter the second whole number you would like to add.");
    num2 = keyboard.nextInt();
    System.out.println("Please enter the third whole number you would like to add.");
    num3 = keyboard.nextInt();

    // Prompt user to get input for all double vars
    System.out.println("Please enter the first decimal you would like to add.");
    dub1 = keyboard.nextDouble();
    System.out.println("Please enter the second decimal you would like to add.");
    dub2 = keyboard.nextDouble();
    System.out.println("Please enter the third decimal you would like to add.");
    dub3 = keyboard.nextDouble();

    // Print the three ints and their sum
    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));

    // Print the three doubles and their sum
    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + (dub1 + dub2 + dub3));

    keyboard.close();
  }
}
