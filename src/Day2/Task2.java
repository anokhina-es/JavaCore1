package Day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите числа: ");
        int a = s.nextInt();
        int b = s.nextInt();
        if(a<b) {
            for (int i = a + 1;i<b;i++) {
                if(i>10 && i%5==0 && i%10!=0) {
                    System.out.print(i+" ");
                }
            }
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}
