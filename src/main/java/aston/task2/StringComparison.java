package aston.task2;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();

        if (s1.length() != s2.length()){
            System.out.println("Строки неидентичны");
        }else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    System.out.println("Строки неидентичны");
                    return;
                }
            }
            System.out.println("Строки идентичны");

        }
    }
}
