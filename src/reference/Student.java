package reference;

public class Student {

    int studentId;
    String studentName;

    // 참조 자료형
    Subject korea;
    Subject math;

    // 참조 자료형 사용법
    public Student(String name , int score) {
        korea = new Subject();
        math = new Subject();
    }

    public void setKorea(String name, int score) {
        korea.setSubjectName(name);
        korea.setScore(score);

        korea.subjectName = name;
        korea.setScore(score);
    }

    public void setMath(String name, int score) {
        math.setSubjectName(name);
        math.setScore(score);

        math.subjectName = name;
        math.setScore(score);
    }

    public void showStudentInfo() {
        int total = korea.getScore() + math.getScore();
        System.out.println("학생 총점은 " + total);
    }

}
