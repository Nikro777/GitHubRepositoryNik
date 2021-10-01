package com.company;

public class ArabRes {

        public static int sum(int var1, int var2) throws NotCorrectNumberException{

            return (var1 + var2);
        }

        public static int minus(int var1, int var2) throws NotCorrectNumberException {

            if (var1 == 0 || var2 == 0) {
                throw new NotCorrectNumberException("Введеное число не удовлетворяет условиям!");
            } else {

                return (var1 - var2);
            }
        }

        public static int multy(int var1, int var2) {

            return (var1 * var2);
        }

        public static int dev(int var1, int var2) {

            return (var1 / var2);
        }
    }