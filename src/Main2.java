public class Main2 {
    public static void main(String[]args){
      //Employee a1 = new Employee();
      //System.out.println(a1.name+" "+a1.age+" "+a1.department);
        Employee a2 = new Employee("senanayaka",21,"HR");
        System.out.println(a2.name+" "+a2.age+" "+a2.department);
    }
    public static class Employee{
        String name;
        int age;
        String department;

     public Employee(String name, int age, String department) { //parameterized constructor
            this.name = name;                                   //Alt+Insert
            this.age = age;
            this.department = department;
        }

        public Employee(){ // Default contructor     (NON-parameterized constructor)
            this.name ="prabahsh";
            this.age = 21;
            this.department="IT";
        }
    }
}