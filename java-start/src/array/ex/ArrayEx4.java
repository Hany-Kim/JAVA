package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요:");

        int[] arrs = new int[5];
        int sum = 0;

        for (int i = 0; i < arrs.length; i++) {
            arrs[i] =  scanner.nextInt();
            sum += arrs[i];
        }

        double avg = (double) sum / arrs.length;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
