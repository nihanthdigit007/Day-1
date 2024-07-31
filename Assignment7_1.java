public class Assignment7_1 {

        public static void main(String[] args) {

            Assignment7 rect = new Assignment7(5.0, 3.0);

            rect.setLength(10.0);
            rect.setWidth(4.0);

            double area = rect.calculateArea();
            double perimeter = rect.calculatePerimeter();

            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
        }
    }

