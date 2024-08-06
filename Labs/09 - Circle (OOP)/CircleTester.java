// For an overview of the program and sample inputs, be sure to check out `Circle.md`

public class CircleTester {
    public static final double THRESHOLD = 0.000000001;

    public static void main(String[] args) {

    	Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        circle1.setName("Circle 1");
        circle1.setX(0.0);
        circle1.setY(0.0);
        circle1.setRadius(2);
        circle2.setName("Circle 2");
        circle2.setX(2.0);
        circle2.setY(1.0);
        circle2.setRadius(1);
        System.out.println("circle1=" + circle1);
        System.out.println("circle2=" + circle2);

        circle1.setRadius(-2.0);

        if (Math.abs(2 - circle1.getRadius()) < THRESHOLD)
            System.out.println("PASSED: Set Radius");
        else
            System.out.println("FAILED: Set Radius");

        circle1.setX(-3.0);
        circle1.setY(4.0);


        System.out.println("name: " + circle1.getName());
        System.out.println("center: (" + circle1.getX() + ", " + circle1.getY() + ")");
        System.out.println("radius: " + circle1.getRadius());

        circle2.setRadius(5.3);

        System.out.println("name: " + circle2.getName());
        System.out.println("center: (" + circle2.getX() + ", " + circle2.getY() + ")");
        System.out.println("radius: " + circle2.getRadius());

        System.out.println("circle1 diameter, area, and perimeter:");
        System.out.println("diameter: " + circle1.diameter());
        System.out.println("area: " + circle1.area());
        System.out.println("perimeter: " + circle1.perimeter());

        System.out.println("circle2 diameter, area, and perimeter:");
        System.out.println("diameter: " + circle2.diameter());
        System.out.println("area: " + circle2.area());
        System.out.println("perimeter: " + circle2.perimeter());

        System.out.println("is circle1 a unit circle?: " + circle1.isUnitCircle());
        System.out.println("is circle2 a unit circle?: " + circle2.isUnitCircle());

        // Additional tests
        System.out.println("\nAdditional Tests:");
        System.out.println("circle1 equals circle2: " + circle1.equals(circle2));
        System.out.println("circle2 equals circle1: " + circle2.equals(circle1));

        System.out.println("\nDistance between circle1 and circle2: " + circle1.distance(circle2));
        System.out.println("Distance between circle2 and circle1: " + circle2.distance(circle1));
        if (circle1.distance(circle2) == circle2.distance(circle1)) {
            System.out.println("Both circles are exactly the same length away.");
        }

        System.out.println("\nIs circle1 smaller than circle2? " + circle1.isSmaller(circle2));
        System.out.println("Is circle2 smaller than circle1? " + circle2.isSmaller(circle1));

        System.out.println("\nComparing circle1 to circle2: " + circle1.compareTo(circle2));
        System.out.println("Comparing circle2 to circle1: " + circle2.compareTo(circle1));

        System.out.println("\nDoes circle1 intersect circle2? " + circle1.intersects(circle2));
        System.out.println("Does circle2 intersect circle1? " + circle2.intersects(circle1));
        
        
    }
}

