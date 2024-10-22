public class TestRectangle {
        public static void main(String[] args) {
            // Create a rectangle using coordinates
            myRectangle rectangle1 = new myRectangle(1, 2, 5, 7);

            // Create a rectangle using MyPoint objects
            MyPoint point1 = new MyPoint(3, 4);
            MyPoint point2 = new MyPoint(8, 9);
            myRectangle rectangle2 = new myRectangle(point1, point2);

            // Test methods
            System.out.println("Rectangle 1:");
            System.out.println("Top Left: " + rectangle1.getTopLeft());
            System.out.println("Bottom Right: " + rectangle1.getBottomRight());
            System.out.println("Area: " + rectangle1.getArea());
            System.out.println("Perimeter: " + rectangle1.getPerimeter());
            System.out.println(rectangle1);


            System.out.println("\nRectangle 2:");
            System.out.println("Top Left: " + rectangle2.getTopLeft());
            System.out.println("Bottom Right: " + rectangle2.getBottomRight());
            System.out.println("Area: " + rectangle2.getArea());
            System.out.println("Perimeter: " + rectangle2.getPerimeter());
            System.out.println(rectangle2);
        }
}

