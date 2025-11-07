package JavaMainClass1;

class Circle {
    public class Circle1 {
        // Private instance variables
        private double radius;
        private String color;

        // Default constructor
        public Circle1() {
            this.radius = 1.0;
            this.color = "red";
        }

        // Constructor with radius
        public Circle1(double radius) {
            this.radius = radius;
            this.color = "red";
        }

        // Constructor with radius and color
        public Circle1(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        // Getter and setter for radius
        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        // Getter and setter for color
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // Compute area of circle
        public double getArea() {
            return Math.PI * radius * radius;
        }

        // Convert to string
        @Override
        public String toString() {
            return "Circle[radius=" + radius + ", color=" + color + "]";
        }
    }

}
