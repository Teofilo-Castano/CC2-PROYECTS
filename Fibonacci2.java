package fibonacci2;

import java.util.Scanner;
public class Fibonacci2 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Imput a number : ");
        int x = sc.nextInt();
        for (int i = 0; i < x+1; i++){
            System.out.print("f("+i+")\t");
        
        }
        System.out.println("");
        for(int i = 0; i <= x; i++){
            for(int z = 0; z < i+1; z++){
                System.out.print(fact(z) + "\t");
            }
            System.out.println("");
        }
    }
    public static int fact(int n){
        if(n <= 1)
            return n;
        else
            return (fact(n-1)) + (fact(n-2));
    }
}