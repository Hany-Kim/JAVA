package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // 배열 변수 선언

        int sum = 0;
        for (int student : students) {
            sum += student;
        }

        double avg = (double) sum / students.length;

        System.out.println("점수 총합: " + sum);
        System.out.println("점수 평균: " + avg);
    }
}
