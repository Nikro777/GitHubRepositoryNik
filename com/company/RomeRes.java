package com.company;

public class RomeRes {

    public static void romResult(String str1, String str2, Character a) throws  NotCorrectNumberException, NotRightLongOfStringException, ArifmeticRomeAndArabException{

        String rom1 = null;
        String rom2 = null;

        if (str1.equals("I") || str1.equals("II") || str1.equals("III") || str1.equals("IV") || str1.equals("V") || str1.equals("VI") || str1.equals("VII") || str1.equals("VIII") || str1.equals("IX") || str1.equals("X")) {
            rom1 = str1;
        } else {
            throw new NotCorrectNumberException("Введенный текст не удовлетворяет условиям!");

        }
        if (str2.equals("I") || str2.equals("II") || str2.equals("III") || str2.equals("IV") || str2.equals("V") || str2.equals("VI") || str2.equals("VII") || str2.equals("VIII") || str2.equals("IX") || str2.equals("X")) {
            rom2 = str2;
        } else {
            throw new NotCorrectNumberException("Введенный текст не удовлетворяет условиям!");
        }

        if (rom1 == null || rom2 == null) {
            throw new NotRightLongOfStringException("Введено только одно чило!");
        }

        if (rom1.equals("1") || rom1.equals("2") || rom1.equals("3") || rom1.equals("4") || rom1.equals("5") || rom1.equals("6") || rom1.equals("7") || rom1.equals("8") || rom1.equals("9") || rom1.equals("10")) {
            throw new NullPointerException("Введенный текст не удовлетворяет условиям!");

        }
        if (rom2.equals("1") || rom2.equals("2") || rom2.equals("3") || rom2.equals("4") || rom2.equals("5") || rom2.equals("6") || rom2.equals("7") || rom2.equals("8") || rom2.equals("9") || rom2.equals("10")) {
            throw new NullPointerException("Введенный текст не удовлетворяет условиям!");
        }

        if (a=='+') {
            toResultPlus(rom1, rom2);
        }
        if (a=='-') {
            toResultMinus(rom1, rom2);
        }
        if (a=='*') {
            toResultMulty(rom1, rom2);
        }
        if (a=='/') {
            toResultDev(rom1, rom2);
        }
    }

        public static void toResultPlus(String rom1, String rom2) {

        int toRom1 = 0;
        int toRom2 = 0;

            String[] roms = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
     "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX",
     "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI",
     "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
     "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCIIб", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"} ;


        for(int i=0; i<roms.length; i++){

            if (rom1.equals(roms[i])){
                toRom1 = i+1;
            }
        }
            for(int i=0; i<roms.length; i++){

                if (rom2.equals(roms[i])){
                    toRom2 = i+1;
                }
            }
int arabSum = toRom1+toRom2;

            System.out.println(roms[arabSum-1]);
        }

    public static void toResultMinus(String rom1, String rom2) throws ArifmeticRomeAndArabException{

        int toRom1 = 0;
        int toRom2 = 0;

        String[] roms = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX",
                "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI",
                "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCIIб", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"} ;


        for(int i=0; i<roms.length; i++){

            if (rom1.equals(roms[i])){
                toRom1 = i+1;
            }
        }
        for(int i=0; i<roms.length; i++){

            if (rom2.equals(roms[i])){
                toRom2 = i+1;
            }
        }
        int arabMinus = toRom1-toRom2;

        if(arabMinus<=0){
            throw new ArifmeticRomeAndArabException("Ошибка: в римских числах нет 0 и отрицательных чисел!");
        }

        System.out.println(roms[arabMinus-1]);
    }

    public static void toResultMulty(String rom1, String rom2) {

        int toRom1 = 0;
        int toRom2 = 0;

        String[] roms = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX",
                "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI",
                "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCIIб", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"} ;


        for(int i=0; i<roms.length; i++){

            if (rom1.equals(roms[i])){
                toRom1 = i+1;
            }
        }
        for(int i=0; i<roms.length; i++){

            if (rom2.equals(roms[i])){
                toRom2 = i+1;
            }
        }
        int arabMulty = toRom1*toRom2;

        System.out.println(roms[arabMulty-1]);
    }

    public static void toResultDev(String rom1, String rom2) {

        int toRom1 = 0;
        int toRom2 = 0;

        String[] roms = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX",
                "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI",
                "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCIIб", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"} ;


        for(int i=0; i<roms.length; i++){

            if (rom1.equals(roms[i])){
                toRom1 = i+1;
            }
        }
        for(int i=0; i<roms.length; i++){

            if (rom2.equals(roms[i])){
                toRom2 = i+1;
            }
        }
        int arabDev = toRom1/toRom2;

        System.out.println(roms[arabDev-1]);
    }
        }