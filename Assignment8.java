public class Assignment8 {
        private int studentId;
        private String name;
        private int age;
        private char grade;


        public Assignment8(int studentId, String name, int age, char grade) {
            this.studentId = studentId;
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public char getGrade() {
            return grade;
        }

        public void setGrade(char grade) {
            this.grade = grade;
        }

        public void displayDetails() {
            System.out.println("Student ID: " + studentId);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
        }
    }

