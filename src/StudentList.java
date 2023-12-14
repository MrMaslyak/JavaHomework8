
class StudentList {
    private Student[] students;
    private int size;
    private static final int default_peoples = 10;

    public StudentList() {
        this.students = new Student[default_peoples];
        this.size = 0;
    }

    void addStudent(String firstName, String lastName, double averageGrade) {
        if (size < students.length) {
            students[size] = new Student(firstName, lastName, averageGrade);
            size++;
        } else {
            System.out.println("Student list is full");
        }
    }
    void removeStudent(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                students[i] = students[i + 1];
            }
            students[size - 1] = null;
            size--;
        } else {
            System.out.println(" No student removed.");
        }
    }
    void displayAllStudents() {
        System.out.println("List of students:");
        for (int i = 0; i < size; i++) {
            students[i].displayInfo();
        }
    }
}