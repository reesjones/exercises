public class MultiplicationTables {
  
  public static void multTables(int max) {
    for(int row = 1; row <= max; row++) {
      String newRow = "";
      for(int column = 1; column <= max; column++) {
        newRow += row*column + " ";
      }
      System.out.println(newRow);
      
    }
  }
  
  public static void main(String[] args) {
    multTables(3);
    System.out.println("===================================");
    
    multTables(12);
    System.out.println("===================================");
    
    multTables(18);
  }
  
}
