import java.util.Arrays;

public class VDATest {
    public static void main(String[] args) {
        // Q1 : 정수 한개를 저장하기 위해서 변수를 선언
        int a = 0;
        System.out.println("a = " + a);

        // Q2 : 변수 a에 10을 저장하고 a에 저장된 값을 변수 b에 저장하고
        //      변수 b에 10을 곱하여 변수 C에 저장
        a = 10;
        int b = a;
        int c = b * 10;
        System.out.println("c = " + c);

        // Q3 : sum 이라는 변수에 1부터 5까지의 수를 누적(accumulate) 출력
        int sum = 0;
        for(int i = 1; i <= 5; i++)
            sum += i;
        System.out.println("sum = " + sum);

        // Q4 : x = 10, y = 20을 저장하고 변수의 값을 서로 교환(Swap)
        int x = 10;
        int y = 20;

        int temp = x;
        x = y;
        y = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
