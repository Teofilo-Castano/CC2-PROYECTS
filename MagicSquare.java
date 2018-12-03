package magicsquare;

import java.util.*;

public class MagicSquare {


    public static void main(String[] args) {
        int[][] square = new int[3][3];
        
        Random rand = new Random();
        rand.nextInt();
        
        for(int i = 0; i<square.length;i++){
            square[i][i] = rand.nextInt();
            System.out.printf("%3s  ",square[i][i]);
        }
        
    }
    
}
