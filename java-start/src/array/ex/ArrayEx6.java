package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int cnt = scanner.nextInt();

        int[] arrs = new int[cnt];
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        System.out.println(cnt + "개의 정수를 입력하세요:");

        for (int i = 0; i < arrs.length; i++) {
            arrs[i] =  scanner.nextInt();
            minNum = Math.min(minNum, arrs[i]);
            maxNum = Math.max(maxNum, arrs[i]);
        }

        System.out.println("가장 작은 정수: " + minNum);
        System.out.println("가장 큰 정수: " + maxNum);
    }
}
