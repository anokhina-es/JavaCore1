package Day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int arr[]= new int[100];
        Random r = new Random();
        int sum=0;
        int maxSum=0;
        int maxSumIndex=0;
        int a=0;
        int b=0;
        int c=0;

        for(int i=0; i<arr.length; i++){
            arr[i]=r.nextInt(10000);
        }
        for(int i=2; i<arr.length; i++){
            sum=arr[i]+arr[i-1]+arr[i-2];
            if(sum>maxSum) {
                maxSum=sum;
                maxSumIndex = i-2;
                a=arr[i-2];
                b=arr[i-1];
                c=arr[i];
            }
        }
        System.out.println("["+a+", "+b+", "+c+"]");
        System.out.println(maxSum);
        System.out.println(maxSumIndex);
    }
}
