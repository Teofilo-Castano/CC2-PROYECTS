package javaapplication16;
import java.util.*;
public class JavaApplication16 {
    
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    System.out.print("Input # of columns : ");
    int rows = sc.nextInt();
    String result=""; //this variable is for the last line which print the result
    String[][] namez = new String[rows][];
        for (int i = 0; i < rows; i++) {
        System.out.print("Imput # of columns for row "+ i +": ");
      int columnCount = sc.nextInt();
      result=result+"Array " + i + " : ";
      namez[i] = new String[columnCount]; // init the curren row
      for(int j = 0; j < columnCount; j++)  {
          System.out.print("Row ["+ i +"]: column  [" + j + "] : ");
          namez [i][j] = sc.next();
          result=result+namez[i][j]+"  ";
          
     
     }
    
    }
            System.out.print(result);
    }
    
}
