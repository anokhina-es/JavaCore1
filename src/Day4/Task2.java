package Day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random r = new Random();
        int max = 0;
        int min = 10000;
        int count = 0;
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextInt(10000);
            //if(arr[i]>k) k = arr[i];
        }
        for(int x: arr){
            if(x>max) max = x;
            if(x<min) min = x;
            if(x%10==0) {
                count+=1;
                sum+=x;
            }
        }
        System.out.println("Наибольший элемент массива: "+max);
        System.out.println("Наименьший элемент массива: "+min);
        System.out.println(count);
        System.out.println(sum);
    }
}
