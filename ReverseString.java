public class ReverseString {
  public static String reverseString(String in) {
    /* Pointer for the next character to add to the out string
     * out string
     */
    String out = "";

    
    for(int k = in.length()-1; k >= 0; k--) {
      out += in.charAt(k);
    }
    
    return out;
  }
  
  public static void main(String[] args) {
    System.out.println(reverseString("PanaMa"));
    // aManaP
    
    System.out.println(reverseString("banana"));
    // ananab
  }
}
