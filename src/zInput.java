import java.util.Scanner;


public class zInput {
    public static void main(String[] args){
        System.out.println("take input from the user");
         try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number");
            int a= sc.nextInt();
            System.out.println("Enter second number");
            int b= sc.nextInt();
            int sum =a+b;
            System.out.println(sum);
        }
        }
    

    }

    

