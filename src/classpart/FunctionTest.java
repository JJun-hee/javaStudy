package classpart;

public class FunctionTest {

    public static void main(String[] args) {
        int num1= 10;
        int num2= 20;
        int total = 0;

        total = addNum(num1,num2);
        System.out.println(total);
    }

    public static int addNum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}
