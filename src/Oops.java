// object oriented programming (oops)



public class Oops {

 /*public static void  main(String[] args){
      Pen p1=new Pen();
    // idhr apn pen class ka 1 p1 object le rhe he 
    p1.setcolor("blue");                         // color set kiya 
    System.out.println(p1.getcolor());                  // color get kiya class ke through
    p1.setTip(5);                                // tip set ki
    System.out.println(p1.getTip());                   // tip get ki class ke through
    p1.setcolor("yellow");                        // color set kiya 
    System.out.println(p1.getcolor());                  // again clor get kiya class ke through
  p1.setTip(6);
  System.out.println(p1.getTip());
     
  /*  Bankaccount myACC=new Bankaccount();
    
     myACC.username="nishant";
     myACC.setpassword("buhbujudfc");   // yha prr hume password ke liye class ko call krna pdega
          */
   // }
 //}

 

 /*class Bankaccount{
    public String username;                // username jo he vo public hoga kyuki sbko visible he
    private String password;                     // password jo he vo private hoga kyukki sbko visible nhi he 
  
     public void setpassword(String pwd){
        password=pwd;
     }
     
 }*/
 
 /*class Pen {                         // propertys and function              // pen 1 object he 
    private String color;
    private int tip;
             
     String getcolor(){
        return this.color;
     }

     int getTip(){
        return this.tip;
     }
    void setcolor(String newcolor){
        color=newcolor;
    
    }
    void  setTip(int  newTip){
        tip=newTip;
    }


 }


}*/

 // constructer calling 
   /*public static void main(String[] args){
      Student s1=new Student();                                //non parameterised constructor
      Student S1=new Student("nishant");                 // parameterised constructor
      System.out.println(S1.name);               
     
      // copy constructor 

      
      Student s2=new Student(s1);
      s2.password="jnbhujfgu";
      System.out.println(s2.password);
   }
}

   // constructor 

   /*class Student{
      String name;
      int roll;
       String password;

       // copy constructor 

      Student(Student s1){
         this.name=s1.name;
         this.roll=s1.roll;


      }
      // non parameterised constructor
      Student(){
       System.out.println("constructor is called");
      }
      //parameterised
      Student(String name){
         this.name=name;
      }*/





      // INHERITANCE 


      

     /*  public static void main(String[] args){
         Fish shark=new Fish();
         shark.eat();
         shark.Breath();

          shark.swim();
      }
   
   } 

  class Animal{
   String skin_color;
  
  void  Breath(){
   System.out.println("breath");
  }

  void  eat(){
   System.out.println("eats");
  }

  }  

  class Fish extends Animal{
   int gils;

    void swim(){
      System.out.println("swim in water ");
    }*/


    // ABSTRACTION IN JAVA


    /*public static void main(String[] args){
     
      Horse h =new Horse();
      h.eat();
      h.walk();  
      Chiken c=new Chiken();
      c.eat();
      c.walk();    
       
    }
 }

 abstract class Animal{
   void eat(){
      System.out.println("eats");
   }
   abstract void walk();
 }

 class Horse extends  Animal{
   void walk() {
      System.out.println(" horse walk in 4 leg ");
   }
 }
  
 class Chiken extends Animal{                                        // extend is a inheritance key word 

   void walk() {
      System.out.println("chiken walk in two legs ");
   }*/

    
   // INHERITANCE IN JAVA 
   /*public static void main(String[] args){
   queen q= new queen();
   q.moves();
   rook r=new rook();
   r.moves();
   }
 }

 interface Chessplayer{
   void moves();
 }
 class queen implements Chessplayer{
   public void moves() {
      System.out.println("up ,down,left ,right ,and diagonal in 4 direction");
   }
 }
 class rook implements Chessplayer{
   public void moves() {
      System.out.println("up ,down,left ,right");
   }
}
class king implements Chessplayer{
   public void moves() {
      System.out.println("up ,down,left ,right by one step");
   }*/
   
}