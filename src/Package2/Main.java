package Package2; //public access modifier
import package1.company;
public class Main {
    public static void main(String[] args) {
        company z1=new company();
        z1.no1=10;
        z1.no2=11;
        z1.no3=12;

        z1.no1();
    }
}