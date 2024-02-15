package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2 x 3 2차원 배열 만든다.
        int[][] arr = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        }; // 행:2 열:3

        /*arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;*/

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");

            }
            /*System.out.print(arr[row][0] + " ");
            System.out.print(arr[row][1] + " ");
            System.out.print(arr[row][2] + " ");*/
            System.out.println();
        }

        /*System.out.print(arr[0][0] + " ");
        System.out.print(arr[0][1] + " ");
        System.out.print(arr[0][2] + " ");
        System.out.println();
        System.out.print(arr[1][0] + " ");
        System.out.print(arr[1][1] + " ");
        System.out.print(arr[1][2] + " ");
        System.out.println();*/
    }
}
