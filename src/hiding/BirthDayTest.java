package hiding;

public class BirthDayTest {

    public static void main(String[] args) {
        BirthDay day = new BirthDay();
       /* day.month = 2;
        day.year = 2022;
        day.day = 30;*/

        // private 접근 제어자 메서드로 사용하는 방법
        day.setMonth(2);
        day.setYear(2022);
        day.setDay(27);



    }
}
