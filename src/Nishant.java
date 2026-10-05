public class Nishant {
    public static void main(String[] args) {
       int n = 10;

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            
            int next = a + b;
            a = b;
            b = next;
        }
  
       }
       public static void rightRotate(int arr[]) {
    int n = arr.length;

    int last = arr[n - 1];

    // Shift elements right
    for (int i = n - 1; i > 0; i--) {
        arr[i] = arr[i - 1];
    }

    // Put last at first
    arr[0] = last;

    // Print array
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
}



//   // fact code 
//         int num=5;
//        int fact=1;

//        for(int i=1;i<=num;i++){
//         fact=fact*i;
//        }
//        System.out.print(fact);
         
        

     // prime code
        // boolean isPrime=true;
        // int num=3;
        // if(num<=1){
        //     isPrime =false;
        // }
        // for(int i=2;i<num;i++){
        //    if(num%i==0){
        //    isPrime =false;
        //    break;
        //    }
        // }

        // if(isPrime==false){
        //   System.out.print("number is not prime");
        // }else{
        //     System.out.println("number is prime");
        // }




    //  int n=5; 
 
    //  for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //     if (i==1|| j==1 || i==n || j==n ){
    //         System.out.print("*");
    //     }else{
    //         System.out.print(" ");
    //     }

    //     }
    //     System.out.println(" ");
    //  }



 // int arr[]={1,2,3,4,10};
        // int buyprice=Integer.MAX_VALUE;
        // int maxProfit=0;  //1

        // for(int i=0;i<arr.length;i++){
        //     if(buyprice>arr[i]){
        //         buyprice=arr[i];
        //     }else{
        //         int Profit=arr[i]- buyprice;
        //        maxProfit=Math.max(maxProfit,Profit);
        //     }
        // }
        // System.out.print(maxProfit);
    }
    







