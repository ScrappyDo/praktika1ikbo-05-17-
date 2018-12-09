

import java.util.Scanner;

public class Main {

    static int Recursion (int n)
    {
        for (int i = 1; i <= n; i++)
            System.out.println(i);
        return 0;
    }

    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = ch.nextInt();
        Recursion(num);
    }
}