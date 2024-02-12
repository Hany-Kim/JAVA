package cond.ex;

public class MoreThanNum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int maxNum = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + maxNum + "입니다.");
    }
}
