package ch3;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        //byte c = a + b;     // 컴파일러 에러 발생한다. 명시적으로 형변환이 필요함.
        byte c = (byte)(a+b);
        System.out.println(c);

    }
}
