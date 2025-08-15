public class Patternsadvance{
    // advance pattern
    // print hollow rectangle 
    // jay shree RAM
    
  /*   public static void hollow_rectangle(int totRows ,int totCols){
        //outer loops
        for(int i=1;i<=totRows;i++){
            //inner loops
            for(int j=1;j<=totCols;j++){
                //cell-(i,j)
                if(i==1||i==totRows||j==1||j==totCols){
                    // boundary cell
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
             hollow_rectangle(4,5);
    }*/

//inverted and roated pyrimied

/*public static void inverted_pyramied(int n){
    
    //outer 
    for(int i=1;i<=n;i++){
        //spaces
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    //stars
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
 }
   
}
public static void main(String[] args){
    inverted_pyramied(4);
}*/

//inverted half pyramid eith number
 
 /*public static void inverted_half_pyramid_with_number(int n){
    //outer loop
    for(int i=1;i<=n;i++){
        //ionner loop
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
        }
     
    System.out.println();
 }
}

 public static void main(String[] arhs){
    inverted_half_pyramid_with_number(10);
 }*/ 

 /*  public static void floyds_triangle(int n){
    int counter=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(counter+" ");
            counter++;
        }
    
    System.out.println();
    }
  }

  public static void main (String[] args){
    floyds_triangle(5);
  }*/

  
  /*public static void zero_one_tringale(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if((i+j) % 2==0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
    
  }
  public static void main(String[] args){
    zero_one_tringale(5);
  }*/
   
  /*public static void butterfly(int n){
    // outer loop
  for(int i=1;i<=n;i++ ){
    //first half
    for(int j=1;j<=i;j++){
        //for stars =i
        System.out.print("*");
    }
    for(int j=1;j<=2*(n-i);j++){
        //for spaces=2*(n-i)
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        //for stars=i
        System.out.print("*");
    }
    System.out.println();

   }
  // second half
  for(int i=n;i>=1;i--){
    
    for(int j=1;j<=i;j++){
    //for stars =i
    System.out.print("*");
 }
 for(int j=1;j<=2*(n-i);j++){
    //for spaces=2*(n-i)
    System.out.print(" ");
 }
 for(int j=1;j<=i;j++){
    //for stars=i
    System.out.print("*");
  }
  System.out.println();

  }

  }

  public static void main(String[] args){
    butterfly(4);
  }*/ 

  //number pyramid 
  
   public static void number_pyramid(int n){
    for(int i=1;i<=n;i++){
       for(int j=1;j<=n-i;j++){
        System.out.print(" ");
       }
       for(int j=1;j<=i;j++){
        System.out.print(i+" ");
       }
       System.out.println();
    }

   }
   public static void main(String[] args){
    number_pyramid(9);
   }
  
}
    

