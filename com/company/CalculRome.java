package com.company;

public class CalculRome {

    String str;
    char a;

public void toConvertAndCount() throws NotRightLongOfStringException, NotCorrectNumberException, DevidedByZeroException, NullPointerException, ArifmeticRomeAndArabException{

    char[]arr=str.toCharArray();

    if(arr.length==1||arr.length==2){
        throw new NotRightLongOfStringException("Введено только одно чило!");
    }

    a=' ';
    for(char i:arr){
        if(i=='+'||i=='*'||i=='-'||i=='/'){
            a=i;
        }
    }

    if(a=='+') {
        String[] b = str.split("\\+");

        if (b.length == 1) {
            throw new NotRightLongOfStringException("Введено только одно чило!");
        } else if (b.length > 2) {
            throw new NotRightLongOfStringException("Введено больше двух чисел!");
        }

        if (b[0].equals("I") || b[0].equals("II") || b[0].equals("III") || b[0].equals("IV") || b[0].equals("V") || b[0].equals("VI") || b[0].equals("VII") || b[0].equals("VIII") || b[0].equals("IX") || b[0].equals("X")
                && b[1].equals("I") || b[1].equals("II") || b[1].equals("III") || b[1].equals("IV") || b[1].equals("V") || b[1].equals("VI") || b[1].equals("VII") || b[1].equals("VIII") || b[1].equals("IX") || b[1].equals("X")) {
            String str1 = b[0];
            String str2 = b[1];
            RomeRes.romResult(str1, str2, a);
        } else if (b[0].equals("1") || b[0].equals("2") || b[0].equals("3") || b[0].equals("4") || b[0].equals("5") || b[0].equals("6") || b[0].equals("7") || b[0].equals("8") || b[0].equals("9") || b[0].equals("10")
                && b[1].equals("1") || b[1].equals("2") || b[1].equals("3") || b[1].equals("4") || b[1].equals("5") || b[1].equals("6") || b[1].equals("7") || b[1].equals("8") || b[1].equals("9") || b[1].equals("10")) {
            CalculatorArab.toCounted(a, str);
        } else if (b[0].equals("0") || b[1].equals("0")) {
            throw new NotCorrectNumberException("Введеное число не удовлетворяет условиям!");
        } else {
            throw new NotCorrectNumberException("Введенный текст не удовлетворяет условиям!!");
        }
    }

    if(a=='-') {
        String[] b = str.split("\\-");

        if (b.length == 1) {
            throw new NotRightLongOfStringException("Введено только одно чило!");
        } else if (b.length > 2) {
            throw new NotRightLongOfStringException("Введено больше двух чисел!");
        }

        if (b[0].equals("I") || b[0].equals("II") || b[0].equals("III") || b[0].equals("IV") || b[0].equals("V") || b[0].equals("VI") || b[0].equals("VII") || b[0].equals("VIII") || b[0].equals("IX") || b[0].equals("X")
                && b[1].equals("I") || b[1].equals("II") || b[1].equals("III") || b[1].equals("IV") || b[1].equals("V") || b[1].equals("VI") || b[1].equals("VII") || b[1].equals("VIII") || b[1].equals("IX") || b[1].equals("X")) {
            String str1 = b[0];
            String str2 = b[1];
            RomeRes.romResult(str1, str2, a);
        } else if (b[0].equals("1") || b[0].equals("2") || b[0].equals("3") || b[0].equals("4") || b[0].equals("5") || b[0].equals("6") || b[0].equals("7") || b[0].equals("8") || b[0].equals("9") || b[0].equals("10")
                && b[1].equals("1") || b[1].equals("2") || b[1].equals("3") || b[1].equals("4") || b[1].equals("5") || b[1].equals("6") || b[1].equals("7") || b[1].equals("8") || b[1].equals("9") || b[1].equals("10")) {
            CalculatorArab.toCounted(a, str);
        } else if (b[0].equals("0") || b[1].equals("0")) {
            throw new NotCorrectNumberException("Введеное число не удовлетворяет условиям!");
        } else {
            throw new NotCorrectNumberException("Введенный текст не удовлетворяет условиям!!");
        }
    }

    if(a=='*') {
        String[] b = str.split("\\*");

        if (b.length == 1) {
            throw new NotRightLongOfStringException("Введено только одно чило!");
        } else if (b.length > 2) {
            throw new NotRightLongOfStringException("Введено больше двух чисел!");
        }

        if (b[0].equals("I") || b[0].equals("II") || b[0].equals("III") || b[0].equals("IV") || b[0].equals("V") || b[0].equals("VI") || b[0].equals("VII") || b[0].equals("VIII") || b[0].equals("IX") || b[0].equals("X")
                && b[1].equals("I") || b[1].equals("II") || b[1].equals("III") || b[1].equals("IV") || b[1].equals("V") || b[1].equals("VI") || b[1].equals("VII") || b[1].equals("VIII") || b[1].equals("IX") || b[1].equals("X")) {
            String str1 = b[0];
            String str2 = b[1];
            RomeRes.romResult(str1, str2, a);
        } else if (b[0].equals("1") || b[0].equals("2") || b[0].equals("3") || b[0].equals("4") || b[0].equals("5") || b[0].equals("6") || b[0].equals("7") || b[0].equals("8") || b[0].equals("9") || b[0].equals("10")
                && b[1].equals("1") || b[1].equals("2") || b[1].equals("3") || b[1].equals("4") || b[1].equals("5") || b[1].equals("6") || b[1].equals("7") || b[1].equals("8") || b[1].equals("9") || b[1].equals("10")) {
            CalculatorArab.toCounted(a, str);
        } else if (b[0].equals("0") || b[1].equals("0")) {
            throw new NotCorrectNumberException("Введеное число не удовлетворяет условиям!");
        } else {
            throw new NotCorrectNumberException("Введенный текст не удовлетворяет условиям!!");
        }
    }

    if(a=='/') {
        String[] b = str.split("\\/");

        if (b.length == 1) {
            throw new NotRightLongOfStringException("Введено только одно чило!");
        } else if (b.length > 2) {
            throw new NotRightLongOfStringException("Введено больше двух чисел!");
        }

        if (b[0].equals("I") || b[0].equals("II") || b[0].equals("III") || b[0].equals("IV") || b[0].equals("V") || b[0].equals("VI") || b[0].equals("VII") || b[0].equals("VIII") || b[0].equals("IX") || b[0].equals("X")
                && b[1].equals("I") || b[1].equals("II") || b[1].equals("III") || b[1].equals("IV") || b[1].equals("V") || b[1].equals("VI") || b[1].equals("VII") || b[1].equals("VIII") || b[1].equals("IX") || b[1].equals("X")) {
            String str1 = b[0];
            String str2 = b[1];
            RomeRes.romResult(str1, str2, a);
        } else if (b[0].equals("1") || b[0].equals("2") || b[0].equals("3") || b[0].equals("4") || b[0].equals("5") || b[0].equals("6") || b[0].equals("7") || b[0].equals("8") || b[0].equals("9") || b[0].equals("10")
                && b[1].equals("1") || b[1].equals("2") || b[1].equals("3") || b[1].equals("4") || b[1].equals("5") || b[1].equals("6") || b[1].equals("7") || b[1].equals("8") || b[1].equals("9") || b[1].equals("10")) {
            CalculatorArab.toCounted(a, str);
        } else if (b[0].equals("0") || b[1].equals("0")) {
            throw new NotCorrectNumberException("Введеное число не удовлетворяет условиям!");
        } else {
            throw new NotCorrectNumberException("Введенный текст не удовлетворяет условиям!!");
        }
    }
    }
}