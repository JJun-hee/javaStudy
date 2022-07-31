package hiding;

// 모든 멤버변수에 private를 선언할 필요는 없지만
// 이 데이터가 오픈되서 아무렇게나 사용되는 경우엔 데이터 무결성에 위배될 수 있다.
class BirthDay {

     // Class 안에서만 사용할 수 있는게 접근 제어자 private 의 특징이다.
    private int day;
    private int month;
    private int year;

    // 그래서 접근 제어자 private를 사용하기 위해서는 getter,setter를 선언해줘야한다.
    // 사용하기 위해서 public 메서드를 오픈해서 메서드를 사용할 수 있다.
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(month == 2){
            if(day < 1 || day > 28){
                System.out.println("날짜 오류입니다.");
            }else{
                this.day = day;
            }
        }

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {

        this.month = month;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
