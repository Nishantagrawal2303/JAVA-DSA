
// import java.util.Scanner;
public class Stringadvance {
    // strings
  
   // public static void main(String[] args){
      /* char arr[]={'a','b','c','d'};
      String str="abcd";
      String str2=new String("xyz");

      Scanner SC=new Scanner(System.in);
      String name;
   
    
    System.out.println(str);
    System.out.println(str2);
    System.out.println(arr);*/
   
   // input output of string
  /*   Scanner SC=new Scanner(System.in);
    String name;
    name=SC.nextLine();                 // next sirf 1 word lega nextLine(); puri line lega
    System.out.println(name);
      System.out.println(name.length());             // for finding the length of string stringname.length();
     }*/
 // concatenation


/*public static void print_char(String fullname){
  for(int i=0;i<fullname.length();i++){
    System.out.print(fullname.charAt(i)+"  ");
  }

}
public static void main(String[] args){
  String name="nishant";                    // by concatension we add two strings like this
  String surname="agrawal";
  String fullname=name+" "+surname;
 // System.out.println(fullname);
  print_char(fullname);
    
}*/

/*  public static boolean isPalindrone(String str){
  for(int i=0;i<str.length()/2;i++){
     if(str.charAt(i) !=str.charAt(str.length()-i-1)){
          return false;
     }
  }
     return true;
 }
 public static void main(String[] args){
 
   String str="racecar";
   System.out.println(isPalindrone(str));;
    

 }*/
   
    /*public static float getshortestpath(String path){
      int x=0;
      int y =0;
      for(int i=0;i<path.length();i++){
       char dir=path.charAt(i);
       // south
       if(dir=='S'){
        y--;
       }else if(dir=='N'){
        y++;
       }else if(dir=='E'){
        x++;
       }else{
        x--;
       }

      }
      int X2=(x*x);
      int Y2=(y*y);
      return (float)Math.sqrt(X2 + Y2);          //Math.sqrt is use for finding the squareroot 
    
    }

 public static void main(String[] args){
  String path="WNEENESENNN";
  System.out.println(getshortestpath(path));
 }*/
   
   /*  public static String substring(String str,int si , int ei){
      String substr="";
      
      for (int i=si; i<ei ;i++){
        substr+=str.charAt(i);
      }
      return substr;
    
    }
    public  static void main(String[] args){
     // substring 
          String str="helloworld";            
         System.out.println(substring(str ,0,4));
      
        }*/                    
                
        

       /*public static void main(String[] args){
        String fruits[]= {"apple ", "mango" , "bannana"};
        
        String largest = fruits[0];
        for(int i=0; i<fruits.length;i++){
          if(largest.compareTo(fruits[i])<0){        //compare to is used to compare two strings str1 is compared with str2 
             largest=fruits[i];                       // st1 compareTo str 2      0 : equal \ 0> negative and str1 < str2 \o< positive and str1> str2 
          }
        }
         System.out.println(largest);
        

       }*/

            // Stringbuilder 

            
        /* public static void main(String[] args){
            
          StringBuilder Sb =new StringBuilder("");        // khali string 
          for(int ch=1;ch<=10;ch++){
            System.out.println("ram");
            Sb.append(ch);                                    // tha usme fir A se value add krayenge \ aur piche add krvane ke liye sb.append use krte  he
          }
            System.out.println(Sb);
          
         }*/
               
          // convert each the first letter of each word to uppercase
          
          public static String toUpperCase(String str){
           StringBuilder SB=new StringBuilder("");
            
            char ch= Character.toUpperCase(str.charAt(0)); // character capital hone isse 
             SB.append(ch);
             
             for(int i=1;i<str.length()-1;i++){
              if(str.charAt(i)==' ' && i<str.length()-1){
                SB.append(str.charAt(i));
                i++;
                SB.append(Character.toUpperCase(str.charAt(i)));
                 

              }else{
                SB.append(str.charAt(i));
              }
            }
              return SB.toString();

             
          }
          public static void main(String[] args){
            String str="hey i am nishant ";
            System.out.println(toUpperCase(str));
          }







        
  }