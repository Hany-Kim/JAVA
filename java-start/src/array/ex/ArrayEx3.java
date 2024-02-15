package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요:");

        int[] arrs = new int[5];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] =  scanner.nextInt();
        }

        for (int i = arrs.length - 1; i >= 0; i--) {
            System.out.print(arrs[i]);
            if(i > 0){
                System.out.print(", ");
            }
        }
    }
}
