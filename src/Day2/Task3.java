package Day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите числа: ");
        int a = s.nextInt();
        int b = s.nextInt();
        if(a<b) {
            int i = a+1;
            while (i<b) {
                if(i>10 && i%5==0 && i%10!=0) {
                    System.out.print(i+" ");
                    i+=1;
                }
            }
        }
        else {
            System.out.println("Некорректный ввод");
        }
    }
}
