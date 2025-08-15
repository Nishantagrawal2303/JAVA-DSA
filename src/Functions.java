//import java.util.*;
public class Functions {
    
    
        //function method
      /*    public static void printhelloworld() {
            for(int i=1;i<=3;i++)
            System.out.println("hello world");
        }
        // parameter in function or parameter passing
        public static void main(String[] args){
        printhelloworld();
        }*/
            
      /*   public static int calculatingsum(int num1,int num2){ // parameter or formal parameter
            int sum=num1+num2;
            System.out.println("sum is =" + sum);
            return sum;
        }
        public static void main(String[] args){
        try (Scanner SC = new Scanner(System.in)) {
            int a=SC.nextInt();
            int b=SC.nextInt();
            calculatingsum(a,b); //arguments or actual parameter 
        }
    }*/
    
      // swapping the values
     /*  public static void wapping(int  A, int B){
        int temp=A;
        A=B;
        B=temp;

        System.out.println("A is " + A);
        System.out.println("B is " + B);
    
      }
      public static void main(String[] args){

      int a=5;
      int b=10;
      wapping(a,b);
    }*/

    // product of two value by parameter passing
    /*public static int multiply(int num1,int num2){
      int product=num1*num2;
      return product;

    }
    public static void main(String[] args){
      int a=5;
      int b=5;
      multiply(a,b);
     int prod=a*b;
     System.out.println(prod);
     prod=multiply(10,20);
     System.out.println(prod);
    }*/

    //factorial of a number
   /*  public static int factorial(int n){
      int f=1;
      for(int i=1;i<=n;i++){
        f=f*i;
      }
        return f;
      }
     /*  public static void main(String[] args){

      System.out.println(factorial(6));
      }*/

    /*   public static int binomial(int n,int r){
      int fact_n=factorial(n);
      int fact_r=factorial(r);
      int fact_nmr= factorial(n-r);

      int binocoff= fact_n/(fact_r*fact_nmr);

      return binocoff;
      
     }
     public static void main(String[] args){
      System.out.println(binomial(5,2));
     } */

     //function overloading using data types
    /*  public static int sum(int a,int b){
      return a+b;
     }
     public static float sum(float a,float b){
      return a+b;
     }

     public static void main(String[] args){
      System.out.println(sum(2,5));
      System.out.println(sum(2.5f ,2.6f));
     }*/
     
    /*  public static boolean isPrime(int n){
      
      boolean  isPrime=true;
      if(n<=2){
       return isPrime;
      }
      for(int i=2;i<=n-1;i++){
      if(n%2==0){
        isPrime=false;
      }
    }
      return isPrime;
      
     }
     public static void main(String[] args){
      System.out.println(isPrime(20));

     }*/

     //optimized approach for prime number
     
    /*   public static boolean isprime(int n){
        if(n==2){
          return true;
        }
      for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
          return false;
        }
      }
      return true;
     }*/
     /*public static void main(String[] args){
      System.out.println(isprime(9));
     }*/

    // print all primes in a range 


   /*  public static boolean isprime(int n){
      if(n==2){
        return true;
      }
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
   }

    public static void primesInrange(int n){
     for(int i=2;i<=n;i++){
      if(isprime(i)){
      System.out.print(i+" ");
      }
     }
     System.out.println();
  
}
    public static void main(String[] args){
     primesInrange(20);
      
    }*/

   // convert binary to decimal 
   
    
   /*public static void binTodec(int binNum){
    int myNum=binNum;
    int pow=0;
    int decNum=0;
    while(binNum>0){
      int lastdigit=binNum%10;
      decNum=decNum+(lastdigit*(int)Math.pow(2,pow));
      pow++;
      binNum=binNum/10;
    }
    System.out.println("decimal of "+ myNum +"="+ decNum);
   
   }

   public static void main(String[] args){
    binTodec(101);
   }*/

   //conert decimal to binary
   
   /*public static void binTodec(int n){
   int  myNum=n;
    int pow=0;
    int binNum=0;
    while(n>0){
      int rem=n%2;
      binNum=binNum+(rem*(int)Math.pow(10,pow));
      pow++;
      n=n/2;
    }
    System.out.println("binaray form of"+ myNum +"=" + binNum);
   }
     public static void main(String[] args){
      Scanner SC=new Scanner(System.in);
      int n=SC.nextInt();
           binTodec(n);
     }*/
      
      
    
       
     
     


   
  }

  

  


