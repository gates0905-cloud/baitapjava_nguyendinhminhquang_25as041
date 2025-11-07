package JavaMainClass.Exe5_1;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        System.out.println(p1);  // Point: (10,20)

        // Try setting p1 to (100,10)
        p1.setXY(100, 10);
        System.out.println("After setXY: " + p1); // Point: (100,10)
    }
}

