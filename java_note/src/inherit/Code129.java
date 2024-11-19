package inherit;

public class Code129 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("c.x: "+c.x);
        System.out.println("c.y: "+c.y);
        System.out.println("c.z: "+c.z);

        c.show();
        c.print();
        c.check();
    }
}
