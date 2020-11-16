package Day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int i=1;
        while (i<6){
            Double a = n.nextDouble();
            Double b = n.nextDouble();
            i++;
            if(b==0){
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a/b);
        }
    }
}
