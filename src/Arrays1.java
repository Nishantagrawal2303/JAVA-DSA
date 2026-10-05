
class Main {
    public static void pattern(int n){

    for(int i=1;i<=n;i++){
   
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }

        for(int k=(i-1);k>=1;k--){
            System.out.print(k);
        }
        
      System.out.println();
}

}


    // {5,15,1,3};
    public static void buysellstocks(int arr[] ){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            if(buyPrice>arr[i]){
                buyPrice=arr[i];
            }else{
                int profit=arr[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }
        }
        System.out.print(maxProfit);
    }
    
    public static void Printmax(int arr[]){
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(Max<arr[i]){
                Max=arr[i];
            }
        }
        System.out.print(Max);
        
    }
    public static void maxsum(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
           
        }
        if(ms==0){
            Printmax(arr);
           
        }else{
         System.out.print(ms);
        }
    }
    
    public static void subarrays(int arr[] ){
        for(int i=0;i<=arr.length-1;i++){
        int start=i;
        for(int j=i;j<=arr.length-1;j++){
           int end=j;
           
        for(int k=start;k<=end;k++){
            System.out.print(arr[k] );
           
          }
          
           System.out.print(",");
       }
       
         System.out.println();
      }
    }
    
    public static void pairs(int arr[] ){
    
    for(int i=0;i<arr.length;i++){
        int curr=arr[i];
        for(int j=i+1;j<arr.length;j++){
            System.out.print("(" + curr+ "," + arr[j] + ")");
        }
        System.out.println();
    }
}

public static Boolean Distinct(){
    int arr[]={1,2,3,4};
    
    Boolean distinc=false;
     for(int i=0;i<arr.length;i++){
    
      for (int j=(i+1);j<arr.length;j++){

          if(arr[i]==arr[j]){
            distinc=true;
          }
      }
     }
      return distinc;
}

public static void Target(){
    int arrr[]={4,5,6,7,0,1,2};
    int Target=9;
    int print=0;

    for(int i=0;i<arrr.length;i++){
        if(arrr[i]==Target){
            System.out.print(i);
            print=1;
        }
    }
    if(print==0){
        System.out.println("-1");
    }

}
 
public static void main(String[] args) {
    // int arr[]={5,15,1,3};
    //  pairs(arr);
    // subarrays(arr);
    // maxsum(arr);
    // pattern(5);
    // buysellstocks(arr);
    //    System.out.println(Distinct());
      Target();
    }
}








// 1
// 121
// 12321
// 1234321