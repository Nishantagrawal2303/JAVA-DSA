//import java.util.Scanner;
public class Arrays {
    
    // arrays
   /*  public static void main(String args[]){
        int marks[] =new int[50];
        
        Scanner SC=new Scanner(System.in);
        marks[0]=SC.nextInt();//physics
        marks[1]=SC.nextInt();// chemistry
        marks[2]=SC.nextInt(); //maths
        System.out.println("phy:"+ marks[0]);
        System.out.println("chemistry:"+ marks[1]);
        System.out.println("maths:" +marks[2]);

        marks[2]=100;
        System.out.println("maths:" +marks[2]);    
    }*/

      /*public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
      } 
    public static void main(String[] args){
     int marks[]={30,60,90};
     update(marks);

     for(int i=0;i<marks.length;i++){
        
        System.out.println(marks[i]);
     }
     System.out.println();
    }*/
      //linear search // kooi bhi particular chizz find krni he to apn linear search use krte he 
      /*public static int linear_search(int number[],int key){
        for(int i=0;i<number.length;i++){
        if(number[i]==key){
          return i;
        }
      }
        return -1;
      
      }
      public static void main(String[] args){
        int number[]={2,4,6,8,10,12,14,16};
        int key=10;
        int index= linear_search(number,key);

        if(index==-1){
          System.out.println("not found");
        }else{
          System.out.println("for that key the index is :"+index);
        }
      } */
      
     /*  public static int largest_number(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
          if(largest<numbers[i]){
            largest=numbers[i];
          }
        }
        return largest;

      }

      public static void main(String[] args){
        int numbers[]={2,9,3,8,5,1};
         System.out.println("largest value is :  "+ largest_number(numbers));

      }*/

      //smallest number in array 
     /* public static int smallest_number(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
          if(smallest>numbers[i]){
            smallest=numbers[i];
          }
        }
        return smallest;

      }

      public static void main(String[] args){
        int numbers[]={2,9,3,8,5,1};
         System.out.println("smallest value is :  "+  smallest_number(numbers));

      }*/


      //binary search

  /*public static int binary_search(int numbers[],int key){
    int start=0;
    int end=numbers.length-1;
    while(start<=end){

      int mid=(start+end) /2;
      
      if(numbers[mid]==key){
        
        return mid;
      }
       if(numbers[mid] < key){
  
        start = mid +1;
       }else{
      
         end=mid-1;
       }
      }
      
    return -1 ;
    
  } 
  public static void main(String[] args){
    int numbers[]={2,4,6,8,10,12,14};
    int key=10;


    System.out.println("index foe key is :"+binary_search(numbers, key));
  }*/
   
  // reverse an array

  /*public static void reverse(int numbers[]){
    int first=0;  int last=numbers.length-1; 
    while(first< last){
      //swap
      int temp=numbers[last];
      numbers[last]=numbers[first];
      numbers[first]=temp;    
      first++;
      last--;
    }
  }
 
  public static void main(String[] args){
    int numbers[]={2,4,6,8,10};

    reverse(numbers);
    for(int i=0;i<numbers.length;i++){
      // print our array 
    System.out.print(numbers[i]+ " ");
    }
    System.out.println();
  }*/
  // print pairs of array

 /*public static void print_pairs(int numbers[]){
    for(int i=0;i<numbers.length;i++){
    int curr=numbers[i]; // 2 4 6 8 10
   for (int j=i+1;j<numbers.length;j++){
       System.out.print("("+ curr+","+numbers[j]+")");
   
      }
  
   System.out.println();
  }
  }
   public static void main(String[] args){
   int numbers[]={2,4,6,8,10};
      print_pairs(numbers);


   }*/    

    

    /*public static void print_subarray(int numbers[]){
      int ts=0;
      for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
          int end= j;
         for(int k=start; k<=end ;k++){
          System.out.print(numbers[k]+" ");
         }
          ts++;
        
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("total sub arrays are : "+ts);
    }

    public static void main(String[] args){
      int numbers[]={2,4,6,8,10};  

      print_subarray(numbers);

    }*/
      // trapping rain water 
    /*public static int trapped_water(int height[]){
      int n= height.length;
      
      // left max boundary
      int leftMax[]= new int [n];        // height brabar hi niklenge 
      leftMax[0]=height[0];              // pehli wali height tp same hi rhegi 
      for(int i=1;i<n;i++){                                       // 
         leftMax[i]=Math.max(height[i],leftMax[i-1]);      // yha apn compare kr rhe he current ko left max ke sath  aur un dono me se apn max wali le lenge 
                                                              //   yha prr leftmax n-1 lenge kyuki current se pehle wali lenge 
      }
      // right max boundary 
      int rightMax[]=new int[n];    
      rightMax[n-1]=height[n-1];                           // right wali nikalna pdegi na to wo last se calculate krenge isiliye last - 1 lenge
      for(int i=n-2;i>=0;i--){                              // yha prr i=n-2 rhega kyuki  ni1 ke liye to apn nikal chuke he 
        rightMax[i]=Math.max(height[i],rightMax[i+1]);      // yha pr right max  n+1 lenge kyuki right wali nikalna hena to vo current + 1 rhegi  
      }

      int trappedwater=0;
      // loop -
      for(int i=0;i<n;i++ ){
        // waterlevel =Math.min(leftmax,rightmax)
       int  waterlevel=Math.min(leftMax[i],rightMax[i]);
       // trappedwater=waterlevel - height[i]
       trappedwater +=waterlevel-height[i];
      }
      
      return trappedwater;
    }
    
      public static void main(String[] args){
        int height[]={4,2,0,6,3,2,5};
            
            System.out.println( trapped_water(height));

      }*/

        public static int buy_sell_stock(int price[]){
          int buyPrice=Integer.MAX_VALUE;                 
          int maxProfit=0;
          for(int i=0;i<price.length;i++){                                
            if (buyPrice<price[i]){     //profit                           price[i]= selling price agr selling price buy price se km he to sell krenge
              int profit=price[i] - buyPrice;     // todays profit           buyPrice km hoga na   
              maxProfit=Math.max(maxProfit,profit);                                 // maximum profir he aaj tk ka 
            }else{
              buyPrice=price[i];
            }
          }
            return maxProfit;
          }
          public static void main(String[] args){
            int price[]={7,1,5,3,6,4};
            System.out.println(buy_sell_stock(price));
          }


        

   }





      
        
    
    

     



  
