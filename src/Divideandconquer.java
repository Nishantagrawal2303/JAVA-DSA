//divide and conquer 

public class Divideandconquer {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(i+" ");
        }
    }


    public static void mergeSort( int arr[] , int si, int ei){
     
        if(si >= ei){
            return;
        }
        
        // kaam 
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);               //for left part of array 
        mergeSort(arr, mid+1, ei);            // right part of array 
         merge(arr,si, mid, ei);
    }


    public static void merge(int arr[], int si, int mid, int ei){
     //left(0,3)=4 elements  right(4,6)=3element  ei - si me plus 1 krna pdega kyuki nhi to 6-0+1 
   int temp[]=new int[ei-si+1];
     int i =si; // iterator for left part
    int j=mid+1; // iterator for right part
    int k=0; // iterator for temp arr
        
    while(i<=mid && j<= ei){
        if(arr[i]<arr[j]){
            temp[k]=arr[i];
            i++; k++;
        }else{
            arr[k]=arr[j];
            j++; k++;
        }
    }
     // left part 
    while(i<=mid){
      temp[k++]=arr[i++]; 
    }
    //right part
    while(j<=ei){
        temp[k++]=arr[j++];
    }
    // copy temp to original arr
    for(k=0,i=si; k<temp.length;k++,i++){
        temp[i]=temp[k];
    }

    }

    public static void main(String[] args){
     int arr[]={2,4,7,1,9,};
     mergeSort(arr,0,arr.length-1);
     printArr(arr);
   
    }

    
    
}
