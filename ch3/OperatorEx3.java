package ch3;

public class OperatorEx3 {
    public static void main(String[] args) {
        int i=5, j=5;
        System.out.println(i++);    // 후위형 (대입 후 증가)
        System.out.println(++j);    // 전위형 (증가 후 대입)
        System.out.println("i = " + i + ", j = " + j);
    }
}
