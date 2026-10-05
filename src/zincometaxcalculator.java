import java.util.Scanner;
public class zincometaxcalculator {
    public static void main(String[] args){
        System.out.println("enter you total income");
        try (Scanner SC = new Scanner(System.in)) {
            long income=SC.nextLong();
            long tax;
            if(income<500000){
                tax=0;
            }
            else if(income<500000 && income>=1000000){
                tax=(long) (income*0.2);
            }
            else{
             tax=(long) (income*0.3);
            }
            System.out.println("your income tax is = " + tax);
            System.out.println("lavdee tune jitni income likhi hena utne kma bhi payega gandu");
        }

    }
    
}
