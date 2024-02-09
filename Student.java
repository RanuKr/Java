public class Student {
    private String name;
    private int age;
    private char grade;
    private static int studentCount = 0;

    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        studentCount++;
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

    public static int getStudentCount() {
        return studentCount;
    }

    public class Main {
        public static void main(String[] args) {
            Student student1 = new Student("Alice", 20, 'A');
            Student student2 = new Student("Bob", 21, 'B');

            System.out.println("Student 1 Name: " + student1.getName());
            System.out.println("Student 1 Age: " + student1.getAge());
            System.out.println("Student 1 Grade: " + student1.getGrade());

            System.out.println("\nStudent 2 Name: " + student2.getName());
            System.out.println("Student 2 Age: " + student2.getAge());
            System.out.println("Student 2 Grade: " + student2.getGrade());

            System.out.println("Total number of students: " + Student.getStudentCount());
        }
    }
}
