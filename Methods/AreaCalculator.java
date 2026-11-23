public class AreaCalculator {

    // 1. Area of a Circle (1 double parameter: radius)
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // 2. Area of a Rectangle (2 double parameters: length and breadth)
    public double area(double length, double breadth) {
        return length * breadth;
    }

    // 3. Area of a Square (1 int parameter: side)
    public int area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Area of Circle: " + calc.area(5.0));          // Calls circle method
        System.out.println("Area of Rectangle: " + calc.area(4.0, 6.0));  // Calls rectangle method
        System.out.println("Area of Square: " + calc.area(5));            // Calls square method
    }
}
