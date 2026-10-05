import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        System.out.println("enter the marks of student");
        int subject1,subject2,subject3;
        try (Scanner sc = new Scanner(System.in)) {
            {
             
             System.out.println("enter the marks of bio");
             subject1=sc.nextInt();
             System.out.println("enter the marks of physics");
             subject2=sc.nextInt();
             System.out.println("enter the marks of maths");
             subject3=sc.nextInt();
             
             float avrage=(subject1+subject2+subject3)/3f;
             System.out.println(avrage);
             if(avrage>=40 && subject1>=33 && subject2>=33 && subject3>=33){
             System.out.println("PASS");
              
             }else{
                System.out.println("FAIl");
             }
             

        }
    }
    
}
    }