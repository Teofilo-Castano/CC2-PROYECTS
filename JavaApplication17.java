package javaapplication17;
import java.util.*;
public class JavaApplication17 {
    
    public static void main(String[] args) {
        int i, num;
       
        
        //CREANDO VECTOR
        int vector[]=new int[5];
        System.out.println("Creando vector");
        for (i=0;i<vector.length;i++){
        num=rm.nextInt(5);
        vector[i]=num;
        
        System.out.println("Imprimiendo vector");
        for (i=0;i<vector.length;i++){
             System.out.println(i+"=["+vector[i]+"]");
             
                 
            
        }
        System.out.println("vectro imprimido con exito");
        }
       
    }
    
}
