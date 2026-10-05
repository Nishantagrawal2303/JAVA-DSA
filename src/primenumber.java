import java.util.Scanner;

public class primenumber {
    public static void main(String[] args){
        try (Scanner SC = new Scanner(System.in)) {
            int n=SC.nextInt();
            boolean isPrime=true;
            if(n==2){
                System.out.println("n is prime");
            }
            for(int i=2;i<n-1;i++){
            if(n%i==0)
            isPrime=false;
            }
   
   if(isPrime==true){
            System.out.println("n is prime");
   }else{
            System.out.println("n is not prime");
   }
        }
    
    }
    
}
