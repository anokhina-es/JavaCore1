package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];
        int a=0, b=0, c=0, d=0, sum = 0;
        int k=0;
        Random r = new Random();

        for(int i=0;i<n;i++){
            array[i]= r.nextInt(10);
            k=array[i];
            sum+=k;
            if(k%2==0) {
                a+=1;
            }
            else{
                b+=1;
            }
            if(k>8) c+=1;
            if (k==1) d+=1;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива:"+ array.length);
        System.out.println("Количество чисел больше 8:"+ c);
        System.out.println("Количество чисел равных 1:"+ d);
        System.out.println("Количество четных чисел:"+ a);
        System.out.println("Количество нечетных чисел:"+ b);
        System.out.println("Сумма всех элементов массива:"+ sum);
    }
}
