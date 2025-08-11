import java.util.Scanner;

public class Loops{
    public static void main(String[] args){    
        /*  int counter=0;
         while(counter<10){

            System.out.println("ram");
            counter++;
                          
        }
    } */

   /*   int i=1;    // print 1 to 10
     while(i<=10){
        System.out.println(i);
        i++;
     }
      */

       // n natural number

      
    /*  try (Scanner SC = new Scanner(System.in)) {
      int i=0;
        int n= SC.nextInt();
        
        while(i<=n){
           System.out.println(i);
           i++;
        }
   }

    /*   try (// sum of n natural number
    Scanner SC = new Scanner(System.in)) {
        int n=SC.nextInt();
         int sum=0;
         int i=1;

         while(i<=n){
            sum=sum +i;
            i++;
         }
            System.out.println("sum is :"+ sum);
    }
     
    */
    
     /*  for(int i=1;i<=4;i++){
      System.out.println("****");
      
    } */

   // print reverse of a number
   
    /*  int n=13330;    
     
     while( n > 0){
      int lastdigit=n%10;
      System.out.print
      (lastdigit);
       n=n/10;
     }*/
     
    /*  int n=21098;
     int rev=0;
     while(n > 0){
      int lastdigit= n%10;
      System.out.print(lastdigit);
      rev = (rev * 10)+ lastdigit;
       n=n/10;
     }
     System.out.println(rev);
     */
    
     // break statment

    /*  for(int i=1;i<=5;i++){
       if(i==3){
         break;
       }
       System.out.println(i);
     }
      */

     try (/*  Scanner SC=new Scanner(System.in);
            
            do{
               int n=SC.nextInt();
      
               if(n%10==0){
                  break;
               }
              System.out.println(n);
            } while(true);
            
          } */
      Scanner SC = new Scanner(System.in)) {
         do{
          int n=SC.nextInt();

          if(n%10==0){
              continue;
             }
          System.out.println(n);
   } while(true);
      }

     
   } 
}