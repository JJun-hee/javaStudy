package classpart;

public class Point {

    // Class 안에서 다른 클래스를 가져다가 사용하기 위해
    // 참조 변수를 생성하고 , 선언을 하고 사용하는 과정
   Point point;
    int radius;

    public void Circle() {
        point = new Point();

    }

}
