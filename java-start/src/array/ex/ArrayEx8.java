package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요:");
        int studentsNum = scanner.nextInt();

        String[] subjects = {"국어", "영어", "수학"};
        int[][] scores = new int[studentsNum][subjects.length];

        for(int y = 0; y < studentsNum; y++){
            System.out.println((y + 1) + "번 학생의 성적을 입력하세요:");
            for(int x = 0; x < subjects.length; x++){
                System.out.print(subjects[x] + " 점수:");
                scores[y][x] = scanner.nextInt();
            }
        }

        for(int y = 0; y < studentsNum; y++){
            int totalScore = 0;
            for(int x = 0; x < subjects.length; x++){
                totalScore += scores[y][x];
            }
            double avg = (double) totalScore / subjects.length;
            System.out.println((y + 1) + "번 학생의 총점: " + totalScore + ", 평균:" + avg);
        }
    }
}
