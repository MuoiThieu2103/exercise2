public class myRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

        public myRectangle(int x1, int y1, int x2, int y2) {
            topLeft = new MyPoint(x1, y1);
            bottomRight = new MyPoint(x2, y2);
        }

        public myRectangle(MyPoint topLeft, MyPoint bottomRight) {
            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
        }

        public MyPoint getTopLeft() {
            return topLeft;
        }

        public MyPoint getBottomRight() {
            return bottomRight;
        }

        public double getArea() {
            int width = bottomRight.getX() - topLeft.getX();
            int height = bottomRight.getY() - topLeft.getY();
            return Math.abs(width * height);
        }

        public double getPerimeter() {
            int width = bottomRight.getX() - topLeft.getX();
            int height = bottomRight.getY() - topLeft.getY();
            return 2 * (width + height);
        }

        @Override
        public String toString() {
            return "Rectangle: topLeft=" + topLeft + ", bottomRight=" + bottomRight;
        }
    }

