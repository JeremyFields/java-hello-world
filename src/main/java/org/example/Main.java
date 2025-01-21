package org.example;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter integer 1: ");
        int first = Integer.parseInt(scan.nextLine());

        System.out.print("Enter integer 2: ");
        int second = Integer.parseInt(scan.nextLine());

        if (first > second ){
            System.out.println(first + " is greater than " + second);
        } else if (first < second){
            System.out.println(first + " is less than " + second);
        } else {
            System.out.println(first + " is equal to " + second);
        }
    }
}