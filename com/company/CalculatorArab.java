package com.company;

public class CalculatorArab {

public static void toCounted(char a, String str) throws NotCorrectNumberException, DevidedByZeroException, NotRightLongOfStringException{

        char[] arr = str.toCharArray();

        if (arr.length==1 || arr.length==2){
            throw new NotRightLongOfStringException("Введено только одно чило!");
        }

        a = ' ';
        for (char i : arr) {
            if (i == '+' || i == '*' || i == '-' || i == '/') {
                a = i;
            }
        }
            if (a == '+') {
                String[] b = str.split("\\+");

                    if (b.length>2){
                    throw new NotRightLongOfStringException("Введено больше двух чисел!");
                }
                    int var1 = Integer.parseInt(b[0]);
                    int var2 = Integer.parseInt(b[1]);

                    if (var1 > 0 && var1 <= 10 && var2 > 0 && var2 <= 10) {
                        System.out.println(ArabRes.sum(var1, var2));
                    } else {
                        throw new NotCorrectNumberException("Введеное число не удовлетворяет условиям!");
                    }
                }
            if (a == '-') {
                String[] b = str.split("\\-");

                if (b.length>2){
                    throw new NotRightLongOfStringException("Введено больше двух чисел!");
                }

                int var1 = Integer.parseInt(b[0]);
                int var2 = Integer.parseInt(b[1]);

                if (var1==0 || var2==0){
                    throw new NotCorrectNumberException("Введеное число не удовлетворяет условиям!");
                }

                if (var1 > 0 && var1 <= 10 && var2 > 0 && var2 <= 10) {
                    System.out.println(ArabRes.minus(var1, var2));
                } else {
                    throw new NotCorrectNumberException("Введеное число не удовлетворяет условиям!");
                }
            }
            if (a == '*') {
                String[] b = str.split("\\*");

                if (b.length>2){
                    throw new NotRightLongOfStringException("Введено больше двух чисел!");
                }

                int var1 = Integer.parseInt(b[0]);
                int var2 = Integer.parseInt(b[1]);
                if (var1 > 0 && var1 <= 10 && var2 > 0 && var2 <= 10) {
                    System.out.println(ArabRes.multy(var1, var2));
                } else {
                    throw new NotCorrectNumberException("Введеное число не удовлетворяет условиям!");
                }
            }
            if (a == '/') {
                String[] b = str.split("\\/");

                if (b.length>2){
                    throw new NotRightLongOfStringException("Введено больше двух чисел!");
                }

                int var1 = Integer.parseInt(b[0]);
                int var2 = Integer.parseInt(b[1]);

                if(var2 != 0) {
                    if (var1 > 0 && var1 <= 10 && var2 > 0 && var2 <= 10) {
                        System.out.println(ArabRes.dev(var1, var2));
                    } else {
                        throw new NotCorrectNumberException("Введеное число не удовлетворяет условиям!");
                    }
                } else {
                    throw new DevidedByZeroException("Деление на ноль запрещено!"+"\n"+"com.company.NotCorrectNumberException: Введеное число не удовлетворяет условиям!");
                }
            }
    }
}