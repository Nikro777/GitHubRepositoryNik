package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader numb = new BufferedReader(new InputStreamReader(System.in));

        CalculRome calculRome = new CalculRome();

        while (true) {

            String text = numb.readLine();

            try {
                calculRome.str = text;
                calculRome.toConvertAndCount();

            } catch (NotCorrectNumberException e) {
                System.err.println(e);
                return;
            } catch (DevidedByZeroException e) {
                System.err.println(e);
                return;
            } catch (NotRightLongOfStringException e) {
                System.err.println(e);
                return;
            } catch (NullPointerException e) {
                System.err.println(e);
                return;
            } catch (ArifmeticRomeAndArabException e){
                System.err.println(e);
                return;
            }
            catch (ArithmeticException e) {
                System.err.println(e + " Арифметическая ошибка!");
                return;
            } catch (NumberFormatException e) {
            System.err.println(e + " Введеные данные не соответствуют формату!");
           return;
      }
}
    }
}