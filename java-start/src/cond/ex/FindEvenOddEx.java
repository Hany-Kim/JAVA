package cond.ex;

public class FindEvenOddEx {
    public static void main(String[] args) {
        int x = 3;

        String res = (x % 2 == 1) ? "홀수" : "짝수";

        System.out.println("x = " + x + ", " + res);
    }
}
