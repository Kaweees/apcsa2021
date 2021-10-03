/*
* Programmer: Miguel Villa Floran
* Date: 9/9/2021
* Course name: AP Computer Science A
* Section: Activity 1.1.2 Variables and Data Types Statements
* Purpose/Assignment: Allowance 
*/

public class Allowance {
  public static void main(String args[]) {
    oldEnough("Gina", 16);
    oldEnough("Carl", 13);
    oldEnough("Jennifer", 3);
  } // main

  public static void oldEnough(String name, int age) {
    boolean isOldEnough = (age >= 8);
    double allowance = 0;
    if (isOldEnough) {
      allowance = 8.75;
    }
    System.out.printf("%s’s age is: %d\n", name, age);
		System.out.printf("Eligible for allowance?: %b\n", isOldEnough);
		System.out.printf("%s’s weekly allowance is: $%,.2f\n\n", name, allowance);
  }
} // Allowance class