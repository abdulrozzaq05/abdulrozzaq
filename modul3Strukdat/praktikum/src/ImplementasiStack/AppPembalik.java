package ImplementasiStack;

import java.util.Scanner;

public class AppPembalik {
    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println(">> katanya : ");
            input = scan.nextLine();

            if (input.equals("")) {
                break;
            }

            pembalik balik = new pembalik(input);
            System.out.println(">> dibalik jadi : ");
            System.out.println(balik.hasil());
        }

    }
}
