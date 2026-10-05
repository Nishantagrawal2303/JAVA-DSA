public class N02012023 {
    
     // binary AND &
     // binary OR |
      // binary XOR ^
      // binary ones complement ~
      // binary left shift <<
      // binary right shift >>
// checlk a number is odd or even 
   
   /*public static void oddOreven(int n){
      int bitmask=1;
      if((n & bitmask) == 0){
            System.out.println("even number");
      }else{
            System.out.println("odd number");
      }
   }
   public static void main(String[] args){
      oddOreven(3);
      oddOreven(11);
      oddOreven(20);

   }*/
     
      // get ith bit 

     /*  public static int getithBit(int n,int i){      // number aayega aur  jitna piche krna he AND nikalne ke liye vo i means position prr bit nikalini he
        int bitmask=1<<i;                                  //  AND operator LSB ki jgh ab i postion pr use hoga  
        if((n & bitmask)==0){           
         
         System.out.println("even number");
         return 0;
     }else{
      System.out.println("odd number");
      return 1;
     }
     }*/
        // ste ith bit   
     /*public static int setIthbit(int n, int i){ 
      int bitmask=1<<i;
      
         return n | bitmask;                       // isme or nikalnege 
      
     }*/
       
    /* public static int clearIthbit(int n,int i){
      int bitmask=~(1<<i);
      return n & bitmask; 
     }*/



      // clear last i bits 
     /*  public static int clearLastibits(int n,int i){
         int bitmask=(~0)<<i;                                        //isme bitmask jo he vo not of zero le lenge 
         return n & bitmask;                                        // yha pr n ho jayega 1111 or jb apn bitmask nikalenge to vo aayega 1100 aur in dono ka & 
      }
      
   public static void main(String[] args){
      //System.out.println(getithBit(10,2));
      //System.out.println(setIthbit(10,2));
     // System.out.println(clearIthbit(10,1));
     System.out.println(clearLastibits(15,2));
   }*/
            
   // clear range of bits 
  /* public static int clearRangebits(int n,int i,int j){
      int  a=((~0)<<j+1);                                            // a nikalne ke liye 
      int b= (1<<i)-1;                                              // b nikalne ke liye
      int bitmask=a | b;                                              // bitmask nikalne ke liye 
      return n & bitmask; 
   }  

   public static void main(String[] args){
      System.out.println(clearRangebits(10,2,4));
   }*/       
           
   
   // check if a number is power of two or not  
       /*  public static boolean IspowerofTwo(int n){
            return (n&(n-1))==0;
         }
public static void main(String[] args){
            System.out.println( IspowerofTwo(30));
           

         }*/


         /*public static int countsetBits(int n){
            int count = 0;
            while(n>0){
               if((n & 1) != 0){                    // check our LSB 

                  count++;            // agr 1 hoga LSB to count bhd jayega 
               }
               n=n>>1;                 // aur agr mhi hua to number ka LSB 1 aage ho jayega ho jayega  1010, fir 0101,fir 0010, fir 0001,fir 0000

            }
            return count;
         
         }
     
          public static void main(String[] args){
            System.out.println(countsetBits(15));
          }*/


           
  

           

          

            

          
 
           
          
            



























































          
     


   


} 

