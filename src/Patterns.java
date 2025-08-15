public class Patterns {
    public static void main(String[] args){
        //nested loop patterns
        
     
       /*  for(int line=1;line<=4;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        // inverted star pattern
        /*  long n=4;
        
        for(long i=1;i<=n;i++){
            
           for(long star=1;star<=n-i+1;star++){
            
            System.out.print("*");
            
           }
           System.out.println("");
        }*/

        //piramit of number

       /*  int k=4;
        for(int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
                System.out.print(number);
            }
            System.out.println();
        }*/
        int k=4;
        char ch='A';
        for(int line=1;line<=k;line++){
            for(int character=1;character<=line;character++){
                System.out.print(ch);
                ch++;
                
            }
            System.out.println();    
            
        } 


        


       }
    }
      

