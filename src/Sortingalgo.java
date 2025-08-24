public class Sortingalgo {
     // bubble sort
    /*public static void bubble_sort(int arr[]){
        int n=arr.length;
        for(int turn=0;turn<n;turn++){
            for(int j=0;j<n-1-turn;j++){
                if(arr[j]>arr[j+1]){     // compare with the current element with the next element if greater then swap 
                    //swap
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                }
                
            }
        }
    } 
    public static void print(int arr[]){        // upr se jo return hokr aayega vo yha store hoga
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args){
      int arr[]={2,5,1,7,8};
      bubble_sort(arr);
      print(arr);
      System.out.println(arr);
    }*/

      // selection sort
     /*public static void selection_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int minPos=i;      // here we assume that the minimum value element is current ellement 

            for(int j=i+1;j<n;j++){
                if(arr[minPos] > arr[j]){             // agr apn ko current elementse bhi koisa chota element mil jata he to minimum  ko updtate krr denge  
                  minPos=j;  
                }
             }

        int temp=arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;
     }
    }
    
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args){
      int arr[]={2,10,1,7,8};

      selection_sort(arr);
      print(arr);
      System.out.println(arr);
    }*/

   // insertion sort

   
   
   
   
   
   
   


       
}
