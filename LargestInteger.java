public class LargestInteger {
  
  public static int largestInt(int[] array) {
    
    int largest = array[0];
    
    for(int i : array) {
      if(i > largest) {
        largest = i;
      }
    }
    
    return largest;
    
  }
  
  public static void main(String[] args) {
    int[] array1 = new int[85];
    for(int i = 0; i < 85; i++) {
      array1[i] = i;
    }
    int[] array2 = new int[2];
    array2[0] = -1;
    array2[1] = -8;
    
    System.out.println(largestInt(array1)); // 84
    
    System.out.println(largestInt(array2)); // -1
  }
}
