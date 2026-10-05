import java.util.Scanner;
public class percentage {
    public static void main(String[] args){
        try (Scanner NIS = new Scanner(System.in)) {
            System.out.println("subject a mark");
            int a=NIS.nextInt();
            System.out.println("SUBJECT b MARK");
            int b=NIS.nextInt();
            System.out.println("subject c mark");
            int c=NIS.nextInt();
            System.out.println("SUBJECT d MARK");
            int d=NIS.nextInt();
            System.out.println("subject e");
            int e=NIS.nextInt();
            float Sum= (a+b+c+d+e)/5F;
            System.out.println("the percentage of the 5 subject is");
            System.out.println(Sum);
        }


    }
    
}
