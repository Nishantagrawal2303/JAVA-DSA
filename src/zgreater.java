import java.util.Scanner;

// logical operator date 13/04/2023
public class zgreater{

    public static void main(String[] args) {
       /*  int A=9;
        int B=3;
         if(A>=B){
            System.out.println("A is largest of two"); System.out.println("ram");
        }
         else{
          System.out.println("b is largest of two"); System.out.println("ram");
         }  
         */
       // for two numbwr is even or odd 
         
       try (Scanner SC = new Scanner(System.in)) {
        int A=SC.nextInt();

           if(A%2==0){
               System.out.println("EVEN");
           }
           else{
            System.out.println("odd");
           }
    }
     
  
       /*   try (// ternarry operator for number is even or odd 
    Scanner SC = new Scanner(System.in)) {
        int A=SC.nextInt();
         String type=(A%2==0)?"EVEN":"ODD";
         String MARK=A>=33?"pass":"fail";
         System.out.println(type);
         System.out.println(MARK);
    }*/

    // switch statement

}

}