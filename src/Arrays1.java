
//import java.util.Scanner;
public class Arrays1 {


  /*  public static boolean search(int matrix[][] ,int key){      // for finding an element in a 2 d array
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==key){
            System.out.println("key is found index("+i+","+j+")" );
            return true;
        }
     }
  }
    
        System.out.println("key not found");
        return false;
    
 }

    public static void main(String[] args){

    

    int matrix[][]=new int [3][3];   //formation of array
     int n=3;  int m=3;
     try (Scanner SC = new Scanner(System.in)) {
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=SC.nextInt();
            }
         }
    } 
      //output 
   
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(matrix[i][j] + " ");
        }
         System.out.println();
    }
       search(matrix,9 );
     
    }*/

    // sprial matrix

    /*public static void spiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;        // yha pr row ke liye matrix.lenght lenge kyuki N-1 hoga
        int endCol=matrix[0].length-1;      // yha pr col ke liye matrix[0].lenght lenge kyuki M-1 hoga

 
        while(startRow<=endRow && startCol<=endCol){
            for(int j=startCol;j<=endCol;j++){                      //top  sc to EC , SC IS FIX
                System.out.print(matrix[startRow][j]+" ");
             }
             for(int i=startRow+1;i<=endRow;i++){                    //right    SR+1 TO ER , EC IS FIX
                System.out.print(matrix[i][endCol]+" ");
             }
             for(int j=endCol-1;j>=startCol;j--){                  //bottom      EC-1 TO EC, ER IS FIX
                if(startRow==endRow){
                    break;
                }                
                System.out.print(matrix[endRow][j]+" "); 
            }
            for(int i=endRow-1;i>=startRow+1;i--){                 //left        ER-1 TO SR+1 , SC IS FIX
                if(startCol==endCol){
                    break;
                }                
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int matrix[][]= {{1 ,2, 3, 4},
                        { 5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

                        spiral(matrix);
    }*/
      
    /*   public static int diagonal_sum(int matrix[][]){
        int sum=0;
        // primary sum
        for(int i=0;i<matrix.length;i++){
        sum +=matrix[i][i];                          //[i][i] for 
         //for secondary diagonal
        if(i != matrix.length-i-1)                   //[i][j]  now here i+j=n-1   . j=matix.lemgth-i-1,
        sum +=matrix[i][matrix.length-i-1];
    }
    return sum;
   
}
    public static void main(String[] args){
        int matrix[][]= {{1 ,2, 3, 4},
                        { 5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

                         System.out.println(diagonal_sum(matrix));
                      //  diagonal_sum(matrix);
                        
   
}*/

public static boolean stair_case(int matrix[][], int key){
    int row=0;                                              //row start krenge 0 se 
    int  col=matrix[0].length-1;                              // column start krenge matrix.length-1 se 
    while(row < matrix.length && col>=0){                 // while loop chlega jb tk hmari row matrix.length tk nhi ho jati and col
                                                         // jb tk chlega jb tk hmari col ki  value 0 tk nhi ho j 
     if(matrix[row][col] == key){
        System.out.println("key is found ( "+row+","+col+")");
        return true;
     }
     else if(key <matrix[row][col]){              //agr key ki value us cell ki value se km hoti he to left jayenge
         col--;
     }
     else{                                      // agr key ki value us celll value se bdi hogi to niche jayega 
        row++;
     }

     }
     System.out.println("not found");
      return false;
    }





 public static void main(String[] args){
    int matrix[][]={{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
     int key=33;
   
     stair_case(matrix,key);
    
 }









}


