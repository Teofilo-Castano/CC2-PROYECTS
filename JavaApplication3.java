package javaApplication3;

import java.util.Scanner;
public class JavaApplication3 {
    
     public static void main(String[] args) {
     Scanner cs = new Scanner(System.in);
     
         System.out.println("Course : \n"
                 + "[1] BSIT \n"
                 + "[2] BSIT \n"
                 + "[3] BSDA ");
         String gen = cs.nextLine();
         if(("bsit".equalsIgnoreCase(gen)) || ("it".equalsIgnoreCase(gen))){
             System.out.print("Major (Enter number): \n"
                     + "[1] Network and Security \n"
                     + "[2] Web Developement \n"
                     + "[3] Enterprise Resource Planning");
             String game = cs.nextLine();
             System.out.print("Your course is Bachelor of Science in Information Tecnology");
             if (game.equalsIgnoreCase("1")){
                 System.out.println("Your major is : Network and Security");
             }else if (game.equalsIgnoreCase("2")){
                  System.out.println("Your major is : Web Developement");
             }else if (game.equalsIgnoreCase("3"))
                 System.out.println("Your major is : Enterprise Resource Planning");
         
         }else if (("2".equalsIgnoreCase(gen)) || ("bscs".equalsIgnoreCase(gen))){
             System.out.println("Majors (Enter number) : \n"
                     + "[1] Mobile Development \n"
                     + "[2] Digital Arts and Animation");
             String game = cs.nextLine();
             System.out.println("Your Course is Bachelor of Science in Computer Cience");
             if (game.equalsIgnoreCase("1")){
                 System.out.println("Your major is : Mobile Development");
             }else if (game.equalsIgnoreCase("2")){
                  System.out.println("Your major is : Digital Arts and Animation");
             }   
         }else if(("3".equals(gen)) || ("bsda".equalsIgnoreCase(gen))){
              System.out.println("Your Course is Bachelor Science in Computer Cience");
                 
                 
                 
             }
             
             
         
     }
         
   
        
    }
    

