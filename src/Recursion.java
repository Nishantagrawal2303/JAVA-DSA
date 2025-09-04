// recursion basics


//jay shree ram 
public class Recursion {

    public static void printDec(int n){
    
         if(n==1){
            System.out.println(1);              // yha prr agr n ki valie 1 ho gyi to 1 print ho jayeda ye to base case ki condition tk pohoch gya he mtlb
            return ;
         }
 

        System.out.print(n+" ");          // yha pr pehle n ki value print ho rhi he 
        printDec(n-1);                   // yha pr jo n ki value he usme -1 ho rha he   // function khud hi ko call kr rha he 
       
       
        // pehle to value aayegi to man lo 10 aayegi fir print ho jayegi fir niche jayegi fir 1 km ho jayegi fir print ho jayegi fir niche jaywgi 1 km hogi
        // fir print fir nichr km upr print fir km fir print kb tk hoga esa jbtk n ki value 1 nhi ho jati , jese hi one hogi 1 print ho jayega 
    } 
   }

  //  problem two 
   
    // print in increasing order 1 to  n 



     /*public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);                       // pehle number km hoga fir wapis function call hoga ese continue km hote jayegi value 
        System.out.print(n+" ");              // at last jb call ho jayegi to fir ek ek krke number n print hote jayega to 
     } 
    public static void main(String[] args){
        
        int n=10;
  
         printInc(n);

        }*/


        // factorial of a number 
       // problem 3  

        
  /*public static int fact(int n){

     if(n==0){
        return 1;
     }
    int fnnm1= fact(n-1);
    int fn=n * fact(n-1);
    return fn;
  }*/

  /* public static int Sum(int n){
      if(n==1){
        
         return n;
      }
      int Snm1=Sum(n-1);
      int sum=n+Snm1;
   return sum;
   }
 public static void main(String[] args){
  int n=5;

   // System.out.println(fact(n));
    System.out.println(Sum(n));
    
   }*/

   // problem 4 


   // fibonacii series 


   /*public static int fib(int n){
      if(n==0 || n==1){
         return n;
      }
      int fnm1=fib(n-1);
      int fnm2=fib(n-2);

      int fn=fnm1+fnm2;
      return fn;
   }
   public static void main(String[] args){
      int n=5;
      System.out.println(fib(n));
       
        
       }*/

       /*public static boolean isSorted(int arr[] , int i){
         if(i==arr.length-1){       // base case agr i last element tk pohoch gya check krte krte to return ho jayega true arr sorted he 
            return true;
         } 
         if(arr[i]>arr[i+1]){                       // yha prr check krr rhe he ki arr me pehla element baad wale se chota he  nho hoga to false return hoga 
            return false;                        
         }
        return  isSorted(arr , i+1);                               // aage wala array apne aap check ho jayega ki sort he ya nhi sort ho jayega 
       }

     public static void main(String[] args){
      int arr[]={1,2,3,8,4,5};
      
      System.out.println(isSorted(arr,0));
     }*/


      // problem 7 
      // findinga a key in a array
      
      

    /* public static int firstOccur(int arr[],int key ,int i){
      if(arr[i]==arr.length-1){                   //base case                 //arr ko shuru se check krenge key nhi mili aakhri tk to -1 return krenge 
         return -1;
      }
      if(arr[i]==key){                 //arr me key check krenge agr mili to i jo he index vo return krenge 
         return i;
      }
      return firstOccur(arr,key,i+1);            // isse aage ke liye check kernge 
     }

     public static void main(String[] args){
      int arr[]={1,2,3,4,5,7,8,9};
      int key=5;
      System.out.println(firstOccur(arr,key,0));
     
     }*/
    // last occurence of a key 

    /*  public static int lastOccur(int arr[],int key ,int i){
            
      
     
      }

      public static void main(String[] args){
      
     }*/
  
     
    /* public static int power(int x,int n){

       if(n==0){
         return 1;
       }
      int xnm1=power(x, n-1);
      int xn=x*xnm1;
      return xn;
     }

  public static void main(String[] args){
   System.out.println(power(2,10));
  }*/
 
    

    // recursion wapis krna pdega baad me 
   
    



    
    


