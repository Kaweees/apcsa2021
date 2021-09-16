/*
* Programmer: Miguel Villa Floran
* Date: 9/9/2021
* Course name: AP Computer Science A
* Section: Activity 1.1.3 Expressions and Assignment Statements
* Purpose/Assignment: GalaxyWeight 
*/

import java.util.Scanner;

public class GalaxyWeight {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter weight: ");
    int weight = input.nextInt();

    double mercuryWeight = (double) weight * 3.59;
    double venusWeight = (double) weight * 8.87;
    double marsWeight = (double) weight * 3.711;
    double jupiterWeight = (double) weight * 24.79;    double saturnWeight = (double) weight * 11.08;    double uranusWeight = (double) weight * 10.67;    double neptuneWeight = (double) weight * 11.15;
    double totalWeight = mercuryWeight + venusWeight + marsWeight + jupiterWeight + saturnWeight + uranusWeight + neptuneWeight;
    double averageWeight = totalWeight / (double) 8;

    System.out.printf("Weight on Mercury: %,.2f lbs\n", mercuryWeight);
    System.out.printf("Weight on Venus: %,.2f lbs\n", venusWeight);
    System.out.printf("Weight on Mars: %,.2f lbs\n", marsWeight);
    System.out.printf("Weight on Jupiter: %,.2f lbs\n", jupiterWeight);
    System.out.printf("Weight on Saturn: %,.2f lbs\n", saturnWeight);
    System.out.printf("Weight on Uranus: %,.2f lbs\n", uranusWeight);
    System.out.printf("Weight on Neptune: %,.2f lbs\n", neptuneWeight);
    System.out.printf("Average weight: %,.2f lbs\n", averageWeight);
  } // main
} // GalaxyWeight class