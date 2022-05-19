package HomeWorkApp;

import java.util.Scanner;

public class lesson2 {

    public static void main(String[] args) {
        //Первое задание
        int firstInt = 5;
        int secondInt = 10;
        checkRangeBoolean(firstInt, secondInt);

        //второе задание
        checkPositive();

        //третье задание
        int Integer = 17;
        checkPositiveBoolean(Integer);

        //четвертое задание
        String stringPrint = "Строка";
        int stringPrintCount = 6;
        printString(stringPrint, stringPrintCount);

        //пятое задание
        int checkYear = 100;
        checkLeapYear(checkYear);
    }


    //1
    private static boolean checkRangeBoolean(int firstInt, int secondInt) {
        if (10 <= (firstInt + secondInt) && (firstInt + secondInt) <= 20) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    //2
    private static void checkPositive() {
        System.out.println("Введите число: ");
        int Int = 5;
        if (Int >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //3
    private static boolean checkPositiveBoolean(int Integer) {
        if (Integer < 0) {
            return true;
        } else {
            return false;
        }
    }

    //4
    private static void printString(String stringPrint, int stringPrintCount) {
        for (int i = 0; i < stringPrintCount; stringPrintCount--) {
            System.out.println(stringPrint);
        }
    }

    //5
    private static boolean checkLeapYear(int checkYear) {
        if (checkYear % 4 == 0 && checkYear % 100 != 0) {
            System.out.println("Год високосный");
            return true;
        } else if (checkYear % 4 == 0 && checkYear % 100 != 0 && checkYear % 400 == 0) {
            System.out.println("Год високосный");
            return true;
        } else {
            System.out.println("Год не високосный");
            return false;
        }

    }


}








