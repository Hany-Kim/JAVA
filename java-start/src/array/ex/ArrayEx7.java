package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] total_score = new int[4];
        double[] avg_score = new double[4];

        for(int y = 0; y < 4; y++){
            System.out.println((y+1) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수: ");
            int kor_score = scanner.nextInt();
            total_score[y] += kor_score;

            System.out.print("영어 점수: ");
            int eng_score = scanner.nextInt();
            total_score[y] += eng_score;

            System.out.print("수학 점수: ");
            int math_score = scanner.nextInt();
            total_score[y] += math_score;

            avg_score[y] = (double) total_score[y] / 3;
        }

        for(int i = 0; i < 4; i++){
            System.out.println((i+1) + "번 학생의 총점: " + total_score[i] + ", 평균: " + avg_score[i]);
        }
    }
}
