package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int cnt = scanner.nextInt();

        int[] arrs = new int[cnt];
        int sum = 0;

        System.out.println(cnt + "개의 정수를 입력하세요:");
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] =  scanner.nextInt();
            sum += arrs[i];
        }

        double avg = (double) sum / arrs.length;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
