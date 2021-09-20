/*
* Programmer: Miguel Villa Floran
* Date: 9/18/2021
* Course name: AP Computer Science A
* Section: Activity 1.1.4 Compound Assignment Operators
* Purpose/Assignment: CompoundOperators 
*/

public class CompoundOperators {
  public static void main(String[] args) {
    int numPeople = 0;
    double totalYears = 0;
    int totalDays = 0;
    
    totalYears += display("Miguel", 12.5); // I will soon be halfway through my senior year.
    totalDays += getDaysCompleted("Miguel", 12.5);
    numPeople++;

    totalYears += display("Brandon", 10.5); // I will soon be halfway through my sophmore year.
    totalDays += getDaysCompleted("Brandon", 10.5);
    numPeople++;

    totalYears += display("Pranav", 12.5); // I will soon be halfway through my senior year.
    totalDays += getDaysCompleted("Pranav", 12.5);
    numPeople++;

    totalYears += display("Alex", 12.5); // I will soon be halfway through my senior year.
    totalDays += getDaysCompleted("Alex", 12.5);
    numPeople++;

    getAverages(numPeople, totalYears, totalDays);
  } // main method

  public static String getYearName(double years) {
    int currentYear = (int) (years);
    if (currentYear < 9) {
      return "pre-secondary";
    }

    else if (currentYear > 12) {
      return "post-secondary";
    }
    else {
      switch (currentYear) {
        case 9:
          return "Freshman Year (high school)";
        case 10:
          return "Sophmore Year (high school)";
        case 11:
          return "Junior Year (high school)";
        case 12:
          return "Senior Year (high school)";
        default:
          return "Year Unknown";
        }
    }
  } // getYearName method

  public static int getDaysCompleted(String name, double years) {
    int daysInAYear = 185;
    int totalDays = (int) ((years * (double) daysInAYear) + 0.5);
    
    System.out.printf("%s has currently completed %d days of school \n\n", name, totalDays);
    return totalDays;
  } // getDaysCompleted method

  public static double display(String name, double years) {
		System.out.printf("Name: %s\n", name);
    System.out.printf("%s is currently in: %s\n", name, getYearName(years));
    return (years);
  } // display method

  public static void getAverages(int numPeople, double totalYears, int totalDays) {
    double averageYears = totalYears / numPeople;
    double averageDays = (double) totalDays / numPeople;
    System.out.printf("Average amount of years spent in school: %,.2f years\n", averageYears);
    System.out.printf("Average amount of days spent in school: %,.2f days\n", averageDays);
    System.out.printf("Total years spent in school: %,.2f years\n", totalYears);
    System.out.printf("Total days spent in school: %d days\n", totalDays);

  } // getAverages method
} // CompoundOperators class