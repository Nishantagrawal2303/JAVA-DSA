import java.util.Scanner;
public class zcondition2 {
    public static void main(String[] args) {
        System.out.println("nishant");
        try (Scanner sc = new Scanner(System.in)) {
          
            int button=sc.nextInt();
            switch(button){
            case 1 :System.out.println("hello");
            break;
        
        
        
            case 2 :System.out.println("namaste");
            break;
            case 3 :System.out.println("ram");
            break;
            default : System.out.println("invalid button");
           }
        }
    }
}
