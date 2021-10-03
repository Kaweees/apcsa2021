/*
* Programmer: Miguel Villa Floran & Alex Yam
* Date: 9/9/2021
* Course name: AP Computer Science A
* Section: Activity 1.1.5 Expressions and Assignment Statements
* Purpose/Assignment: FivePlanetTravel 
*/

public class FivePlanetTravel {
  public static void main(String[] args) {
    // theplanets.org average distance from earth to the planets
    int mercury = 56974146;
    int venus = 25724767;
    int mars = 48678219;
    int jupiter = 390674710;
    int saturn = 792248270;

    // number of planets to visit
    int numPlanets = 5;

    // speed of light and our speed
    int lightSpeed =  670616629;
    lightSpeed /= 10;
    
    /* Widening algorithm for mercury's travel time */
    System.out.println("Travel time to mercury: " + mercury / (double) lightSpeed + " hours.\n");

    /* Widening algorithm for venus's travel time */
    System.out.println("Travel time to venus: " + venus / (double) lightSpeed + " hours.\n");

    /* Widening algorithm for mars's travel time */
    System.out.println("Travel time to mars: " + mars / (double) lightSpeed + " hours.\n");

    /* Widening algorithm for jupiter's travel time */
    System.out.println("Travel time to jupiter: " + jupiter / (double) lightSpeed + " hours.\n");

    /* Widening algorithm for saturn's travel time */
    System.out.println("Travel time to saturn: " + saturn / (double) lightSpeed + " hours.\n");

    // total travel time
    double total = (mercury / (double) lightSpeed) + (venus / (double) lightSpeed) + (mars / (double) lightSpeed) + (jupiter / (double) lightSpeed) + (saturn / (double) lightSpeed);

    /* Average travel time */
    int average = (int) (total + .5) / numPlanets;
    System.out.print("Average travel time: " + average + " hours.");
  } // main
} // FivePlanetTravel class