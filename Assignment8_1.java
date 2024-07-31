public class Assignment8_1 {
        public static void main(String[] args) {

            Assignment8 student1 = new Assignment8(1, "Alice", 20, 'A');
            Assignment8 student2 = new Assignment8(2, "Bob", 22, 'B');
            Assignment8 student3 = new Assignment8(3, "Charlie", 21, 'A');

            student1.displayDetails();
            System.out.println();
            student2.displayDetails();
            System.out.println();
            student3.displayDetails();
        }

}
