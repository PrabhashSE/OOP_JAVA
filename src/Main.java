public class Main {
    public static void main(String[] args){
        //class and objects
        Car c1 =new Car(); //creation of the object
        c1.color="red";  //initialize the attribute
        c1.name="Toyota";
        c1.speed=180;
        c1.weight=50.5;
        c1.no=123;

        c1.Speed();//method
        c1.color();
        c1.weight();
        //testing git push
      //hello
    }
    public static class Car {

        int no; //instance variables
        String name;
        String color;
        double weight;
        int speed;

        public void Speed(){    //instance methods
            System.out.println(speed);
        }
        public void color(){
            System.out.println(color);
        }

        public void weight(){
            System.out.println(weight);
        }
    }
}