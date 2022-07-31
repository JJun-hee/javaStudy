package reference;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("JUN",200);
        student.setKorea("국어",100);
        student.setMath("수학", 100);

        student.showStudentInfo();
    }
}
