package aston.task1;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a < b) {
            System.out.println("a < b");
        }
        if (a > b) {
            System.out.println("a > b");
        }
        if (a == b) {
            System.out.println("a = b");
        }
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if (b == 0){
            System.out.println("a / b = not a number");
        }else{
            System.out.println("a / b = " + (a / b));
        }
    }
}
