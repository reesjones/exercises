import java.lang.IllegalArgumentException;

public class Fibonacci {
  public static int getFibonacci(int n) throws IllegalArgumentException {
    
    int out = 0;
    
    if(n < 0) {
      throw new IllegalArgumentException();
    }
    if(n == 0) {
      return 0;
    }
    if(n == 1) {
      return 1;
    }
    
    out = getFibonacci(n-1) + getFibonacci(n-2);
    
    return out;
  }
  
  public static void main(String[] args) {
    
    // Index: 0 1 2 3 4 5 6 7  ... 16 ...
    // Num:   0 1 1 2 3 5 8 13 ... 987...
    
    System.out.println(getFibonacci(0));  // 0
    //System.out.println(getFibonacci(-1)); // IllegalArgumentException
    System.out.println(getFibonacci(1));  // 1
    System.out.println(getFibonacci(2));  // 1
    System.out.println(getFibonacci(3));  // 2
    System.out.println(getFibonacci(16)); // 987
  }
}
