package classpart;

// 클래스 이름은 첫글자는 대부분 대문자
// java파일 하나에는 하나의 클래스만 존재해야함
// 여러개가 존재할 수 있지만 접근제어자 public이 있는 클래스는 하나만
public class Student {
    //멤버 변수 선언
    int studentId;
    String studentName;
    int grade;
    String address;

    public void showStudent(){
        System.out.println("studentName" + studentName);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }
}
