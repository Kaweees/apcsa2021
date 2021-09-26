class NumbersRiddle {
  public int evaluate(int num) {
    double finalNum = (double) num;
    System.out.printf("\nStarting number: %,.2f\n", finalNum);
    finalNum *= 2;
    System.out.printf("Number doubled: %,.2f\n", finalNum);
    finalNum += 6;
    System.out.printf("Number + 6: %,.2f\n", finalNum);
    finalNum /= 2;
    System.out.printf("Number halved: %,.2f\n", finalNum);
    finalNum -= (double) num;
    System.out.printf("Number - starting number: %,.2f\n", finalNum);
    return (int) finalNum;
  } // evaluate method
} // NumbersRiddle class