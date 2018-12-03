package factorialfibonacci;
import java.util.Scanner;

public class Factorialfibonacci {

    public static void main(String[] args) {
       
        choice();
        
    }
    public static void choice(){
            Scanner sc = new Scanner (System.in);
           System.out.println ("what do you want to get? factorial\fibonacci?");
           
           String cho = sc.nextLine();
           while("fibonacci".equals(cho)&& !"factorial".equals(cho)){
               System.err.println ("Wrong input");
               System.out.println("What do you want to get? factorial\fibonacci");
               cho = sc.nextLine();
               
           }
               
              System.out.println("Enter sizer of array :");
              int size =sc.nextInt ();
              int[] array = new int [size];
              System.out.println("Enter elements :");
              for (int i = 0; i<array.length; i++){
                  int ele = sc.nextInt();
                  array[i] = ele;
              }
              if ("factorial".equals(cho)){
                  display (array, cho);
                          }else if("fibonacci" .equals (cho)){
                 display(array ,cho);
    }
                                  
              }
    public static int factorial (int f){
        int num = f, i = 1;
        int factorial = 1;
        while(i <= num)
        {
            factorial = i;
            i++;
        
        }
        return factorial;
    }
    public static int fibonacci (int f){
        if (f <= 1){
            return f;
            
        }else{
            return fibonacci (f-1)+ fibonacci (f-2);
        }
    }
    public static void display (int[] f ,String cho){
        for (int i = 0; i < f.length; i++){
        System.out.print("f("+f[i]+")\t");
    }
      System.out.println ("");
      for(int i = 0; i< f.length; i++){
          if ("fobonacci".equals (cho)){
              System.out.print (fibonacci(f [i]) + "\t");
          }else if ("factorial".equals (cho)){
              System.out.print(factorial (f[i])+ "\t");
          }
      }
      System.out.println ("");
        
    }

   
    }

    
    

    
              

                  
           
           
           
           
            


