package Interface;

interface Drivable{void drive();}
interface Flyable{void fly();}

public class TestInterface2 implements Drivable,Flyable {
    public void drive(){
        System.out.println("I'm driving");
    }

    public void fly(){
        System.out.println("I'm flying");
    }

    public static void main(String[] args) {
        TestInterface2 obj = new TestInterface2();
        obj.drive();
        obj.fly();
    }
}
