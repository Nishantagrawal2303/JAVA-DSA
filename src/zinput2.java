import java.util.Scanner;

public class zinput2 {
    public static void main(String[] args){
        System.out.println("enter the number");
        try (Scanner add = new Scanner(System.in)) {
            System.out.println("enter first number");
            int a =add.nextInt();
            System.out.println("enetr second number");
            int b =add.nextInt();
            int substract=a-b;
            System.out.println(substract);
        }




    }
    
}
