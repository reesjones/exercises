import java.io.*;
import java.io.IOException;

public class SumFile {
  
  public static int sumFile(String filename) throws IOException {
      int out = 0;
      BufferedReader br = new BufferedReader(new FileReader(filename));
      
      for(String line = br.readLine(); line != null; line = br.readLine()) {
        out += Integer.parseInt(line);
      }
      
      return out;
  }
  
  public static void main(String[] args) {
    
    try {
      System.out.println(sumFile("integers.txt"));
      // first 20 positive integers in integers.txt
      // should be n(n+1)/2 = 210
    }
    catch(Exception e) {}
  }
}
