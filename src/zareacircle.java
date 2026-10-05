import java.util.Scanner;

public class zareacircle {
    public static void main(String[] args){
        
System.out.println("please enter the value of radius");
try (Scanner SC = new Scanner(System.in)) {
    int R=SC.nextInt();
    
    float area=R*3.14F*R;
    System.out.println(area);
}
    }
    
}
