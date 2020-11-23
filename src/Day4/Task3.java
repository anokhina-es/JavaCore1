package Day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random r = new Random();
        int maxSum=0;
        int[][] matrix = new int[12][8];
        System.out.println("Matrix: ");
        for(int i=0; i<matrix.length; i++){
            int sum = 0;
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j]=r.nextInt(50);
                sum+=matrix[i][j];
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
            if(sum>maxSum) {
                maxSum=sum;
            }
        }
        System.out.println();
        System.out.println(maxSum);
    }
}
