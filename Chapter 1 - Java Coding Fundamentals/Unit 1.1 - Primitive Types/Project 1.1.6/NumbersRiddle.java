import java.util.Scanner;

public class NumbersRiddle {  
  public int evaluate() {
    Scanner input = new Scanner(System.in);
    System.out.print("\nEnter a Number: ");
    double startingNum = input.nextDouble();
    input.close();
    double finalNum = startingNum;
    System.out.printf("Starting number: %,.2f\n", finalNum);
    finalNum *= 2.0;
    System.out.printf("Number doubled: %,.2f\n", finalNum);
    finalNum += 6.0;
    System.out.printf("Number + 6: %,.2f\n", finalNum);
    finalNum /= 2.0;
    System.out.printf("Number halved: %,.2f\n", finalNum);
    finalNum -= startingNum;
    System.out.printf("Number - starting number: %,.2f\n", finalNum);
    return (int) (finalNum + .5); // narrowing go brrr
  } // main method
} // NumbersRiddle class