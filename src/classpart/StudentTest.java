package classpart;

public class StudentTest {
    public static void main(String[] args) {
        // Student 객체 생성
        Student student = new Student();
        // student라는 레퍼런스 변수를 통해 해당 클래스의 데이터와 메서드에 접근할 수 있다.
        // * studentName은 Student 클래스에 있는 메서드이다. *
        student.studentName = "junhee";
        student.showStudent();
    }
}
