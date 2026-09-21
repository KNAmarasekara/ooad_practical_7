public class Student {
 
    private int studentID;
    private String name;
    private double gpa;
 
    Student(int studentID, String name, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.gpa = gpa;
    }
 
    int getStudentID() { return studentID; }
 
    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Name: " + name + ", GPA: " + gpa;
    }
 
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
 
        // Exercise 2

        java.util.Collection<Student> studentList = new java.util.ArrayList<>();
        studentList.add(new Student(01, "Megumi", 3.9));
        studentList.add(new Student(02, "Yuji", 2.8));
        studentList.add(new Student(03, "Nobara", 3.1));

 
        System.out.println("Student details:");
        for (Student s : studentList) {
            System.out.println(s);
        }

        // Exercise 3
        //making unique heights
        java.util.Set<Double> hashSet = new java.util.HashSet<>();  // unique, no guaranteed order
        java.util.Set<Double> treeSet = new java.util.TreeSet<>();  // unique, ascending order

        System.out.println("Enter 10 student heights (in cm):");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Height " + i + ": ");
            double h = sc.nextDouble();
            hashSet.add(h);
            treeSet.add(h);
        }

        System.out.println(" ");
        System.out.println("Unique heights 1 (HashSet):");
        for (double h : hashSet) {
            System.out.println(h);
        }
        System.out.println(" ");
        System.out.println("Unique heights 2 (TreeSet):");
        for (double h : treeSet) {
            System.out.println(h);
        }

        // Exercise 4 
        // Key = student number, Value = Student object 

        java.util.Map<Integer, Student> studentMap = new java.util.HashMap<>();
        for (Student s : studentList) {
            studentMap.put(s.getStudentID(), s);
        }

        System.out.print("Enter student number: ");
        int id = sc.nextInt();

        Student found = studentMap.get(id);   // direct access by key
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("No student found with number " + id);
        }
    }
}
