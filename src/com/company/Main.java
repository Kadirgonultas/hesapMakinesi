package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n1,n2,select;


        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number");
        n1 = input.nextInt();
        System.out.println("enter the second number");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();

        System.out.println(select);

        System.out.println("result : ");



        switch (select) {
            case 1:
                System.out.println(n1 + n2);
                break;

            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                if (n2 != 0){
                    System.out.println(n1 / n2);
                } else {
                    System.out.println("a number cannot be divided by 0");
                }
                break;
            default:
                System.out.println("invalid number!");
        }





    }
}
