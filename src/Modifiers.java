public class Modifiers {    // protected access modifier
   public static void main(String[]args){

       Employee q1 = new Employee();
       q1.no1=12;
   }
    public static class Employee{
       protected int no1;
       protected int no2;
       protected int no3;
   }
}