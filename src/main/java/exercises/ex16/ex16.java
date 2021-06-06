package exercises.ex16;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex16 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex16 example16 = new ex16();

        String age = example16.ageInput();

        int ageNum = example16.ageNum(age);
        String compare = example16.ageCompare(ageNum);

        example16.printOutput(compare);
    }

    private void printOutput(String compare) {
        System.out.print(compare);
    }

    private String ageCompare(int ageNum) {
        String result = (ageNum >= 16) ? "You are old enough to legally drive.": "You are not old enough to legally drive.";
        return result;
    }

    private int ageNum(String age) {
        return Integer.parseInt(age);
    }

    private String ageInput() {
        System.out.print("What is your age? ");
        String age = in.nextLine();
        return age;
    }
}
