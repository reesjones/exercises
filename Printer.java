public class Printer {
  public static void printOdds(int max) {
    for(int i = 1; i <= max; i += 2) {
      System.out.print(i + ", ");
    }
  }
  
  public static void main(String[] args) {
    printOdds(100);
    //printOdds(0);
    //printOdds(1);
  }
}
