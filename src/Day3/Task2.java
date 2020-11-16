package Day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        while (true){
            Double nb1 = n.nextDouble();
            Double nb2 = n.nextDouble();
            if(nb2==0)
               break;
            System.out.println(nb1 / nb2);
        }
    }
}
