package myswitch;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "Apple":
                System.out.println("a sweet red fruit");
                break;
            case "orange":
                System.out.println("Round fruit");
                break;
            default:
                System.out.println("please enter a valid fruit");
                break;
        }
    }
}