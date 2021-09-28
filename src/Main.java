public class Main {

    public static void main(String[] args) {
        Coordinates coor = new Coordinates();
        coor.set(20,5);
        System.out.println(coor.toString());

        Circles circle = new Circles(4);
        circle.setPosition(coor);
        System.out.println(circle.toString());

        coor.set(13,4);
        System.out.println(circle.toString());
    }
    public void Test12(){

        System.out.println("Test Feature 1");


    }
}
